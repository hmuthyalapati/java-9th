import java.util.Scanner;
public class Triangle_Area
{
    public static void main(String args[])
    {
        double b,h;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the height and base:");
        b=sc.nextDouble();
        h=sc.nextDouble();
        double area=(b*h)/2.0;
        System.out.println("The area is: "+area);
    }
}