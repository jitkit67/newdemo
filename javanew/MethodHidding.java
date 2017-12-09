class A
{
	static void m1()
	{
		System.out.println("class A m1()");
	}
}
class B extends A
{
	static void m1()
	{
		System.out.println("class B m1()");
	}
}
class MethodHidding
{
	public static void main(String[] args) 
	{
		A objA=new A();
		B objB=new B();
		A objAB=new B();
		objA.m1();		//class A m1()
		objB.m1();		//class B m1()
		objAB.m1();	//class A m1()
	}
}
