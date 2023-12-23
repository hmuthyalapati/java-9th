import java.util.Scanner;
public class Volume_SA_Cylinder
{
    public static void main(String args[])
    {
        double r,h;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the radius and height:");
        r=sc.nextDouble();
        h=sc.nextDouble();
        double volume=(22.0/7)*(r*r)*h;
        double sa=(2*(22.0/7)*r*h) + (2*(22.0/7)*(r*r));
        System.out.println("The volume is: "+volume);
        System.out.println("The surface area is: "+sa);
    }
}