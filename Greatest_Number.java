import java.util.Scanner;
public class Greatest_Number
{
    public static void main(String args[])
    {
        int num1,num2,num3;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the numbers:");
        num1=sc.nextInt();
        num2=sc.nextInt();
        num3=sc.nextInt();
        int max1=Math.max(num1, num2);
        int max2=Math.max(max1, num3);
        System.out.println("The greatest number is: "+max2);
    }
}