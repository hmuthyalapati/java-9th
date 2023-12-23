import java.util.*;
public class Twisted_Prime
{
    static boolean prime(int n)
    {
        int c=0;
        for(int i=1; i<=n; i++)
        {
            if(n%i==0)
                c++;
        }
        if(c==2)
            return true;
        else
            return false;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num=sc.nextInt();
        int rev=0;
        int temp=num;
        while (num>0)
        {
            int d=num%10;
            rev=rev*10+d;
            num=num/10;
        }
        if(prime(rev)==true&&prime(temp)==true)
            System.out.println("Twisted Prime");
        else
            System.out.println("Not twisted prime");
    }
}