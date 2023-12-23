import java.util.Scanner;
public class Day_Calculator
{
    public static void main(String args[])
    {
        int day;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of days:");
        day=sc.nextInt();
        int year=day/360;
        int remainday1=day%360;
        int month=remainday1/30;
        int remainday2=remainday1%30;
        System.out.println("Years: "+year+" Months: "+month+" Days: "
        +remainday2);
    }
}