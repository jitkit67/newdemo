//Singleton class with object hashcode of object
class A
{
	private static A obj=null;
	private A()
	{
	}
	public static A getObject()
	{
		if(obj==null)
		{
			obj=new A();
		}
		return obj;
	}
}
class SigletonClass 
{
	public static void main(String[] args) 
	{
		System.out.println(A.getObject().hashCode());
		System.out.println(A.getObject().hashCode());
		System.out.println(A.getObject().hashCode());
	}
}
