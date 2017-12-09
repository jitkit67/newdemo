import java.util.Arrays;
class  ArrayCommonElement
{
	public static void main(String[] args) 
	{
		int[] a={15,20,5,8,12,4};
		int[] b={20,5,17,18,15};
		int len;
		int j=0,k=0;
		Arrays.sort(a);
		Arrays.sort(b);
		for(int i=0;j!=a.length && k!=a.length ;i++)
		{
			if(a[j]==b[k])
			{
				System.out.print(a[j]+" " );
				j++;k++;
			}
			else if(a[j]>b[k])
				k++;
			else if(a[j]<b[k])
				j++;
		}
	}
}
