import java.util.*;
public class Series1
{
    public static void main() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n=sc.nextInt();
        double sum=0;
        for (int i=1,d=1; i<=n; i++, d+=2) 
        {
            double f=1;
            for (int j=1; j<=i; j++) 
            {
                f*=j;
            }
            sum+=d/f;
        }
        System.out.println("Sum=" + sum);
    }
}