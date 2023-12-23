import java.util.*;
public class Automorphic
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int n=sc.nextInt();
        int temp=n, sqr, sqrr, c=0;
        while (temp > 0)
        {
            temp=temp/10;
            c++;
        }
        sqr=n*n;
        sqrr=sqr%(int)Math.pow(10, c);
        if(sqrr==n)
            System.out.println("Automorphic Number");
        else
            System.out.println("Not Automorphic Number");
    }
}