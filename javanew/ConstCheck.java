class A
{
	A()
	{
		System.out.println("A constructor");
	}
}
class ConstCheck extends A
{
	ConstCheck()
	{
		System.out.println("ConstCheck constructor");
	}
	public static void main(String[] args) 
	{
		new A();
		new 	ConstCheck();
	}
}
