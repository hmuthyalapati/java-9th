import java.util.*;
public class Special
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number: ");
        int n=sc.nextInt();
        int r, num=n, sum=0;
        while(num>0) 
        {
            r=num%10;
            int f=1;
            for(int i=1;i<=r;i++)
                f=f*i;
            sum=sum+f;
            num=num/10;
        }
        if(n==sum)
            System.out.println("Special Number" );
        else
            System.out.println("Not Special Number" );
    }
}