import java.util.Scanner;
public class Quad
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the values of a,b,c:");
        double a=sc.nextDouble();
        double b=sc.nextDouble();
        double c=sc.nextDouble();
        double d=Math.round(b*b-4*a*c);
        System.out.print("The rounded discriminant is: "+d);
    }
}