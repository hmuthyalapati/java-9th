import java.util.Scanner;
public class Maths
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the value:");
        double a = sc.nextDouble();
        double sr = Math.sqrt(a);
        double srr = Math.round(sr);
        double cr = Math.cbrt(a);
        double crr = Math.round(cr);
        System.out.print("The rounded square root and cube root are: "+srr+" "+crr);
    }
}