import java.util.Scanner;
public class Swap
{
    public static void main(String args[])
    {
        int a,b;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the numbers:");
        a=sc.nextInt();
        b=sc.nextInt();
        int temp=a;
        a=b;
        b=temp;
        System.out.println("The swaped numbers are: "+a+" "+b);
    }
}