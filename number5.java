import java.util.*;
class num
{
    void fibo(int a,int b,int i,int n)
    {
      
        if(i<=n)
        {
            System.out.println(a);
            fibo(b,a+b,i+1,n);
        }
    }
}
class number5
{
  public static void main(String args[])
  {
      num n = new num();
      n.fibo(0,1,1,15);
  }
}