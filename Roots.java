import java.util.*;
public class Roots
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a, b, and c: " );
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int d=b*b-4*a*c;
        if (d>=0)
        {
            double r1=(-b+Math.sqrt(d))/2*a;
            double r2=(-b-Math.sqrt(d))/2*a;
            System.out.println("Roots are real and are: "+r1+","+r2);
        }
        else 
            System.out.println("Roots are imaginary");
    }
}