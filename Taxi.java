import java.util.*;
public class Taxi
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the taxi no, kilometers, and name: ");
        int taxino=sc.nextInt();
        double k=sc.nextDouble();
        String name=sc.next();
        double bill;
        if (k<=1)
            bill=25;
        else if(k<=6)
            bill=25+(k-1)*10;
        else if(k<=12)
            bill=25+10*5+(k-6)*15;
        else if(k<=18)
            bill=25+10*5+15*6+(k-12)*20;
        else
            bill=25+10*5+15*6+20*6+(k-18)*25;
        System.out.println("Taxino\tName\tKilometres Traveled\tBill Amount");
        System.out.println(taxino+"\t"+name+"\t\t"+k+"\t\t"+bill);
    }
}