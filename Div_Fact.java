import java.util.*;
public class Div_Fact
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the numbers: ");
        int n=sc.nextInt();
        int a=sc.nextInt();
        double sum=0;
        for(int i=1; i<=n; i++)
        {
            if(i%2!=0)
                sum=sum+i/Math.pow(a, i);
            else
                sum=sum-i/Math.pow(a, i);
        }
        System.out.println("Sum= "+sum);
    }
}