import java.util.*;
public class Pronic_Number
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n=sc.nextInt();
        boolean flag=false;
        for(int i=1; i<n; i++)
        {
            if(i*(i+1)==n)
            {
                flag=true;
                break;
            }
        }
        if(flag==true)
            System.out.println("Pronic");
        else
            System.out.println("Not pronic");
    }
}