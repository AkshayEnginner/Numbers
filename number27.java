import java.util.*;
class number27
{
    public static void main(String args[])
    {
        int num,squareroot,a;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        num = sc.nextInt();
       for(int i=0;i<=1000;i++)
       {
           a=i*i;
           if(a==num)
           {
               System.out.println("Squareroot is" +i);
           }
       }
    }
}