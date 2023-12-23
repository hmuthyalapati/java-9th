public class Speed
{
    public static void main(String args[])
    {
        int d1=240, s1=60, s2=40;
        int tt= (d1/s1)+(d1/s2);
        double avgs=(s1+s2)/2;
        System.out.println("The total time taken is: "+tt);
        System.out.println("The average speed is: "+avgs);
    }
}