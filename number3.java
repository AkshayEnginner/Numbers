import java.util.*;
class number3
{
    public static void main(String args[])
    {
        int num,temp=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        num=sc.nextInt();
        for(int i=2;i<=num-1;i++)
        {
            if(num%i==0)
            {
                temp=temp+1;
            }
        }
        if(temp==0)
        {
            System.out.println("number is prime");
        }
        else
        {
             System.out.println("number is not prime");
        }
    }
}