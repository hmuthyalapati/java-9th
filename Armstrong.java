import java.util.*;
public class Armstrong
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n=sc.nextInt();
        int d, sum=0, temp=n;
        while(n!=0)
        {
            d=n%10;
            sum+=d*d*d;
            n/=10;
        }
        if(sum==temp)
            System.out.println("Armstrong number");
        else
            System.out.println("Not an armstrong number");
    }
}