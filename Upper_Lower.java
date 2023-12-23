import java.util.Scanner;
public class Upper_Lower
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the uppercase letter:");
        char upper=sc.next().charAt(0);
        int ask = upper;
        ask+=32;
        char lower = (char)ask;
        System.out.println("The lowercase letter is: "+lower);
    }
}