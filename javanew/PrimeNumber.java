//prime number of rang
import java.util.Scanner;
class PrimeNumber 
{
	public static void primeCheck(int num)
	{
		int flag=0;
		if(num==2)
			 System.out.print(num+" ");
		for(int j = 2; j < num/2; j++)
             {
                 if(num % j == 0)
                 {
                     flag = 0;
                     break;
                 }
                 else
                 {
                     flag = 1;
                 }
             }
			
             if(flag == 1)
             {
                 System.out.print(num+" ");
             }
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter To number to find all Prime in between");
		int n=sc.nextInt();
		int m=sc.nextInt();
		if(m>n)
		{
			int tmp=n;
			n=m;m=tmp;
		}
/*		else if(m==n)
		{
			System.out.println("Enter numbers both same NOT Rang");
			System.exit(0);
		}*/
		for(int i=m;i<=n;i++)
			primeCheck(i);
	}
}
