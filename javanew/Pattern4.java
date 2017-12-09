/*
7 6 5 4 3 2 1
7 6 5 4 3 2
7 6 5 4 3
7 6 5 4
7 6 5
7 6
7
*/

import java.util.Scanner;
class Pattern4 
{
	public static void main(String[] args) 
	{
		System.out.println("Enter Number of row you wants");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		for(int i=1;i<=num;i++)
		{
			for(int j=num;j>=i;j--)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
}
