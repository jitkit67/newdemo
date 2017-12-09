//reverse String
import java.util.Scanner;
class ReverseString 
{
	public static void main(String[] args) 
	{
		System.out.println("Enter String to REVERSE ");
		String str=new Scanner(System.in).nextLine();
		String res="";
		int len=str.length();
		for(int i=0;i<len;i++)
			res+=str.charAt(len-i-1);
		System.out.println(res);
	}
}
