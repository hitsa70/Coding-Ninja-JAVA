// Number Pattern 2
// Send Feedback
// Print the following pattern
// Pattern for N = 4
//        1
//       23
//      345
//     4567
// Input Format :
// N (Total no. of rows)
// Output Format :
// Pattern in N lines
// Sample Input :
// 5
// Sample Output :
//           1
//          23
//         345
//        4567
//       56789


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
        int space=N-1;
        while(i<=N)
        {   j=i;
            count=0;
             space=N-i;
            while(space>0)
			{
				System.out.print(" ");
				space--;
			}
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
