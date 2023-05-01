import java.util.*;
class number6
{
    public static void main(String args[])
    {
        int num,temp,rev=0,rem;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        num=sc.nextInt();
        temp=num;
        while(temp!=0)
        {
            rem=temp%10;
            rev=rev*10+rem;
            temp=temp/10;
        }
       if(num==rev)
       {
           System.out.println("The number is palindrome");
       }
       else
       {
            System.out.println("The number is not palindrome");
       }
    }
}