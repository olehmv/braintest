package braintest;
/*This program print "Hello World" on program language Braintest
 * 
 * ++++++++++[>+++++++>++++++++++>+++>+<<<<-]>++
 * .>+.+++++++..+++.<<+++++++++++++++.>.+++.
 * ------.--------.>+.>.
 * 
 * Write Interpreter if:
 *  ">" it is "i++" move to next ñell
 *  "<" it is "i--" move to previous ñell
 *  "+" it is "array[i]++" increment current cell value on one
 *  "-" it is "array[i]--"  decrease the current value on one
 *  "." it is "System.out.println(array[i])" print cell value
 *  "[" it is "while(array[i]==0){" if cell value zero, move forward on program text on one cell
 * 	"]" it is "}" if cell value not zero, move back on program text on one character
 * 
 * Program disassemble:
 * Array consist of values (0,70,100,30,10)close to ASCII-code characters and symbols
 * which you must output 
 *  "++++++++++" it is assignment  array[0] value 10
 *   "[" it is repeat until current cell value(array[0]) greater than zero
 *   ">+++++++" it is increment current cell array[1] value  on 7
 *   ">++++++++++" it is increment current cell array[2] value on 10
 *   ">+++" it is increment current cell array[3] value on  3
 *   ">+" it is increment current cell array[4] value on 1
 *   "<<<<-" it is return to array[0] and decrease cell value on 1
 *   
 *   Characters and symbols code and they output:
 *   ">++." it is  output "H". Character code "H"(72) of 70 from cell array[1] and output
 *   ">+." it is output "e". Character code "e"(101) of 100 from cell array[2] and output
 *   "+++++++.." it is output "ll". Character code"l"(108) of 101 cell array[2] amd output two times
 *   "+++." it is output "o". Character code"o"(111) of 108 from cell array[2] and output
 *   ">++." it is space output. Symbol space code(32) of 30 from cell array[3] and output
 *   "<<+++++++++++++++." it is output "W". Character code"W"(87) of 72 from array[1] and output
 *   ">." it is output "o". Character code(111) from cell array[2] and output
 *   "+++." it is output "r". Character code(114) of 111 from cell array[2] and output
 *   "------." it is output "l". Character code"l"(108) of 114 from cell array[2] and output
 *   "--------." it is output "d". Character code"d"(100) of 108 from cell array[2] and output  
 *   ">+." it is output "!". Character code"!"(33) of 32 from cell array[3] and output
 *   ">." it is new line output. Symbol code(10) from cell array[4] and output
 */

public class Braintest {

	/* calculate initial value: char[0] x=0; char[1] x+7=70 -> x=63; char[2]
	 * x+10=100 -> x=90; char[3] x+3=30 -> x=27; char[4] x+1=10 -> x=9
	 */
	// process char array
	public static void main(String[] args) {
		char[] arr = new char[] { 0, 63, 90, 27, 9 };
		int i = 0;
		arr[i] = 10;
		if (arr[i] > 0) {
			i++;
			arr[i] += 7;
			i++;
			arr[i] += 10;
			i++;
			arr[i] += 3;
			i++;
			arr[i] += 1;
			i = i - 4;
			arr[i] -= 1;
		}
		System.out.print(arr[1] += 2);// H
		System.out.print(arr[2] += 1);// e
		System.out.print(arr[2] += 7);// l
		System.out.print(arr[2]);// l
		System.out.print(arr[2] += 3);// o
		System.out.print(arr[3] += 2);// space
		System.out.print(arr[1] += 15);// W
		System.out.print(arr[2]);// o
		System.out.print(arr[2] += 3);// r
		System.out.print(arr[2] -= 6);// l
		System.out.print(arr[2] -= 8);// d
		System.out.print(arr[3] += 1);// !
		System.out.print(arr[4]);// new line
	}
}
