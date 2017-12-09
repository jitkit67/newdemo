class codingNUM 
{
public static boolean nearHundred(int n) {
  int num=Math.abs(n)%100;
  System.out.println(num);
  return (num>=90||num<=10?true:false);
}

	public static void main(String[] args) 
	{

		boolean b=nearHundred(-209);
				System.out.println(b);
	}
}
