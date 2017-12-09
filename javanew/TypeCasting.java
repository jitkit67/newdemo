class A
{
	void m1()
	{
		System.out.println("A class m1()");
	}
}
class B extends A
{
	void m1()
	{
		System.out.println("B class m1()");
	}
}
class TypeCasting 
{
	public static void main(String[] args) 
	{
		A objA=new A();
		B objB=new B();
		A objAB=(A)objB;
//		B objBA=(A)objB;
//		B objBA=(B)objA;
		objA.m1();
		objB.m1();
		objAB.m1();
//		objBA.m1();
	}
}
