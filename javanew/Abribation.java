//Name Abribration 
import java.util.Scanner;
class Abribation 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Name for Abribation ");
		String name=sc.nextLine().trim();
		name.replace("  "," ");
		String str[]=name.split(" ");
		String res="";
		int len=str.length;
		for(int i=0;i<len-1;i++)
		{
			char ch=str[i].charAt(0);
			ch=Character.toUpperCase(ch);
			res=res+ch+".";
		}
			char ch=str[len-1].charAt(0);
			ch=Character.toUpperCase(ch);
		res=res+ch+str[len-1].substring(1,str[len-1].length());
		System.out.println(res);
	}
}
