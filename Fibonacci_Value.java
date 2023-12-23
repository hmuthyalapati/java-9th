import java.util.*;
public class Fibonacci_Value
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n=sc.nextInt();
        System.out.println("Fibonacci series till: "+n);
        int f=0, s=1;
        int t=f+s;
        System.out.println(f+"\n"+s);
        while(t<=n)
        {
            System.out.println(t);
            f=s;
            s=t;
            t=f+s;
        }
    }
}