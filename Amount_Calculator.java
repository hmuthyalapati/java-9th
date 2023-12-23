import java.util.Scanner;
public class Amount_Calculator
{
    public static void main(String args[])
    {
        double p;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the principle:");
        p=sc.nextDouble();
        double afterdisc=p-(p*(1/10.0));
        double amount=afterdisc+(afterdisc*(9/100.0));
        System.out.println("The amount is: "+amount);
    }
}