import java.util.*;
public class Co_Prime
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        int min=Math.min(n1, n2);
        int hcf=0;
        for(int i=1; i<=min; i++)
        {
            if(n1%i==0 && n2%i==0)
                hcf=i;
        }
        if(hcf==1)
            System.out.println("Co-prime");
        else
            System.out.println("Not co-prime");
    }
}