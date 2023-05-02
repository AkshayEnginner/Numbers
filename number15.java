import java.util.*;
class number15
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int arr[] = {2,3,5,6,4,6,8,4,6};
        int sum=0,average=0;
        for(int i=0;i<arr.length;i++)
        {
            sum = sum+arr[i];
        }
        System.out.println(sum);
        average=sum/arr.length;
        System.out.println(average);
    }
}