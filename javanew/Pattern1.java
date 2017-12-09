/*
1
1 2
1 2 3
1 2 3 4
*/

import java.util.Scanner;
class Pattern1 
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
	}
}
