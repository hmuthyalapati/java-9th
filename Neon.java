import java.util.*;
public class Neon
{
    public static void main(String args[])
    {    
        Scanner sc = new Scanner(System.in);  
        System.out.print("Enter the number: ");   
        int n=sc.nextInt(); 
        int sum=0, d, s=n*n;
        while(s!=0)  
        {  
            d=s%10;  
            sum+=d;  
            s/=10;  
        }  
        if(n==sum)  
            System.out.println("Neon number");  
        else  
            System.out.println("Not a neon number");
    }
}