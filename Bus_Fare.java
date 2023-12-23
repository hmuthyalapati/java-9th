import java.util.*;
public class Bus_Fare
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the distance traveled: ");
        double d=sc.nextDouble();
        double fare;
        if(d<=10)
        {
            fare=80;
        }
        else if(d<=20)
        {
            fare=80+(d-10)*6;
        }
        else if(d<=30)
        {
            fare=80+10*6+(d-20)*5;
        }
        else
        {
            fare=80+10*6+10*5+(d-30)*4;
        }
        System.out.println("The fare is: "+fare);
    }
}