class ByteCheck 
{
	public static void main(String[] args) 
	{
		byte a=125;
		byte b=120;
		String s="111";
				String s1="12457";

		byte c;
		byte x=Byte.parseByte(s,3);
		int y=Integer.parseInt(s1,8);
		//	c=(byte)(a+b);
		c=127;
		//c++;
		//	c=c+12;
		//c+=12;
		System.out.println(c+"   "+x+"   "+y);
	}
}
