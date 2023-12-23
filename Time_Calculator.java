import java.util.Scanner;
public class Time_Calculator
{
    public static void main(String args[])
    {
        int sec;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of seconds:");
        sec=sc.nextInt();
        int hour=sec/3600;
        int rs1=sec%3600;
        int min=rs1/60;
        int rs2=rs1%60;
        System.out.println("Hours: "+hour+" Minutes: "+min+" Seconds: "+rs2);
    }
}