class B 
{
	B()
	{
		this(12);
		System.out.println("No argument");
	}
	B(String str)
	{
		
		System.out.println("String argument");
	}
	B(int i)
	{
		this( null);
		System.out.println("integer argument");
	}
}
class ConstructThis 
{
	public static void main(String[] args) 
	{
		B obj=new B();
	}
}
