import java.util.Scanner;
class fibo 
{
	public static void main(String[] args) 
	{
		System.out.println("Enter nth term to print Fibonacci series ");
		int n=new Scanner(System.in).nextInt(); 
		if(n<=0)
		{
			System.out.println("invalid number");
			System.exit(0);
		}
		System.out.println("Fibonacci Series");
		for(int i=1;i<=n;i++)
		{
            System.out.print(i+"th-> "+getFib(i)+"\n");
		}
	}
	public static int getFib(int n)
	{
		return (n==1 || n==2)?1:(getFib(n-1)+getFib(n-2));
	}
}
