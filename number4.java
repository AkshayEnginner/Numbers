import java.util.*;
class number4
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int a=0,b=1,c=0,i;
        System.out.println(a);
         System.out.println(b);
        for( i=0;i<=10;i++)
        {
           
            c=a+b;
            System.out.println(c);
            a=b;
            b=c;
        }
        
       
        
    }
}