import java.util.*;
class number12
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int num=540;
        
        for(int i=2;i<num;i++)
        {
            while(num%i==0)
            {
            num=num/i;
            System.out.println(i);
            }
        }
    }
}