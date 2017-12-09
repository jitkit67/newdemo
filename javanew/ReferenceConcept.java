class A
{
	public void m1()
	{
		System.out.println("class A m1() method");
	}
}

class B extends A
{
	public void m1()
	{
		System.out.println("class B m1() method");
	}
}
class ReferenceConcept 
{
	public static void main(String[] args) 
	{
		B objB=new B();
		A objA=new A();
		A objAB=new B();
//		B objBA=new A(); Only parent reference can hold child class not visa verse
		objB.m1();		//class B m1() method
		objA.m1();		//class A m1() method
		objAB.m1();	//class B m1() method
	}
}
