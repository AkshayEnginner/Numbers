import java.util.*;
class number14
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        
        int num;
        int sum=0;
        System.out.println("Enter the number");
        num=sc.nextInt();
        for(int a=1;a<num;a++)
        {
            if(num%a==0)
            {
                 //System.out.println(a);
               sum=sum+a;
            }
        }
        if(num==sum)
        {
            System.out.println("Number is perfect");
        }
        else
        {
            System.out.println("Number is not perfect");
        }
    }
}