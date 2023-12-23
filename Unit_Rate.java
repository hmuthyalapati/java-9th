import java.util.*;
public class Unit_Rate
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the consumer's name, number, and number of units.");
        String name=sc.nextLine();
        int num=sc.nextInt();
        int units=sc.nextInt();
        double bill;
        if (units <=100)
        {
            bill = units * 5.50;
        }
        else if (units <=300)
        {
            bill=100*5.50 + (units-100)*6.50;
        }
        else if (units <=600)
        {
            bill=100*5.50 + 200*6.50 + (units-300)*7.50;
        }
        else 
        {
            bill=100*5.50 + 200*6.50 + 300*7.50 + (units-600)*8.50;
        }
        System.out.println("The bill is: "+bill);
    }
}