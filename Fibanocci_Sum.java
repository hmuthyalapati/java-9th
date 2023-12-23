import java.util.*;
public class Fibanocci_Sum
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n=sc.nextInt();
        int f = 1, s = 1, t = 0;
    int sum = 2;
    for (int i = 3; i < n; i++) 
    {
            t = f + s; 
            f = s;
            s = t;
            sum = sum + t;
        }
        System.out.println("The sum is: "+sum);
    }
}