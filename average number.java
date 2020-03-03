//Write a program to input name (as a single character) and marks 
//of three tests of a student (all integers). Then calculate and 
//print the name and average (integer) of all test marks.
//All the test marks are integers and calculate average also as integer.
//That is, you need to print the integer part of average only, neglect 
//the decimal part.




//      IMPORTANT          Change name of file to Soltion.java if you are trying to run in eclipse


import java.util.Scanner;
public class Solution {


	public static void main(String[] args) {
		
		/* Your class should be named Solution.
	 	* Read input as specified in the question.
	 	* Print output as specified in the question.
		*/

		Scanner scan=new Scanner(System.in);
        String s=scan.nextLine();
        char c=s.charAt(0);
        int q=scan.nextInt();
        int w=scan.nextInt();
        int e=scan.nextInt();
        int avg=(q+w+e)/3;
        System.out.println(c+"\n"+avg);

    }

}
