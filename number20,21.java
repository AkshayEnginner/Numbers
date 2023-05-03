import java.util.*;
class number20,21
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        
        int temp=0;
        int tilno;
        System.out.println("enter upto prime number u want");
        tilno=sc.nextInt();
        
         
        for(int a=1;a<=tilno;a++)
        {
           for(int i=2;i<=a-1;i++)
          {
            if(a%i==0)
            {
               temp=temp+i;
            }
          } 
          if(temp==0)
          {
              System.out.println(a);
          }
          else
          {
              temp=0;
          }
        }
       
    }
}