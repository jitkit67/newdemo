import java.util.Scanner;
class AdditiveSeq 
{
	public static void main(String[] args) 
	{
		boolean flag=false;
		Scanner sc=new Scanner(System.in);
		System.out.println("Eneter integer elements want in sequence");
		int n=sc.nextInt();
		Integer[] arr=new Integer[n];
		System.out.println("Eneter "+n+" integer elements for sequence@ ");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
//		int arr[]={6,6,12,18,30};
		for(int i=2;i<arr.length;i++)
		{
			if(arr[i-2]+arr[i-1]==arr[i])
				flag=true;
			else
				flag=false;
		}
		if(flag)
			System.out.println("Additive sequence it's Contains");
		else
			System.out.println("Additive sequence it's not Contains");
	}
}
