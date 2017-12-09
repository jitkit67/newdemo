class A
{
	A()
	{
		System.out.println("A class Constructor");
	}
}
class B extends A
{
	B()
	{
		System.out.println("B class Constructor");
	}
}
class ConstructSuperThis 
{
	public static void main(String[] args) 
	{
		B obj=new B();
		System.out.println("Hello World!");
	}
}
