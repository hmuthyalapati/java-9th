import java.util.*;
public class Sum_Square 
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a and the number: ");
        int a=sc.nextInt();
        int n=sc.nextInt();
        int f=1 ;
        double sum=0.0;
        for (int i=1; i<=n; i++)
        {
            int e= f+i ;
            sum=sum+ f/Math.pow(a,e);
            f+=3 ;
        }
        System.out.println ( "The sum is: " + sum);
    }
}