import java.util.*;
public class In_De
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the numbers and your choice: ");
        double n1=sc.nextDouble();
        double n2=sc.nextDouble();
        double n3=sc.nextDouble();
        int c=sc.nextInt();
        double t=(n1>n2)?n1:n2;
        double g=(t>n3)?t:n3;
        double te=(n1<n2)?n1:n2;
        double s=(te<n3)?te:n3;
        double m=(n1+n2+n3)-g-s;
        switch(c)
        {
            case 1:
                System.out.println("The numbers in increasing order are: "+s+", "+m+", "+g);
                break;
            case 2:
                System.out.println("The numbers in decreasing order are: "+g+", "+m+", "+s);
                break;
            default:
                System.out.println("Invalid Input");
        }
    }
}