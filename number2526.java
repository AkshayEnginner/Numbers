import java.util.*;
class number2526
{
    public static void main(String args[])
    {
        int num,square,cube;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the num");
        num=sc.nextInt();
        square = num*num;
        System.out.println("Square of the num is " +square);
        cube = square*num;
        System.out.println("Cube of the num is " +cube); 
        
    }
}