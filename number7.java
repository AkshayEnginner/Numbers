import java.util.*;
class palindrome
{
    void function(int num,int rev,int rem,int temp)
    {
        temp=num;
        while(temp!=0)
        {
            rem = temp%10;
            rev = rev*10+rem;
            temp = temp/10;
        }
        if(rev==num)
        {
            System.out.println("The number is palindrome");
        }
        else
        {
              System.out.println("The number is not palindrome");
        }
        
    }
}
class number7
{
    public static void main(String args[])
    {
        palindrome a = new palindrome();
        a.function(242,0,0,0);
    }
}