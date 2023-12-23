import java.util.Scanner;
public class Pytha
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a natural number greater than 1:");
        double n = sc.nextDouble();
        double f = 2*n;
        double s = n*n-1;
        double t = n*n+1;
        System.out.print("The pythagorean triplet is: "+f+" "+s+" "+t);
    }
}