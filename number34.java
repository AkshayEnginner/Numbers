import java.util.*;
class number34
{
    public static void main(String args[])
    {
        int year;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the year");
        year=sc.nextInt();
        if(year%4==0)
        {
             System.out.println("It is the leap year");
        }
        else
        {
             System.out.println("It is not the leap year");
        }
    }
}