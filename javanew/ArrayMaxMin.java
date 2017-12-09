//find maximum and minimum value of an ARRAYS
import java.util.Scanner;
class ArrayMaxMin 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enetr number of Array element want");
		int n=sc.nextInt();
		Integer[] arr=new Integer[n];
		System.out.println("Eneter "+n+" integer elements for sequence ");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		int max=arr[0];
		int min=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			max=arr[i]>max?arr[i]:max;
			min=arr[i]<min?arr[i]:min;
		}
		System.out.println("Maximum Number of Array "+max);
		System.out.println("Minimum Number of Array "+min);
	}
}
