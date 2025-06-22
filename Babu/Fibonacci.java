package Babu;

public class Fibonacci 
{
    public static int fibo(int n)
    {
        return switch (n) {
            case 0 -> 0;
            case 1 -> 1;
            default -> fibo(n-1) + fibo(n-2);
        };
    }
    public static void NthFibo(int n)
    {
        int i;
        System.out.print("Fibo series: ");
        for(i = 0;i<n;i++)
        {
            System.out.print(fibo(i)+" ");
        }
    }
}
