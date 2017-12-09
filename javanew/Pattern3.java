/*
1
1 2
1 2 3
1 2 3 4
1 2 3
1 2
1
*/

import java.util.Scanner;
class Pattern3 
{
	public static void main(String[] args) 
	{
		System.out.println("Enter Number of row you wants");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();

		for(int i=1;i<=num;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}

		for(int i=num-1;i>0;i--)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}

	}
}
