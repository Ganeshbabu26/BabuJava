import java.util.*;

class Babu
{
	public static void main(String args[])
	{
		String n = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		int j;
		String b = "";
		for(j=0;j<n.length();j+=4)
		{
			b = b + n.charAt(j);
		}
		System.out.print("\n"+b);
		
		b = "";
		for(j=1;j<n.length();j+=4)
		{
			b = b + n.charAt(j);
		}
		System.out.print("\n"+b);
		
		b = "";
		for(j=2;j<n.length();j+=4)
		{
			b = b + n.charAt(j);
		}
		System.out.print("\n"+b);
		
		b = "";
		for(j=3;j<n.length();j+=4)
		{
			b = b + n.charAt(j);
		}
		System.out.print("\n"+b);
	}
}

class Ganesh
{
    public static void main(String args[]) {
    String n = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    String b0 = "", b1 = "", b2 = "", b3 = "";

        for (int i = 0; i < n.length(); i++) 
		{
            int mod = i % 4;
            if (mod == 0)
                b0 += n.charAt(i);
            else if (mod == 1)
                b1 += n.charAt(i);
            else if (mod == 2)
                b2 += n.charAt(i);
            else
                b3 += n.charAt(i);
        }

        System.out.println(b0);
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
    }
}

class a
{
	public int square(int x)
	{
		return x*x;
	}
	public static double squareRoot(int x)
	{
		return Math.sqrt(x);
	}
}

class b extends a 
{
	public static void main(String args[])
	{
		a b1 = new a();
		System.out.println(b1.square(12));
		System.out.println(squareRoot(169));
	}
}

class b1
{
	public static void main(String args[])
	{
		ArrayList<Integer> a = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9));
		a.add(10);
		System.out.print(a);
		ArrayList<Integer> b = new ArrayList<>(Arrays.asList());
		for(int i=0;i<a.size();i++)
		{
			b.add(i*i);
		}
		System.out.print(b);
	}
}


class b2 
{
    public static void main(String args[]) {
        ArrayList<Integer> a = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9));
        a.add(10);  // append 10
        System.out.println(a);  // print full list

        for (int i = 0; i < a.size(); i++) {  // ✅ Use size()
            System.out.print(a.get(i) + " "); // ✅ Access element using get()
        }
    }
}

class sort1
{
	public static void main(String args[])
	{
		ArrayList<Integer> a = new ArrayList<>(Arrays.asList(45,12,34,78,56,26,9,17));
		System.out.print("\nBefore sort: "+a);
		int i,j;
		for(i=0;i<a.size();i++)
		{
			for(j=0;j<a.size();j++)
			{
				if(a.get(i)<a.get(j))
				{
					int temp = a.get(i);
					a.set(i,a.get(j));
					a.set(j,temp);
				}
			}
		}
		System.out.print("\nAfter sort: "+a);
		//Collections.sort(a);  // Ascending
		//Collections.sort(a, Collections.reverseOrder());  // Descending

	}
}

class sort2
{
	public static void main(String args[])
	{
		ArrayList<Integer> a = new ArrayList<>(Arrays.asList(56,76,34,12,98,76,45,23,56,16,67));
		int i,j;
		System.out.print("\nBefore sort: "+a);
		for(i=0;i<a.size();i++)
		{
			for(j=0;j<a.size();j++)
			{
				if(a.get(i)<a.get(j))
				{
					int temp = a.get(i);
					a.set(i,a.get(j));
					a.set(j,temp);
				}
			}
		}
		System.out.print("\nAfter sort: "+a);
	}
}

class bsquare
{
	public static void main(String args[])
	{
		ArrayList<Integer> a = new ArrayList<>(Arrays.asList(10,20,30,40,50,60,70,80,90,100));
		System.out.print("Original: "+a);
		//ArrayList<Integer> b = new ArrayList<>(Arrays.asList());
		for(int i=0;i<a.size();i++)
		{
			int c = a.get(i)*a.get(i);
			a.set(i,c);
		}
		System.out.print("\nSquare: "+a);
	}
}

class pal
{
	public static void main(String args[])
	{
		ArrayList<String> a = new ArrayList<>(Arrays.asList("Ganesh","babu"));
		int i,j;
		for(i=0;i<a.size();i++)
		{
			String b="";
			String original = a.get(i);
			for(j=a.get(i).length()-1;j>=0;j--)
			{
				b = b + original.charAt(j);
				a.set(i,b);
			}
		}
		System.out.print(a);
	}
}

class pal2
{	
	String pal(String n)
	{
		n = n.toLowerCase();
		String b = "";
		for(int i = n.length()-1;i>=0;i--)
		{
			b += n.charAt(i);
		}
		return b;
	}

	public static void main(String args[])
	{
		pal2 p = new pal2();
		//Print all in reverse
		ArrayList<String> a = new ArrayList<>(Arrays.asList("Ganesh","Babu","Markram","liril","malayalam"));
		int i,j;
		for(i=0;i<a.size();i++)
		{
			a.set(i,p.pal(a.get(i)));
		}
		System.out.print("\nAll: "+a);

		//print only palindrome
		ArrayList<String> b = new ArrayList<>(Arrays.asList());
		for(i=0;i<a.size();i++)
		{
			if(a.get(i).equals(p.pal(a.get(i))))
			{
				b.add(a.get(i));
			}
		}
		System.out.print("\nThere are "+b.size()+" palindromes in given array");
		System.out.print("\nOnly palindrome: "+b);
	}
}
		