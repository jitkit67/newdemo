class A
{
	private A(){}
}
class B extends A
{
}
class NoChild 
{
	public static void main(String[] args) 
	{
		B obj=new B();
		System.out.println("Hello World!");
	}
}
