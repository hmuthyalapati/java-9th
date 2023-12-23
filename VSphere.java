import java.util.Scanner;
public class VSphere
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the volume:");
        double v=sc.nextDouble();
        double r=Math.cbrt(v*(3/4.0)*(7/22.0));
        System.out.print("The radius is: "+r);
    }
}