//Sum of Even Numbers till N
//Send Feedback
//Given a number N, print sum of all even numbers from 1 to N.
//Input Format :
//Integer N
//Output Format :
//Required Sum 
//Sample Input 1 :
// 6
//Sample Output 1 :
//12

import java.util.Scanner;
public class Solution {


	public static void main(String[] args) {
		
		/* Your class should be named Solution.
	 	* Read input as specified in the question.
	 	* Print output as specified in the question.
		*/
        Scanner sc= new Scanner(System.in);
		int num=sc.nextInt();
        int i=2;
        int sum=0;
        while(i<=num)
        {
            if(i%2==0){
                sum+=i;
            }
        i++;
        }
		System.out.println(sum);
	}

}
