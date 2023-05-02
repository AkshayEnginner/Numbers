import java.util.*;
class number16
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[5];
        int sum=0;
        int average;
        System.out.println("Enter the numbers");
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
         
         for(int i=0;i<arr.length;i++)
        {
            sum=sum+arr[i];
           
        }
         System.out.println(sum);
         average=sum/arr.length;
          System.out.println("average is " +average);
        
    }
}