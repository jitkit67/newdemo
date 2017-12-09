class A
{
	static int a=20;
	static void  m1()
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
class StaticMethod 
{
	public static void main(String[] args) 
	{
		B obj=new B();
		B.a=30;
		obj.m1();
		System.out.println(B.a);
		System.out.println(A.a);
	}
}
