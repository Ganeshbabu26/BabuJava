class Ganesh
{
	public static void main(String args[])
	{
		String a = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String b = "";
		for(int i = a.length()-1;i>=0;i--)
		{
			b = b + a.charAt(i);
		}
		System.out.print(b);
	}
}

class g2
{
	public static void main(String args[])
	{
		String a = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		
		String b = "";
		for(int i = 0;i<=a.length()-1;i+=4)
		{
			b = b + a.charAt(i);
		}
		System.out.print(b);
		
		b = "";		//
		for(int i = 1;i<=a.length()-1;i+=4)
		{
			b = b + a.charAt(i);
		}
		System.out.print("\n"+b);
		
		b = "";		//
		for(int i = 2;i<=a.length()-1;i+=4)
		{
			b = b + a.charAt(i);
		}
		System.out.print("\n"+b);
		
		b = "";		//
		for(int i = 3;i<=a.length()-1;i+=4)
		{
			b = b + a.charAt(i);
		}
		System.out.print("\n"+b);
	}
}