import java.util.Scanner;
public class CI
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the principal, r1, r2, and r3:");
        double p=sc.nextDouble();
        double r1=sc.nextDouble();
        double r2=sc.nextDouble();
        double r3=sc.nextDouble();
        double a=p*(1+r1/100.0)*(1+r2/100.0)*(1+r3/100.0);
        double ci=a-p;
        System.out.print("The compound interest is: "+ci);
    }
}