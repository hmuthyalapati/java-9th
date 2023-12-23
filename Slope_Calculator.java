import java.util.Scanner;
public class Slope_Calculator
{
    public static void main(String args[])
    {
        int x1,y1,x2,y2;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the coordinates of point 1:");
        x1=sc.nextInt();
        y1=sc.nextInt();
        System.out.println("Enter the coordinates of point 2:");
        x2=sc.nextInt();
        y2=sc.nextInt();
        int slope=(y2-y1)/(x2-x1);
        System.out.println("The slope is: "+slope);
    }
}