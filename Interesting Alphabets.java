import java.util.*;
public class Solution {


	public static void main(String[] args) {
		
		/* Your class should be named Solution.
	 	* Read input as specified in the question.
	 	* Print output as specified in the question.
		*/
        Scanner sc= new Scanner(System.in);
        int N = sc.nextInt();
        int m;
        char c=(char)(65+N);
        for(int i=1;i<=N;i++)
        {            
                     c=(char)(c-i);
                     for(int j=0;j<i;j++)
                    {    
                        System.out.print(c);
                        c++;
                    }   
        System.out.println("");
        }

		
	}

}
