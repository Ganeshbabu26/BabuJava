import java.util.*;
class binarysearch1
{
    public static int bs(int arr[],int target,int low,int high)
    {
        int mid = (low+high)/2;
        if(low>mid)
        {
            return -1;
        }
        else if(arr[mid] < target)
        {
            return bs(arr,target,mid+1,high);
        }
        else if(arr[mid] > target)
        {
            return bs(arr,target,low,mid-1);
        }
        else
        {
            return mid;
        }
    }
    public static int square(int n)
    {
        return n*n;
    }
    public static void main(String args[])
    {
        Scanner babu = new Scanner(System.in);
        System.out.print("Enter a value to find: ");
        int n = babu.nextInt();
        int arr[] = new int[101];
        for(int i=0;i<=100;i++)
        {
            arr[i] = square(i);
        }
        int index= bs(arr,n,0,arr.length-1);
        if (index != -1) 
        {
            System.out.println(n + " is a square number of " + index);
        } 
        else 
        {
            // Find closest square
            int closestIndex = 0;
            int minDiff = Math.abs(arr[0] - n);
            for (int i = 1; i < arr.length; i++) {
            int diff = Math.abs(arr[i] - n);
            if (diff < minDiff) 
            {
                minDiff = diff;
                closestIndex = i;
            }
        }
        System.out.println(n + " is not a perfect square.");
        System.out.println("Closest square is " + arr[closestIndex] + " (which is " + closestIndex + "²)");
        } 
        babu.close();
    }
}
