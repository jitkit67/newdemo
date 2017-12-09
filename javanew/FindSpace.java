import java.util.Scanner;
import java.util.ArrayList;

class FindSpace 
{
/*	public static String subStr(String ss,int f,int l)
	{
		String res="";
		for(int a=0;a<l;a++)
		{
			char ch=ss.charAt(a);
			res=res+ch;
		}
		return res;
	}*/
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enetr String to find number of spaces");
		String str=sc.nextLine()+" ";
		int len=str.length();
		System.out.println(str);
		ArrayList<String> myArrl=new ArrayList<String>();
		int f=0;
		for(int i=0;i<len;i++)
		{
			char ch=str.charAt(i);
			if(ch==' ')
			{
				myArrl.add(str.substring(f,i));
				f=i+1;
//				System.out.println(f+" "+i);
			}
		}
		System.out.println(myArrl);
	}
}
