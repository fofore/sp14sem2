import java.util.*;

public class ProblemsToSolveDriver {
public static void main(String [] args){
ProblemsToSolve test;
int mark = 0;
int counter = 0;
int tmpVal;
boolean result;
counter ++;
int[] in00 = {1, 2, 3};
int in01 = 2;
int out0 = 2;
System.out.println("testing with input: ");
test = new ProblemsToSolve();
tmpVal = test.minNumber(in00, in01);
System.out.println("Output expected: " + out0 + " Output recieved: " + tmpVal );
result = tmpVal == out0;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in10 = {1, 2, 3, 4, 5};
int in11 = 4;
int out1 = 3;
System.out.println("testing with input: ");
test = new ProblemsToSolve();
tmpVal = test.minNumber(in10, in11);
System.out.println("Output expected: " + out1 + " Output recieved: " + tmpVal );
result = tmpVal == out1;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in20 = {10, 1, 12, 101};
int in21 = 100;
int out2 = 3;
System.out.println("testing with input: ");
test = new ProblemsToSolve();
tmpVal = test.minNumber(in20, in21);
System.out.println("Output expected: " + out2 + " Output recieved: " + tmpVal );
result = tmpVal == out2;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
int[] in30 = {10, 1};
int in31 = 9;
int out3 = 2;
System.out.println("testing with input: ");
test = new ProblemsToSolve();
tmpVal = test.minNumber(in30, in31);
System.out.println("Output expected: " + out3 + " Output recieved: " + tmpVal );
result = tmpVal == out3;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
}
}
