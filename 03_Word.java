import java.util.*;

class word
{
    String pal(String n)
    {
        String b = "";
        for(int i = n.length() -1;i>=0;i--)
        {
            b = b + n.charAt(i);
        }
        return b;
    }
    public static void main(String args[])
    {
        word b1 = new word();
        ArrayList<String> a = new ArrayList<>(Arrays.asList("Ganesh","Babu","Tenet","Rotator","Malayalam","racecar"));
        ArrayList<String> b = new ArrayList<>(Arrays.asList());
        ArrayList<String> c = new ArrayList<>(Arrays.asList());
        for(int i = 0;i<a.size();i++)
        {
            a.set(i,b1.pal(a.get(i)));
        }

        for(int i = 0;i<a.size();i++)
        {
            if(a.get(i).equalsIgnoreCase(b1.pal(a.get(i))))
            {
                b.add(b1.pal(a.get(i)));
            }
            else
            {
                c.add(b1.pal(a.get(i)));
            }
        }

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}