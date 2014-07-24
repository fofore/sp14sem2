public class ChangingStringDriver {
public static void main(String [] args){
ChangingString test;
int mark = 0;
int counter = 0;
int tmpVal;
boolean result;
counter ++;
String in00 = "ab";
String in01 = "ba";
int in02 = 2;
int out0 = 0;
System.out.println("testing with input: ");
test = new ChangingString();
tmpVal = test.distance(in00, in01, in02);
System.out.println("Output expected: " + out0 + " Output recieved: " + tmpVal );
result = tmpVal == out0;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in10 = "aa";
String in11 = "aa";
int in12 = 2;
int out1 = 2;
System.out.println("testing with input: ");
test = new ChangingString();
tmpVal = test.distance(in10, in11, in12);
System.out.println("Output expected: " + out1 + " Output recieved: " + tmpVal );
result = tmpVal == out1;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in20 = "aaa";
String in21 = "baz";
int in22 = 1;
int out2 = 1;
System.out.println("testing with input: ");
test = new ChangingString();
tmpVal = test.distance(in20, in21, in22);
System.out.println("Output expected: " + out2 + " Output recieved: " + tmpVal );
result = tmpVal == out2;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in30 = "fdfdfdfdfdsfabasd";
String in31 = "jhlakfjdklsakdjfk";
int in32 = 8;
int out3 = 24;
System.out.println("testing with input: ");
test = new ChangingString();
tmpVal = test.distance(in30, in31, in32);
System.out.println("Output expected: " + out3 + " Output recieved: " + tmpVal );
result = tmpVal == out3;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in40 = "aa";
String in41 = "bb";
int in42 = 2;
int out4 = 0;
System.out.println("testing with input: ");
test = new ChangingString();
tmpVal = test.distance(in40, in41, in42);
System.out.println("Output expected: " + out4 + " Output recieved: " + tmpVal );
result = tmpVal == out4;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in50 = "xuhpjidxepnmkllyqewfypbicxwhosihrjeqmolcchyqfaoof";
String in51 = "cukbhecbdllpmpfmaxjkindzggjgiazmvcqpfbchfqhtxshmx";
int in52 = 32;
int out5 = 36;
System.out.println("testing with input: ");
test = new ChangingString();
tmpVal = test.distance(in50, in51, in52);
System.out.println("Output expected: " + out5 + " Output recieved: " + tmpVal );
result = tmpVal == out5;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in60 = "cjvdejraxtpvv";
String in61 = "pdqbwxbihxnmu";
int in62 = 11;
int out6 = 3;
System.out.println("testing with input: ");
test = new ChangingString();
tmpVal = test.distance(in60, in61, in62);
System.out.println("Output expected: " + out6 + " Output recieved: " + tmpVal );
result = tmpVal == out6;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in70 = "rruktgimfhtucub";
String in71 = "phdyzkmmodrdypj";
int in72 = 13;
int out7 = 2;
System.out.println("testing with input: ");
test = new ChangingString();
tmpVal = test.distance(in70, in71, in72);
System.out.println("Output expected: " + out7 + " Output recieved: " + tmpVal );
result = tmpVal == out7;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in80 = "gctetkofsogbaowrote";
String in81 = "nypcvhpwgtgdxzjyyus";
int in82 = 13;
int out8 = 8;
System.out.println("testing with input: ");
test = new ChangingString();
tmpVal = test.distance(in80, in81, in82);
System.out.println("Output expected: " + out8 + " Output recieved: " + tmpVal );
result = tmpVal == out8;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in90 = "cjviumyluukooirqpmiwfuicakgrvvrxmtavbnoo";
String in91 = "hrslxpnknejtdxwtqoaexsegcqzsccitfonlpxej";
int in92 = 31;
int out9 = 16;
System.out.println("testing with input: ");
test = new ChangingString();
tmpVal = test.distance(in90, in91, in92);
System.out.println("Output expected: " + out9 + " Output recieved: " + tmpVal );
result = tmpVal == out9;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in100 = "qbpufutmanhkfdspzfxqqygygetufqhuzum";
String in101 = "zpmlodywiqhsahydcqligquutydgrzjamec";
int in102 = 11;
int out10 = 177;
System.out.println("testing with input: ");
test = new ChangingString();
tmpVal = test.distance(in100, in101, in102);
System.out.println("Output expected: " + out10 + " Output recieved: " + tmpVal );
result = tmpVal == out10;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in110 = "komxbzwuntbdeyaqkdlovctdmvjmkejaekqcykwlvbrnckxee";
String in111 = "fmomwhuoobnmspacwadtyeuqdtbeksabuxgtojkwpjdevhodg";
int in112 = 20;
int out11 = 125;
System.out.println("testing with input: ");
test = new ChangingString();
tmpVal = test.distance(in110, in111, in112);
System.out.println("Output expected: " + out11 + " Output recieved: " + tmpVal );
result = tmpVal == out11;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in120 = "bchxsxqdfsrqargrnumqgnsbunkggpkwmgladjcsvq";
String in121 = "ebkbqacubfjyryouyhtgzzsmbfcdbocthqekneefll";
int in122 = 30;
int out12 = 30;
System.out.println("testing with input: ");
test = new ChangingString();
tmpVal = test.distance(in120, in121, in122);
System.out.println("Output expected: " + out12 + " Output recieved: " + tmpVal );
result = tmpVal == out12;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in130 = "ixsxbupspgfht";
String in131 = "ebvjcpcwjaudy";
int in132 = 7;
int out13 = 21;
System.out.println("testing with input: ");
test = new ChangingString();
tmpVal = test.distance(in130, in131, in132);
System.out.println("Output expected: " + out13 + " Output recieved: " + tmpVal );
result = tmpVal == out13;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in140 = "boxacdyvwdrnzchsdfdvskebolpdbhvjjtwzumng";
String in141 = "dplbqhkdjoeuksvgplarcorrddszibxejjilkxwa";
int in142 = 10;
int out14 = 220;
System.out.println("testing with input: ");
test = new ChangingString();
tmpVal = test.distance(in140, in141, in142);
System.out.println("Output expected: " + out14 + " Output recieved: " + tmpVal );
result = tmpVal == out14;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in150 = "fyxlulzv";
String in151 = "cqjrjhca";
int in152 = 2;
int out15 = 46;
System.out.println("testing with input: ");
test = new ChangingString();
tmpVal = test.distance(in150, in151, in152);
System.out.println("Output expected: " + out15 + " Output recieved: " + tmpVal );
result = tmpVal == out15;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in160 = "ricmkdaqatyykbxebbrppckrcpgsqihjikkpmqrjzggjjcczii";
String in161 = "qrjysnugfqepyaxcvntutexfmzivjpwbdtkdnuuhxeykmhtbao";
int in162 = 34;
int out16 = 27;
System.out.println("testing with input: ");
test = new ChangingString();
tmpVal = test.distance(in160, in161, in162);
System.out.println("Output expected: " + out16 + " Output recieved: " + tmpVal );
result = tmpVal == out16;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in170 = "mtphpjfablhhmpiaueemafwdkmlvpxjppz";
String in171 = "olnowgriiveqnfejrgphrcalmpoqhiszao";
int in172 = 11;
int out17 = 112;
System.out.println("testing with input: ");
test = new ChangingString();
tmpVal = test.distance(in170, in171, in172);
System.out.println("Output expected: " + out17 + " Output recieved: " + tmpVal );
result = tmpVal == out17;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in180 = "fbs";
String in181 = "wns";
int in182 = 3;
int out18 = 1;
System.out.println("testing with input: ");
test = new ChangingString();
tmpVal = test.distance(in180, in181, in182);
System.out.println("Output expected: " + out18 + " Output recieved: " + tmpVal );
result = tmpVal == out18;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in190 = "uhufgdqwxedbmattu";
String in191 = "vqxmywvxophecljne";
int in192 = 8;
int out19 = 39;
System.out.println("testing with input: ");
test = new ChangingString();
tmpVal = test.distance(in190, in191, in192);
System.out.println("Output expected: " + out19 + " Output recieved: " + tmpVal );
result = tmpVal == out19;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in200 = "qjumutuzhputgkgtztfumkdoowdkeoknjhummwultpngxrnyi";
String in201 = "qldhneykwjcblpevqsdxdkghpnssyyzdaiyqffpavhjyjfmzt";
int in202 = 14;
int out20 = 167;
System.out.println("testing with input: ");
test = new ChangingString();
tmpVal = test.distance(in200, in201, in202);
System.out.println("Output expected: " + out20 + " Output recieved: " + tmpVal );
result = tmpVal == out20;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in210 = "wweqzsuthwzmkcsvtslfbphvgnzcdbqigrngdxqpetjg";
String in211 = "vmoazgsponlpkhjwxhhuaekhybdctzbixxxwmhvwixbg";
int in212 = 34;
int out21 = 8;
System.out.println("testing with input: ");
test = new ChangingString();
tmpVal = test.distance(in210, in211, in212);
System.out.println("Output expected: " + out21 + " Output recieved: " + tmpVal );
result = tmpVal == out21;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in220 = "kztqosdnchhfhpvowcqowoyxyiqkjijmx";
String in221 = "xosplcwspdaryewfogeznvgluecqjujdc";
int in222 = 11;
int out22 = 127;
System.out.println("testing with input: ");
test = new ChangingString();
tmpVal = test.distance(in220, in221, in222);
System.out.println("Output expected: " + out22 + " Output recieved: " + tmpVal );
result = tmpVal == out22;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in230 = "mrqvhhtztnwqqnmpvytabfkciikqfyfmwkcovxjprmqasa";
String in231 = "vhmtvktxhjbrwbgjykxzmgxrfelqgxdhqdwsyvpzbcyylp";
int in232 = 2;
int out23 = 304;
System.out.println("testing with input: ");
test = new ChangingString();
tmpVal = test.distance(in230, in231, in232);
System.out.println("Output expected: " + out23 + " Output recieved: " + tmpVal );
result = tmpVal == out23;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in240 = "jodxanidmdfo";
String in241 = "uunxmclmqfmt";
int in242 = 9;
int out24 = 5;
System.out.println("testing with input: ");
test = new ChangingString();
tmpVal = test.distance(in240, in241, in242);
System.out.println("Output expected: " + out24 + " Output recieved: " + tmpVal );
result = tmpVal == out24;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in250 = "pqlclarsgdeisrgjjpkgmlauurggtqcjeqqgoorigoi";
String in251 = "mhhkhgichkagkfclddhccdbhkekgcmnejjnlggankmk";
int in252 = 4;
int out25 = 223;
System.out.println("testing with input: ");
test = new ChangingString();
tmpVal = test.distance(in250, in251, in252);
System.out.println("Output expected: " + out25 + " Output recieved: " + tmpVal );
result = tmpVal == out25;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in260 = "ndkbmaolmfdccmbjeojjdmfjjdlbddglffeheldcjhh";
String in261 = "pgcouhjstqdudaglhcuobtfgrdspeuiceakrdmnkshp";
int in262 = 29;
int out26 = 16;
System.out.println("testing with input: ");
test = new ChangingString();
tmpVal = test.distance(in260, in261, in262);
System.out.println("Output expected: " + out26 + " Output recieved: " + tmpVal );
result = tmpVal == out26;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in270 = "defedbbefdbeadcfbeaefdbfbe";
String in271 = "aachhjdjackahjjbhjedcjjhgk";
int in272 = 1;
int out27 = 112;
System.out.println("testing with input: ");
test = new ChangingString();
tmpVal = test.distance(in270, in271, in272);
System.out.println("Output expected: " + out27 + " Output recieved: " + tmpVal );
result = tmpVal == out27;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in280 = "cefeaacbdcaabeceaebcdcbbbadccaaaceb";
String in281 = "aqomghqncgljlikfkoaanbcfomhkeblfoln";
int in282 = 15;
int out28 = 77;
System.out.println("testing with input: ");
test = new ChangingString();
tmpVal = test.distance(in280, in281, in282);
System.out.println("Output expected: " + out28 + " Output recieved: " + tmpVal );
result = tmpVal == out28;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in290 = "fjdkhkhriceeocckdlneloccrrakkn";
String in291 = "wtfckfvzhnzswyfyoaptbyusuottzj";
int in292 = 25;
int out29 = 11;
System.out.println("testing with input: ");
test = new ChangingString();
tmpVal = test.distance(in290, in291, in292);
System.out.println("Output expected: " + out29 + " Output recieved: " + tmpVal );
result = tmpVal == out29;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in300 = "nwjerwycjbllvjfsgn";
String in301 = "afacefceabeffebbag";
int in302 = 11;
int out30 = 25;
System.out.println("testing with input: ");
test = new ChangingString();
tmpVal = test.distance(in300, in301, in302);
System.out.println("Output expected: " + out30 + " Output recieved: " + tmpVal );
result = tmpVal == out30;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in310 = "cndfnngcghgfebldfkeddhklec";
String in311 = "cdaabbbbddbdbbcccdbbcbdbad";
int in312 = 19;
int out31 = 6;
System.out.println("testing with input: ");
test = new ChangingString();
tmpVal = test.distance(in310, in311, in312);
System.out.println("Output expected: " + out31 + " Output recieved: " + tmpVal );
result = tmpVal == out31;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in320 = "coaolicefhaiglboh";
String in321 = "abaabbbabbbbababa";
int in322 = 1;
int out32 = 92;
System.out.println("testing with input: ");
test = new ChangingString();
tmpVal = test.distance(in320, in321, in322);
System.out.println("Output expected: " + out32 + " Output recieved: " + tmpVal );
result = tmpVal == out32;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in330 = "dqlalimglockrhmimmmqhldfsn";
String in331 = "fblpnqgrfsrlwehhcbukadgxfb";
int in332 = 16;
int out33 = 26;
System.out.println("testing with input: ");
test = new ChangingString();
tmpVal = test.distance(in330, in331, in332);
System.out.println("Output expected: " + out33 + " Output recieved: " + tmpVal );
result = tmpVal == out33;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in340 = "iag";
String in341 = "edc";
int in342 = 2;
int out34 = 3;
System.out.println("testing with input: ");
test = new ChangingString();
tmpVal = test.distance(in340, in341, in342);
System.out.println("Output expected: " + out34 + " Output recieved: " + tmpVal );
result = tmpVal == out34;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in350 = "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa";
String in351 = "bbbabbbbabbbaabaaaabbbbaabaabba";
int in352 = 1;
int out35 = 17;
System.out.println("testing with input: ");
test = new ChangingString();
tmpVal = test.distance(in350, in351, in352);
System.out.println("Output expected: " + out35 + " Output recieved: " + tmpVal );
result = tmpVal == out35;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in360 = "gebdcedf";
String in361 = "dbaceaab";
int in362 = 2;
int out36 = 13;
System.out.println("testing with input: ");
test = new ChangingString();
tmpVal = test.distance(in360, in361, in362);
System.out.println("Output expected: " + out36 + " Output recieved: " + tmpVal );
result = tmpVal == out36;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in370 = "nathaicbkoniiualcncpmmehkpigoieglobktcempe";
String in371 = "edcaacebfebcbfedcfcafbbcdbefebadfecafdfbde";
int in372 = 7;
int out37 = 177;
System.out.println("testing with input: ");
test = new ChangingString();
tmpVal = test.distance(in370, in371, in372);
System.out.println("Output expected: " + out37 + " Output recieved: " + tmpVal );
result = tmpVal == out37;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in380 = "ihpatoiltegbnuqhgbkrbheebjfcahmdsbug";
String in381 = "dddfcbbaacfacaaaccedecaeddcfbbeeabea";
int in382 = 8;
int out38 = 125;
System.out.println("testing with input: ");
test = new ChangingString();
tmpVal = test.distance(in380, in381, in382);
System.out.println("Output expected: " + out38 + " Output recieved: " + tmpVal );
result = tmpVal == out38;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in390 = "cdacdabdeecaaaedaedd";
String in391 = "eicfffechhbibbeihfib";
int in392 = 9;
int out39 = 16;
System.out.println("testing with input: ");
test = new ChangingString();
tmpVal = test.distance(in390, in391, in392);
System.out.println("Output expected: " + out39 + " Output recieved: " + tmpVal );
result = tmpVal == out39;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in400 = "adbiihdedghjifecjicgfaiheffccjgjfjcg";
String in401 = "kefgedbdfgdidhdacbbfdbdecdkggcjcighk";
int in402 = 17;
int out40 = 32;
System.out.println("testing with input: ");
test = new ChangingString();
tmpVal = test.distance(in400, in401, in402);
System.out.println("Output expected: " + out40 + " Output recieved: " + tmpVal );
result = tmpVal == out40;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in410 = "mdcskfrgskjatgksfqjuflcjflqgsrdcg";
String in411 = "rkssfiasiilabfaeehetmqafldlchhhtf";
int in412 = 20;
int out41 = 25;
System.out.println("testing with input: ");
test = new ChangingString();
tmpVal = test.distance(in410, in411, in412);
System.out.println("Output expected: " + out41 + " Output recieved: " + tmpVal );
result = tmpVal == out41;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in420 = "hfgsbdrehoonfqbrllqdhci";
String in421 = "cijtcaaabcbtnlzgkbbdgfr";
int in422 = 14;
int out42 = 16;
System.out.println("testing with input: ");
test = new ChangingString();
tmpVal = test.distance(in420, in421, in422);
System.out.println("Output expected: " + out42 + " Output recieved: " + tmpVal );
result = tmpVal == out42;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in430 = "aabbecddaaccdcaab";
String in431 = "ldjjfacgnilaflllf";
int in432 = 9;
int out43 = 18;
System.out.println("testing with input: ");
test = new ChangingString();
tmpVal = test.distance(in430, in431, in432);
System.out.println("Output expected: " + out43 + " Output recieved: " + tmpVal );
result = tmpVal == out43;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in440 = "lbccmhnbb";
String in441 = "deaebeadd";
int in442 = 1;
int out44 = 33;
System.out.println("testing with input: ");
test = new ChangingString();
tmpVal = test.distance(in440, in441, in442);
System.out.println("Output expected: " + out44 + " Output recieved: " + tmpVal );
result = tmpVal == out44;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in450 = "aaaabcd";
String in451 = "aabcaaa";
int in452 = 6;
int out45 = 1;
System.out.println("testing with input: ");
test = new ChangingString();
tmpVal = test.distance(in450, in451, in452);
System.out.println("Output expected: " + out45 + " Output recieved: " + tmpVal );
result = tmpVal == out45;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in460 = "asdfqqerereqwer";
String in461 = "asveqqregreqwer";
int in462 = 8;
int out46 = 3;
System.out.println("testing with input: ");
test = new ChangingString();
tmpVal = test.distance(in460, in461, in462);
System.out.println("Output expected: " + out46 + " Output recieved: " + tmpVal );
result = tmpVal == out46;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in470 = "asdfqqerereqwer";
String in471 = "asveqqregreqwer";
int in472 = 5;
int out47 = 0;
System.out.println("testing with input: ");
test = new ChangingString();
tmpVal = test.distance(in470, in471, in472);
System.out.println("Output expected: " + out47 + " Output recieved: " + tmpVal );
result = tmpVal == out47;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in480 = "asdfqqerereqwer";
String in481 = "asveqqregreqwer";
int in482 = 10;
int out48 = 5;
System.out.println("testing with input: ");
test = new ChangingString();
tmpVal = test.distance(in480, in481, in482);
System.out.println("Output expected: " + out48 + " Output recieved: " + tmpVal );
result = tmpVal == out48;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in490 = "az";
String in491 = "az";
int in492 = 2;
int out49 = 2;
System.out.println("testing with input: ");
test = new ChangingString();
tmpVal = test.distance(in490, in491, in492);
System.out.println("Output expected: " + out49 + " Output recieved: " + tmpVal );
result = tmpVal == out49;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in500 = "ac";
String in501 = "ad";
int in502 = 2;
int out50 = 1;
System.out.println("testing with input: ");
test = new ChangingString();
tmpVal = test.distance(in500, in501, in502);
System.out.println("Output expected: " + out50 + " Output recieved: " + tmpVal );
result = tmpVal == out50;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in510 = "aaaa";
String in511 = "zzzz";
int in512 = 1;
int out51 = 75;
System.out.println("testing with input: ");
test = new ChangingString();
tmpVal = test.distance(in510, in511, in512);
System.out.println("Output expected: " + out51 + " Output recieved: " + tmpVal );
result = tmpVal == out51;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in520 = "asdhashdkjd";
String in521 = "aejqwkehqcn";
int in522 = 4;
int out52 = 34;
System.out.println("testing with input: ");
test = new ChangingString();
tmpVal = test.distance(in520, in521, in522);
System.out.println("Output expected: " + out52 + " Output recieved: " + tmpVal );
result = tmpVal == out52;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in530 = "baa";
String in531 = "aaa";
int in532 = 3;
int out53 = 2;
System.out.println("testing with input: ");
test = new ChangingString();
tmpVal = test.distance(in530, in531, in532);
System.out.println("Output expected: " + out53 + " Output recieved: " + tmpVal );
result = tmpVal == out53;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in540 = "aa";
String in541 = "aa";
int in542 = 2;
int out54 = 2;
System.out.println("testing with input: ");
test = new ChangingString();
tmpVal = test.distance(in540, in541, in542);
System.out.println("Output expected: " + out54 + " Output recieved: " + tmpVal );
result = tmpVal == out54;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in550 = "aaaa";
String in551 = "aaaa";
int in552 = 2;
int out55 = 2;
System.out.println("testing with input: ");
test = new ChangingString();
tmpVal = test.distance(in550, in551, in552);
System.out.println("Output expected: " + out55 + " Output recieved: " + tmpVal );
result = tmpVal == out55;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in560 = "zzzzzz";
String in561 = "aaasdc";
int in562 = 2;
int out56 = 77;
System.out.println("testing with input: ");
test = new ChangingString();
tmpVal = test.distance(in560, in561, in562);
System.out.println("Output expected: " + out56 + " Output recieved: " + tmpVal );
result = tmpVal == out56;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in570 = "ab";
String in571 = "aa";
int in572 = 2;
int out57 = 1;
System.out.println("testing with input: ");
test = new ChangingString();
tmpVal = test.distance(in570, in571, in572);
System.out.println("Output expected: " + out57 + " Output recieved: " + tmpVal );
result = tmpVal == out57;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in580 = "a";
String in581 = "a";
int in582 = 1;
int out58 = 1;
System.out.println("testing with input: ");
test = new ChangingString();
tmpVal = test.distance(in580, in581, in582);
System.out.println("Output expected: " + out58 + " Output recieved: " + tmpVal );
result = tmpVal == out58;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in590 = "aaa";
String in591 = "xzx";
int in592 = 2;
int out59 = 23;
System.out.println("testing with input: ");
test = new ChangingString();
tmpVal = test.distance(in590, in591, in592);
System.out.println("Output expected: " + out59 + " Output recieved: " + tmpVal );
result = tmpVal == out59;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in600 = "aaa";
String in601 = "aza";
int in602 = 2;
int out60 = 1;
System.out.println("testing with input: ");
test = new ChangingString();
tmpVal = test.distance(in600, in601, in602);
System.out.println("Output expected: " + out60 + " Output recieved: " + tmpVal );
result = tmpVal == out60;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in610 = "aa";
String in611 = "az";
int in612 = 2;
int out61 = 1;
System.out.println("testing with input: ");
test = new ChangingString();
tmpVal = test.distance(in610, in611, in612);
System.out.println("Output expected: " + out61 + " Output recieved: " + tmpVal );
result = tmpVal == out61;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in620 = "aab";
String in621 = "aaa";
int in622 = 2;
int out62 = 1;
System.out.println("testing with input: ");
test = new ChangingString();
tmpVal = test.distance(in620, in621, in622);
System.out.println("Output expected: " + out62 + " Output recieved: " + tmpVal );
result = tmpVal == out62;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in630 = "aaaaa";
String in631 = "aaaaa";
int in632 = 3;
int out63 = 3;
System.out.println("testing with input: ");
test = new ChangingString();
tmpVal = test.distance(in630, in631, in632);
System.out.println("Output expected: " + out63 + " Output recieved: " + tmpVal );
result = tmpVal == out63;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in640 = "aaa";
String in641 = "aaz";
int in642 = 3;
int out64 = 2;
System.out.println("testing with input: ");
test = new ChangingString();
tmpVal = test.distance(in640, in641, in642);
System.out.println("Output expected: " + out64 + " Output recieved: " + tmpVal );
result = tmpVal == out64;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in650 = "abc";
String in651 = "bba";
int in652 = 3;
int out65 = 1;
System.out.println("testing with input: ");
test = new ChangingString();
tmpVal = test.distance(in650, in651, in652);
System.out.println("Output expected: " + out65 + " Output recieved: " + tmpVal );
result = tmpVal == out65;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in660 = "aa";
String in661 = "aa";
int in662 = 1;
int out66 = 1;
System.out.println("testing with input: ");
test = new ChangingString();
tmpVal = test.distance(in660, in661, in662);
System.out.println("Output expected: " + out66 + " Output recieved: " + tmpVal );
result = tmpVal == out66;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in670 = "abc";
String in671 = "aba";
int in672 = 2;
int out67 = 1;
System.out.println("testing with input: ");
test = new ChangingString();
tmpVal = test.distance(in670, in671, in672);
System.out.println("Output expected: " + out67 + " Output recieved: " + tmpVal );
result = tmpVal == out67;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in680 = "ab";
String in681 = "ab";
int in682 = 1;
int out68 = 1;
System.out.println("testing with input: ");
test = new ChangingString();
tmpVal = test.distance(in680, in681, in682);
System.out.println("Output expected: " + out68 + " Output recieved: " + tmpVal );
result = tmpVal == out68;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in690 = "aab";
String in691 = "aac";
int in692 = 3;
int out69 = 2;
System.out.println("testing with input: ");
test = new ChangingString();
tmpVal = test.distance(in690, in691, in692);
System.out.println("Output expected: " + out69 + " Output recieved: " + tmpVal );
result = tmpVal == out69;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in700 = "cccccc";
String in701 = "cccccc";
int in702 = 4;
int out70 = 4;
System.out.println("testing with input: ");
test = new ChangingString();
tmpVal = test.distance(in700, in701, in702);
System.out.println("Output expected: " + out70 + " Output recieved: " + tmpVal );
result = tmpVal == out70;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in710 = "ab";
String in711 = "ab";
int in712 = 2;
int out71 = 2;
System.out.println("testing with input: ");
test = new ChangingString();
tmpVal = test.distance(in710, in711, in712);
System.out.println("Output expected: " + out71 + " Output recieved: " + tmpVal );
result = tmpVal == out71;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in720 = "abc";
String in721 = "abd";
int in722 = 2;
int out72 = 1;
System.out.println("testing with input: ");
test = new ChangingString();
tmpVal = test.distance(in720, in721, in722);
System.out.println("Output expected: " + out72 + " Output recieved: " + tmpVal );
result = tmpVal == out72;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in730 = "bcda";
String in731 = "aaaa";
int in732 = 1;
int out73 = 3;
System.out.println("testing with input: ");
test = new ChangingString();
tmpVal = test.distance(in730, in731, in732);
System.out.println("Output expected: " + out73 + " Output recieved: " + tmpVal );
result = tmpVal == out73;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in740 = "a";
String in741 = "m";
int in742 = 1;
int out74 = 0;
System.out.println("testing with input: ");
test = new ChangingString();
tmpVal = test.distance(in740, in741, in742);
System.out.println("Output expected: " + out74 + " Output recieved: " + tmpVal );
result = tmpVal == out74;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in750 = "zzaz";
String in751 = "zzcz";
int in752 = 4;
int out75 = 3;
System.out.println("testing with input: ");
test = new ChangingString();
tmpVal = test.distance(in750, in751, in752);
System.out.println("Output expected: " + out75 + " Output recieved: " + tmpVal );
result = tmpVal == out75;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in760 = "zza";
String in761 = "zzc";
int in762 = 3;
int out76 = 2;
System.out.println("testing with input: ");
test = new ChangingString();
tmpVal = test.distance(in760, in761, in762);
System.out.println("Output expected: " + out76 + " Output recieved: " + tmpVal );
result = tmpVal == out76;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in770 = "aaaaaaaaaa";
String in771 = "aaaaaaaaaa";
int in772 = 4;
int out77 = 4;
System.out.println("testing with input: ");
test = new ChangingString();
tmpVal = test.distance(in770, in771, in772);
System.out.println("Output expected: " + out77 + " Output recieved: " + tmpVal );
result = tmpVal == out77;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in780 = "aaaaaaaa";
String in781 = "aaaaaaaa";
int in782 = 8;
int out78 = 8;
System.out.println("testing with input: ");
test = new ChangingString();
tmpVal = test.distance(in780, in781, in782);
System.out.println("Output expected: " + out78 + " Output recieved: " + tmpVal );
result = tmpVal == out78;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in790 = "fdfdfdfdfdsfabasd";
String in791 = "jhlakfjdklsakdjfk";
int in792 = 8;
int out79 = 24;
System.out.println("testing with input: ");
test = new ChangingString();
tmpVal = test.distance(in790, in791, in792);
System.out.println("Output expected: " + out79 + " Output recieved: " + tmpVal );
result = tmpVal == out79;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in800 = "aaa";
String in801 = "baz";
int in802 = 1;
int out80 = 1;
System.out.println("testing with input: ");
test = new ChangingString();
tmpVal = test.distance(in800, in801, in802);
System.out.println("Output expected: " + out80 + " Output recieved: " + tmpVal );
result = tmpVal == out80;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in810 = "aaaaaaaaaabbb";
String in811 = "aaaaaaaabbbbb";
int in812 = 7;
int out81 = 5;
System.out.println("testing with input: ");
test = new ChangingString();
tmpVal = test.distance(in810, in811, in812);
System.out.println("Output expected: " + out81 + " Output recieved: " + tmpVal );
result = tmpVal == out81;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in820 = "aad";
String in821 = "afd";
int in822 = 2;
int out82 = 1;
System.out.println("testing with input: ");
test = new ChangingString();
tmpVal = test.distance(in820, in821, in822);
System.out.println("Output expected: " + out82 + " Output recieved: " + tmpVal );
result = tmpVal == out82;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in830 = "ba";
String in831 = "aa";
int in832 = 2;
int out83 = 1;
System.out.println("testing with input: ");
test = new ChangingString();
tmpVal = test.distance(in830, in831, in832);
System.out.println("Output expected: " + out83 + " Output recieved: " + tmpVal );
result = tmpVal == out83;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in840 = "aaab";
String in841 = "aaaa";
int in842 = 2;
int out84 = 1;
System.out.println("testing with input: ");
test = new ChangingString();
tmpVal = test.distance(in840, in841, in842);
System.out.println("Output expected: " + out84 + " Output recieved: " + tmpVal );
result = tmpVal == out84;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in850 = "aaaa";
String in851 = "zzzz";
int in852 = 2;
int out85 = 50;
System.out.println("testing with input: ");
test = new ChangingString();
tmpVal = test.distance(in850, in851, in852);
System.out.println("Output expected: " + out85 + " Output recieved: " + tmpVal );
result = tmpVal == out85;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in860 = "cdefg";
String in861 = "avcde";
int in862 = 1;
int out86 = 8;
System.out.println("testing with input: ");
test = new ChangingString();
tmpVal = test.distance(in860, in861, in862);
System.out.println("Output expected: " + out86 + " Output recieved: " + tmpVal );
result = tmpVal == out86;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in870 = "aaaaacc";
String in871 = "aaaaabb";
int in872 = 4;
int out87 = 2;
System.out.println("testing with input: ");
test = new ChangingString();
tmpVal = test.distance(in870, in871, in872);
System.out.println("Output expected: " + out87 + " Output recieved: " + tmpVal );
result = tmpVal == out87;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in880 = "aaaa";
String in881 = "aaad";
int in882 = 2;
int out88 = 1;
System.out.println("testing with input: ");
test = new ChangingString();
tmpVal = test.distance(in880, in881, in882);
System.out.println("Output expected: " + out88 + " Output recieved: " + tmpVal );
result = tmpVal == out88;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in890 = "aaa";
String in891 = "aaa";
int in892 = 3;
int out89 = 3;
System.out.println("testing with input: ");
test = new ChangingString();
tmpVal = test.distance(in890, in891, in892);
System.out.println("Output expected: " + out89 + " Output recieved: " + tmpVal );
result = tmpVal == out89;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in900 = "aaa";
String in901 = "aab";
int in902 = 3;
int out90 = 2;
System.out.println("testing with input: ");
test = new ChangingString();
tmpVal = test.distance(in900, in901, in902);
System.out.println("Output expected: " + out90 + " Output recieved: " + tmpVal );
result = tmpVal == out90;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in910 = "abcde";
String in911 = "abcde";
int in912 = 5;
int out91 = 5;
System.out.println("testing with input: ");
test = new ChangingString();
tmpVal = test.distance(in910, in911, in912);
System.out.println("Output expected: " + out91 + " Output recieved: " + tmpVal );
result = tmpVal == out91;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in920 = "z";
String in921 = "x";
int in922 = 1;
int out92 = 0;
System.out.println("testing with input: ");
test = new ChangingString();
tmpVal = test.distance(in920, in921, in922);
System.out.println("Output expected: " + out92 + " Output recieved: " + tmpVal );
result = tmpVal == out92;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in930 = "aabbc";
String in931 = "aabbd";
int in932 = 3;
int out93 = 2;
System.out.println("testing with input: ");
test = new ChangingString();
tmpVal = test.distance(in930, in931, in932);
System.out.println("Output expected: " + out93 + " Output recieved: " + tmpVal );
result = tmpVal == out93;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in940 = "aaaaaab";
String in941 = "aaaaaac";
int in942 = 2;
int out94 = 1;
System.out.println("testing with input: ");
test = new ChangingString();
tmpVal = test.distance(in940, in941, in942);
System.out.println("Output expected: " + out94 + " Output recieved: " + tmpVal );
result = tmpVal == out94;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in950 = "aaa";
String in951 = "aab";
int in952 = 2;
int out95 = 1;
System.out.println("testing with input: ");
test = new ChangingString();
tmpVal = test.distance(in950, in951, in952);
System.out.println("Output expected: " + out95 + " Output recieved: " + tmpVal );
result = tmpVal == out95;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in960 = "aaaa";
String in961 = "aaaa";
int in962 = 3;
int out96 = 3;
System.out.println("testing with input: ");
test = new ChangingString();
tmpVal = test.distance(in960, in961, in962);
System.out.println("Output expected: " + out96 + " Output recieved: " + tmpVal );
result = tmpVal == out96;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in970 = "aaaaa";
String in971 = "aaaab";
int in972 = 3;
int out97 = 2;
System.out.println("testing with input: ");
test = new ChangingString();
tmpVal = test.distance(in970, in971, in972);
System.out.println("Output expected: " + out97 + " Output recieved: " + tmpVal );
result = tmpVal == out97;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in980 = "aaaaaaaaa";
String in981 = "aaaaabbbb";
int in982 = 7;
int out98 = 3;
System.out.println("testing with input: ");
test = new ChangingString();
tmpVal = test.distance(in980, in981, in982);
System.out.println("Output expected: " + out98 + " Output recieved: " + tmpVal );
result = tmpVal == out98;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in990 = "aaaaaaaaaaaaaaaaaaaaaaaaaaa";
String in991 = "zzzzzzzzzzzzzzzzzzzzzzzzzzz";
int in992 = 3;
int out99 = 600;
System.out.println("testing with input: ");
test = new ChangingString();
tmpVal = test.distance(in990, in991, in992);
System.out.println("Output expected: " + out99 + " Output recieved: " + tmpVal );
result = tmpVal == out99;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
counter ++;
String in1000 = "zz";
String in1001 = "zz";
int in1002 = 1;
int out100 = 1;
System.out.println("testing with input: ");
test = new ChangingString();
tmpVal = test.distance(in1000, in1001, in1002);
System.out.println("Output expected: " + out100 + " Output recieved: " + tmpVal );
result = tmpVal == out100;
if (result) { mark++;}
else{System.out.println("failed test");
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
return;}
System.out.println("total_marks: " + mark);
System.out.println("out_of: " + counter);
    }
}
