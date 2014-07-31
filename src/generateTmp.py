import sys

class_name = sys.argv[1]
driver_file_stream = open(class_name+".java", 'w')
driver_file_stream.truncate() #clear the file every time

def readData():
	'''
	filter the verify data from topcoder, return the list with [input, output]
	'''
	with open(class_name+"Pro.txt", 'r') as f:
		data = [map(str, line.split('\t')) for line in f]

	data2 = []
	for line in data:
		line = [item for item in line if(item is not '' and item != '\n' and item != 'Passed')]
		#remove /n from the string fo classes and method
		data2.append(line)

	data2 = [line for line in data2 if line]

	return data2

def generateTmp(data):
	codelineEnd = ''
	codeline = ''
	dataindex = 0
	testNum = 0
	testcase = ''
	methodName = ''
	lines =[]
	for line in data:
		#print line
		if 'Parameters:' in line[0]:
			paralist = getParaTypes(line[1])
		if 'Class:' in line[0]:
			line[1] = line[1].translate(None, '\n')
			codeline += '\npublic class %s {\n'%(line[1])
			codeline += '    public static void main (String[] args) {\n'
			codelineMainEnd = '\n    }\n\n'
			codelineEnd += '}\n'
		if "Method:" in line[0]:
			methodName = line[1].translate(None, '\n') 
		if "Method signature:" in line[0]:
			method = line[1].translate(None, '\n')
			methodline = '    public static %s {\n'%method
			methodline += '\n    }\n'
		if "Returns:" in line[0] and "Param" not in data[dataindex - 1][0]:
			for x in xrange(0, len(paralist) + 1):
				lines.append(data[dataindex - len(paralist) + x ])
			testcase += buildTestCase(lines, paralist, testNum, methodName)
			testNum += 1;
			lines = []
		dataindex += 1;


	codeline += testcase
	codeline += codelineMainEnd
	codeline += methodline
	codeline += codelineEnd
	print codeline

	global driver_file_stream
	driver_file_stream.write(codeline)
	driver_file_stream.close

def buildTestCase(lines, paralist, testNum, method):
	section = '\n'
	space8 = '        '
	counter = 0;
	paralist[-1] = paralist[-1].translate(None, '\n')
	inputlist = []
	for x in xrange(1,len(paralist)):
		paralist[x] = paralist[x].translate(None, ' ')
	for line in lines:
		line[0] = line[0].translate(None, '\n')
	for para in paralist:
		section += '%s%s in%d%d = %s;\n'%(space8, para, testNum, counter, lines[counter][0])
		inputlist.append("in%d%d"%(testNum, counter))
		counter += 1;
	section += '%sSystem.out.println(%s(%s));\n'%(space8, method, ','.join(inputlist))
	return section

def getParaTypes(paraline):
	paraline = paraline.translate(None, '\n')
	paralist = paraline.split(',')
	print paralist
	return paralist


data = readData()
generateTmp(data)

