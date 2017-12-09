class MyThread extends Thread 
{
	public void run()
	{
		for(int i=0;i<10;i++)
			System.out.println("child thread ");
	}

}
class ThreadByClass
{
	public static void main(String[] args) 
	{
		MyThread tr=new MyThread();
		tr.start();
		tr.run();
		for(int i=0;i<10;i++)
			System.out.println(" main class ");

	}
}
