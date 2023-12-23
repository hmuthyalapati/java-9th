import java.util.*;
public class Term_Deposit
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the sum, age, and term:");
        double sum=sc.nextDouble();
        double age=sc.nextDouble();
        double term=sc.nextDouble();
        double interest;
        if (age<60){
            if(term<=1)
                interest = sum*7.5/100;
            else if(term<=2)
                interest = sum*8.5*2/100;
            else if(term<=3)
                interest=sum*9.5*3/100;
            else 
                interest=sum*10.0*term/100; 
        }
        else{
            if(term<=1)
                interest=sum*8.0/100;
            else if(term<=2)
                interest=sum*9.0*2/100;
            else if(term<=3)
                interest=sum*10.0*3/100;
            else
                interest=sum*11.0*term/100;
        }
        double amount=sum+interest;
        System.out.println("Amount Deposited\tTerm\tAge\tInterest Earned\tAmount Paid");
        System.out.println(sum+"\t\t"+term+"\t"+age+"\t"+interest+"\t"+amount);
    }
}