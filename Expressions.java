import java.util.Scanner;
public class Expressions
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of a:");
        int a = sc.nextInt();
        System.out.println("Enter the value of b:");
        int b = sc.nextInt();
        System.out.println("Enter the value of c:");
        int c = sc.nextInt();
        double sum = 1.0/(a*a)+2.0/(b*b)+3.0/(c*c);
        System.out.println("The sum is: "+sum);
    }
}