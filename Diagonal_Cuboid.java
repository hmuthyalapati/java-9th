import java.util.Scanner;
public class Diagonal_Cuboid
{
    public static void main(String args[])
    {
        double l,w,h;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length, width, and height:");
        l=sc.nextDouble();
        w=sc.nextDouble();
        h=sc.nextDouble();
        double squarediag=(l*l)+(w*w)+(h*h);
        double diag=Math.sqrt(squarediag);
        System.out.println("The diagnol of the cuboid is: "+diag);
    }
}