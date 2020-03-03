// Total Salary
// Send Feedback
// Write a program to calculate the total salary of a person. The user has to enter the basic salary (an integer) and the grade (an uppercase character), and depending upon which the total salary is calculated as -
//     totalSalary = basic + hra + da + allow – pf
// where :
// hra   = 20% of basic
// da    = 50% of basic
// allow = 1700 if grade = ‘A’
// allow = 1500 if grade = ‘B’
// allow = 1300 if grade = ‘C' or any other character
// pf    = 11% of basic.
// Round off the total salary and then print the integral part only.
// Note: Try finding out a function on the internet to do so.
// Input format :
// Basic salary & Grade (separated by space)
// Output Format :
// Total Salary
// Sample Input 1 :
// 10000 A
// Sample Output 1 :
// 17600
// Sample Input 2 :
// 4567 B
// Sample Output 2 :
// 8762
import java.util.Scanner;
import java.lang.Math;
public class Main {
	
	public static void main(String[] args) {
		// Write your code here
        Scanner sc=new Scanner(System.in);
		int basic=sc.nextInt();
        
        char grade=sc.next().charAt(0);
        
        int a= basic;
        int allow=1300;
        double hra=(0.2d*basic);
        double da=(0.5d*basic);
            if(grade=='A')
            {
                allow=1700;
            }else if(grade=='B')
            {
                allow=1500;
            }
        double pf=(0.11d*basic);
        double totalSalary=a+hra;
        totalSalary+=da;
        totalSalary+=allow;
        totalSalary-=pf;
       
        System.out.println(Math.round(totalSalary));
	}
}
