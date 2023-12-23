import java.util.Scanner;
public class Farenheit_to_Celcius
{
    public static void main(String args[])
    {
        double F,C;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the farenheit:");
        F=sc.nextDouble();
        C=((F-32)*5)/9.0;
        System.out.println("The converted temperature is: "+C);
    }
}