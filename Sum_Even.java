import java.util.Scanner;
public class Sum_Even
{
    public static void main(String args[]) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n=sc.nextInt();
        int sum=0;
        for (int pos=1, i=2; pos<=n; pos++, i+=2) 
        {
            if (pos%2==0)
                sum-=i;
            else 
                sum+=i;
        }
        System.out.println("The sum is: " + sum);
    }
}