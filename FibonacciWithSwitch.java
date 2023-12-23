import java.util.*;
public class FibonacciWithSwitch
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your choice: 1. Fibonacci Series, 2. Quad, 3. Increasing; and the number");
        int c=sc.nextInt();
        int n=sc.nextInt();
        switch (c)
        {
            case 1: 
               int f=0, s=1, t;
                System.out.print(f+","+s);
                for(int i=2;i<n;++i)
                {
                    t=f+s;
                    f=s;
                    s=t;
                    System.out.print(","+t);
                } 
                break;
            case 2:
                for (int i=1; i<=n; i++) 
                {
                    int q=i*i-1;
                    System.out.print(q+" ");
                }
                break;
            case 3:
                for (int i=1; i<=n; i++) 
                {
                    for (int j=1; j<=i; j++) 
                    {
                        System.out.print(j);
                    }
                    System.out.print(", ");
                }      
                break;
            default:
                System.out.println("Invalid input");
        }
    }
}