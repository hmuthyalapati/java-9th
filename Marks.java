import java.util.Scanner;
public class Marks
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the term 1 marks:");
        double t1=sc.nextDouble();
        System.out.println("Enter the term 2 marks:");
        double t2=sc.nextDouble();
        System.out.println("Enter the final term marks:");
        double f=sc.nextDouble();
        double fwp=(0.3*t1+0.3*t2+0.4*f)/100.0;
        double fwm=fwp*500;
        System.out.println("The final weighted marks is: "+fwm+"/500");
    }
}