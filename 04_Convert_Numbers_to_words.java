import java.util.*;

class convert
{
    public static void main(String ab[])
    {
        Scanner babu = new Scanner(System.in);
        String n1[] = {"","One","Two","Three","Four","Five","Six","Seven","Eight","Nine","Ten"};
        String n2[] = {"","Eleven","Twelve","Thirteen","Fourteen","Fifteen","Sixteen","Seventeen","Eighteen","Nineteen"};
        String n3[] = {"","Twenty","Thirty","Forty","Fifty","Sixty","Seventy","Eighty","Ninety"};
        String n4[] = {"Hundred","Hundred and"};
        String n5[] = {"Thousand","Thousand and"};
        System.out.print("Enter a number (between 1 and 100000): ");
        int n = babu.nextInt();

        if(n>0)
        {
            if (n<=10)
            {
                System.out.print(n1[n]);
            }
            else if ((n>10) && n<20)
            {
                n = n%10;
                System.out.print(n2[n]);
            }
            else if (n>=20 && n<=99)
            {
                int rem = n%10;
                n = n/10;
                if (rem!=0)
                {
                    System.out.print(n3[n-1] +" "+ n1[rem]);
                }
                else
                {
                    System.out.print(n3[n-1]);
                }
            }
            else if  (n>=100 && n<=999)
            {                //234
                int num3 = n%10;
                n = n/10;

                int num2 = n%10;
                n = n/10;

                int num1 = n%10;

                if (num2!=0)
                {
                    System.out.print(n1[num1] + " " + n4[1] + " " + n3[num2-1] + " " + n1[num3]);
                }
                else if (num2==0 && num3==0)
                {
                    System.out.print(n1[num1] + " " + n4[0]);
                }
                else
                {
                    System.out.print(n1[num1] + " " + n4[1] + " "+ n1[num3]);
                }
            }
            else if(n>=1000 && n<=9999)
            {   // 3456
                int num4 = n%10;
                n = n/10;

                int num3 = n%10;
                n = n/10;

                int num2 = n%10;
                n = n/10;

                int num1 = n%10;

                if (num2!=0 && num3!=0 && num4!=0)          //1234    000
                {
                    System.out.print(n1[num1] + " " + n5[1] + " " + n1[num2] + " " + n4[1] + " " + n3[num3-1] + " " + n1[num4]);                    
                }
                else if (num2!=0 && num3!=0 && num4==0)  //7230    001
                {
                    System.out.print(n1[num1] + " " + n5[1] + " " + n1[num2] + " " + n4[1] + " " + n3[num3-1]);
                }
                else if (num2!=0 && num3==0 && num4!=0) // 6403    010
                {
                    System.out.print(n1[num1] + " " + n5[1] + " " + n1[num2]+ " " + n4[1] + " " + n1[num4]);
                }
                else if (num2!=0 && num3==0 && num4==0) //5600     011
                {
                    System.out.print(n1[num1] + " " + n5[1] + " " + n1[num2] + " " + n4[0]);
                }
                else if (num2==0 && num3!=0 && num4!=0) // 3066     100
                {
                    System.out.print(n1[num1] + " " + n5[1] + " " + n3[num3-1] + " " + n1[num4]);
                }
                else if (num2==0 && num3!=0 && num4==0) // 6040    101
                {
                    System.out.print(n1[num1] + " " + n5[1] + " " + n3[num3-1]);
                }
                else if (num2==0 && num3==0 && num4!=1) // 8003     110
                {
                    System.out.print(n1[num1] + " " + n5[1] + " " + n1[num4]);
                }
                else if (num2==0 && num3==0 && num4!=1) // 8000     111
                {
                    System.out.print(n1[num1] + " " + n5[0]);
                }
                else
                {
                    System.out.print("No result");
                }
            }
            else
            {
                System.out.print("One lakhs");
            }
        }
        else
        {
            System.out.print("No result");
        }
    }
}