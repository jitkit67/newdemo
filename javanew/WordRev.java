import java.util.Scanner;
import java.util.ArrayList;
import java.util.Iterator;
class WordRev 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		String res="";
		int c=0;
		Scanner s=new Scanner(str);
		ArrayList<String> myArrayList=new ArrayList<String>();
		while(s.hasNext())
		{
			myArrayList.add(s.next());
			c++;
		}
		Iterator it=myArrayList.iterator();
		while(it.hasNext())
		{
			res=it.next()+" "+res;
		}
		System.out.println(res);
				System.out.println("Number of words in this String "+c);
	}
}
