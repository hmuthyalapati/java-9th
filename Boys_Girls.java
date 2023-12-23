import java.util.*;
public class Boys_Girls
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of girls, boys, girls absent, and boys absent: ");
        int g=sc.nextInt();
        int b=sc.nextInt();
        int ga=sc.nextInt();
        int ba=sc.nextInt();
        double gp=(double)(g-ga)/(g+b)*100;
        double bp=(double)(b-ba)/(g+b)*100;
        System.out.println("Girls percentage: "+gp);
        System.out.println("Boys percentage: "+bp);
    }
}