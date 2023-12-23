import java.util.*;
public class Parcel
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the type of booking and the weight:");
        char type=sc.next().charAt(0);
        double w=sc.nextDouble();
        double cost;
        if (type=='O'){
            if (w<=100)
                cost=80;
            else if(w<=500)
                cost=150;
            else if(w<=1000)
                cost=210;
            else
                cost=250;
        }
        else {
            if (w<=100)
                cost=100;
            else if(w<=500)
                cost=200;
            else if(w<=1000)
                cost=250;
            else
                cost=300;
        }
        System.out.print("The cost is: "+cost);
    }
}