import java.util.*;
class binarysearch
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
        int index = bs(arr,n,0,arr.length-1);
        if (index != -1)
        {
            System.out.print(n+" found at index: "+index);
        }
        else
        {
            System.out.print(n+" is not found");
        }   
        babu.close();
    }
}
