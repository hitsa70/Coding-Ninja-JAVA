package patterns;

import java.util.Scanner;

public class pattern3 {

	public static void main(String[] args) {
		

		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		int i=1;
		int val=1;
		int space=n-1;
		while(i<=n)
		{	int j=1;
		    space=n-i;
			while(space>0)
			{
				System.out.print(" ");
				space--;
			}
			while(j<=i)
			{
				System.out.print(val);
				val+=1;
				j+=1;
			}
			System.out.println("");
			i+=1;
		}
	}

}
