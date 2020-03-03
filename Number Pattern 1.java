// Number Pattern 1
// Send Feedback
// Print the following pattern
// Pattern for N = 4
// 1
// 23
// 345
// 4567
// Input Format :
// N (Total no. of rows)
// Output Format :
// Pattern in N lines
// Sample Input 1 :
// 3
// Sample Output 1 :
// 1
// 23
// 345



import java.util.Scanner;
public class Solution {


	public static void main(String[] args) {
		
		/* Your class should be named Solution.
	 	* Read input as specified in the question.
	 	* Print output as specified in the question.
		*/
        Scanner s=new Scanner(System.in);
        int N=s.nextInt();
        int i=0;
        int j;
        int count;
        while(i<=N)
        {   j=i;
            count=0;
            while(count<i)
            {    System.out.print(j);
                 j++;
                 count++;
            }
            i++;
             System.out.println();
        }
        
		
	}

}
