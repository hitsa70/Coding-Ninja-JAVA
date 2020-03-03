//Find Character Case
//Send Feedback
//Write a program to determine whether the entered character is in uppercase or lowercase, or is an invalid character.
//Print
// 1 for uppercase
// 0 for lowercase 
//-1 for any other character (special characters or others)
//Input format :
//Single Character
//Output format :
//1 or 0 or -1
//Sample Input 1 :
//v
//Sample Output 1 :
//0
//Sample Input 2 :
//V
//Sample Output 2 :
//1
//Sample Input 3 :
//#
//Sample Output 3 :
//-1




import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
		// Write your code here
        Scanner hit = new Scanner(System.in);
        char c=hit.next().charAt(0);
        
        if (c>=97 && c<=122){
           System.out.print(0);
        }else   if (c>=65 && c<=90){
            System.out.print(1);
        }else
        {System.out.print(-1);
        }
	}
}
