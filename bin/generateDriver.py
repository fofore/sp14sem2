import os
import sys

class_name = sys.argv[1]
method_name = sys.argv[2]
driver_file_stream = open(class_name+"Driver.java", 'w')
driver_file_stream.truncate() #clear the file every time
numOfInputs = int(sys.argv[3])
input_type = [sys.argv[i+3] for i in xrange(1,numOfInputs+1)]
output_type = sys.argv[3+numOfInputs+1] 

def debug():
	global class_name
	global method_name
	global driver_file_stream
	global numOfInputs
	global input_type
	global output_type
	print class_name
	print '\n'
	print method_name
	print '\n'
	print driver_file_stream
	print '\n'
	print numOfInputs
	print '\n'
	print input_type
	print '\n'
	print output_type
	print '\n'

def readDataAgain(data):
	global splitChar
	for line in data:
		change = True;
		linelist = list(line[0])
		#print linelist
		#print line[0]
		counter = 0
		for char in linelist:
			if char == "{":
				change = False;
			if char == "}":
				change = True;
			if char == "," and change == True:
				linelist[counter] = splitChar 
			counter += 1
		line[0] = ''.join(linelist)
		print line
	return data;

def readData():
	'''
	filter the verify data from topcoder, return the list with [input, output]
	'''
	with open(class_name+".txt", 'r') as f:
		data = [map(str, line.split('\t')) for line in f]

	data2 = []
	for line in data:
		line = [item for item in line if(item is not '' and item != '\n' and item != 'Passed')]
		data2.append(line)

	data2 = [line for line in data2 if line]

	return data2

def buildSection(counter, input_type, input, output_type, output):
	global method_name
	global class_name
	global numOfInputs
	section = ''
	section += 'counter ++;\n'
	section += buildVarSection(counter, input_type, input)
	section += output_type + ' out' + str(counter) + ' = ' + output + ';\n'
	section += 'System.out.println("testing with input: ");\n'
	inString = ''
	inPrint = ''
	for x in xrange(0, numOfInputs):
		inString += 'in%d%d'%(counter, x)
		inPrint += 'in%d%d'%(counter, x)
		if x == numOfInputs - 1:
			continue	
		inString += ', '
		inPrint += ' + '
	#need one line to print intput, there is no one all useful method
	#section += 'System.out.println(%s);\n'%inPrint
	section += 'test = new %s();\n'%class_name

	section += 'tmpVal = test.%s(%s);\n'%(method_name, inString)
	section += 'System.out.println("Output expected: " + out%d + " Output recieved: " + tmpVal );\n'%counter
	if output_type == "String" :
		section += 'result = tmpVal.equals(out%d);\n'%counter
	elif output_type  == "String[]":
		section +=  'result = Arrays.equals(tmpVal, out%d);\n'%counter
	else:
		section += 'result = tmpVal == out%d;\n'%counter
	section += 'if (result) { mark++;}\n'
	section += 'else{System.out.println("failed test");\n'
	section += 'System.out.println("total_marks: " + mark);\n'
	section += 'System.out.println("out_of: " + counter);\n'
	section += 'return;}\n'
	#print section
	return section

def buildHead():
	global class_name
	section = "import java.util.*;\n"
	section += '\n'
	section += 'public class %sDriver {\n'%class_name
	section += 'public static void main(String [] args){\n'
	section += '%s test;\n'%class_name
   	section += 'int mark = 0;\n'
   	section += 'int counter = 0;\n'
   	global output_type
   	section += '%s tmpVal;\n'%output_type
   	section += 'boolean result;\n'
	return section

def buildEnd():
	section = ''
	section += 'System.out.println("total_marks: " + mark);\n'
 	section += 'System.out.println("out_of: " + counter);\n'
 	section += '    }\n'
 	section += '}\n'
 	return section

def buildWhole(data, numOfInputs, typeOfInput, typeOfOutput):
	section = ''
	section += buildHead()
	counter = 0
	for line in data:
		section += buildSection(counter, typeOfInput, line[0], typeOfOutput, line[1])
		counter += 1
	section += buildEnd()
	print section
	global driver_file_stream
	driver_file_stream.write(section)
	driver_file_stream.close

def buildVarSection(counter, typeOfInput, inputString):
	section = '' 
	global numOfInputs
	global splitChar
	if numOfInputs != 1:
		#here to input the costomer split charactor.
			#print splitChar + 'here is me'
		inputList = [x.strip() for x in inputString.split(splitChar)]
	else:
		section = typeOfInput[0] + ' in' + str(counter) + '0'  + ' = ' + inputString + ';\n';
		return section
	##print typeOfInput
	##print inputList
	intput_counter = 0;
	for theType in typeOfInput:
		section += theType + ' in' + str(counter) + str(intput_counter) + ' = ' + inputList[intput_counter] + ';\n';
		intput_counter += 1
	return section


debug()
data = readData()
if numOfInputs != 1:
	splitChar = ','
	if len(sys.argv) > 3+numOfInputs+1+1:
		splitChar = sys.argv[3+numOfInputs+1+1]
		data = readDataAgain(data)
buildWhole(data, numOfInputs, input_type, output_type)
