import java.util.*;
public class Pass_Taxi
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the kilometers: ");
        double k=sc.nextDouble();
        double bill;
        if (k<=5)
            bill=100;
        else if(k<=15)
            bill=100+(k-5)*10;
        else if(k<=25)
            bill=100+10*10+(k-15)*8;
        else
            bill=100+10*10+10*8+(k-25)*5;
        System.out.println("The distance covered is: "+k);
        System.out.println("The bill is: "+bill);
    }
}