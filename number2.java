import java.util.*;
class number2
{
    public static void main(String args[])
    {
        int num,rem,arm=0,temp=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        num= sc.nextInt();
        temp=num;
      while(num>0)
      {
        rem=num%10;
        arm= (rem*rem*rem)+arm;
        num=num/10;
       
      }
      if(temp==arm)
      {
       System.out.println("is armstrom");
      }
      else
      {
           System.out.println("is not armstrom");
          
      }
    }
}