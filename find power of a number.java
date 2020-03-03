// Find power of a number
// Send Feedback
// Write a program to find x to the power n (i.e. x^n). Take x and n from the user. You need to print the answer.
// Input format :
// Two integers x and n (separated by space)
// Output Format :
// x^n (i.e. x raise to the power n)
// Constraints:
// 0 <= x <= 8, 0 <= n <= 9
// Sample Input 1 :
//  3 4
// Sample Output 1 :
// 81
// Sample Input 2 :
//  2 5
// Sample Output 2 :
// 32


import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
		// Write your code here
        	Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
        int temp=1;
		int n=sc.nextInt();

        while(n!=0)
        {
            temp=temp*x;
            n--;
        }
	
	    System.out.println(temp);
	}
}
