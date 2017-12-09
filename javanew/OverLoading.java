class A
{
}
class B extends A
{
}
class C extends B 
{
}
class test
{
	void m1(A obj)
	{
		System.out.println("A class object call");
	}
	void m1(B obj)
	{
		System.out.println("B class object call");
	}
	void m1(C obj)
	{
		System.out.println("C class object call");
	}

}
class OverLoading 
{
	public static void main(String[] args) 
	{
		A objA=new A();
		B objB=new B();
		C objC=new C();
		A objAC=new C();
		A objAB=new B();
		B objBC=new C();
		test obj=new test();
		obj.m1(objA);		//A class object call
		obj.m1(objB);		//B class object call
		obj.m1(objC);		//C class object call
		obj.m1(objAC);	//A class object call
		obj.m1(objAB);	//A class object call
		obj.m1(objBC);	//B class object call
	}
}
