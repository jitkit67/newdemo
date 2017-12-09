class A
{
	A()
	{
		System.out.println("class A object created");
	}
}
class ObjectPrint 
{
	public static void main(String[] args) 
	{
		A obj=new A();
		System.out.println(obj);
	}
}
