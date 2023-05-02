import java.util.*;
class number19
{
    public static void main(String args[])
    {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        num= sc.nextInt();
        if(num%2==1)
        {
            System.out.println("The number is odd");
        }
        else
        {
            System.out.println("The number is even");
        }
    }
}