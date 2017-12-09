class ternaryOperator 
{
	public static void main(String[] args) 
	{
		int[] a={10,20,30,40,20,10};
		int i=0;
		int j=a.length-1;
	while(i!=a.length)
		{
		if(a[i++]==a[j--])
				System.out.println(a[i]+"   "+a[j]+"  i "+i+"  j   "+j);
		else
			System.out.println(a[i]+"   "+a[j]+"  i "+i+"  j   "+j);
		}
		
	}
}
