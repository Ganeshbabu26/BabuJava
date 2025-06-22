
import java.util.*;

import Babu.Fibonacci;
import Babu.babuprint;
class Babu 
{
    public static void main(String args[])
    {
        babuprint.print("Babu");
        System.out.print("\n");
        System.out.print(Fibonacci.fibo(10));
        System.out.print("\n");
        Fibonacci.NthFibo(10);
        System.out.print("\n");

        Babu ba = new Babu();
        ba.newBabu();
    }
    void newBabu()
    {
        try (Scanner babu = new Scanner(System.in)) 
        {
            System.out.print("Enter a number: ");
            int n = babu.nextInt();
            int t1 = 0, t2 = 1, t;
            System.out.print("Fibo series: "+t1+" "+t2+" ");
            for(int i = 1;i<n-1;i++)
            {
                t = t1 + t2;
                t1 = t2;
                t2 = t;
                System.out.print(t+" ");
            }
        }
    }
}