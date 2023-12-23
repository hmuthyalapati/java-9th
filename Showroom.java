import java.util.*;
public class Showroom
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the total cost of the item: ");
        double c=sc.nextDouble();
        double d, a;
        String gift;
        if(c<=2000)
        {
            d=c*(5.0/100);
            gift = "Wall Clock";
        }
        else if(c<=5000)
        {
            d=c*(10.0/100);
            gift = "School Bag";
        }
        else if(c<=10000)
        {
            d=c*(15.0/100);
            gift = "Eletric Iron";
        }
        else
        {
            d=c*(20.0/100);
            gift = "Wrist Watch";
        }
        a=c-d;
        System.out.println("The discount is: "+d);
        System.out.println("The amount is: "+a);
        System.out.println("The gift is: "+gift);
    }
} 