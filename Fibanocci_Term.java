public class Fibanocci_Term
{
    public static void main(String args[])
    {
        int f=0, s=1, t, n=10;
        System.out.print(f+","+s);
        for(int i=2;i<n;++i)
        {
            t=f+s;
            f=s;
            s=t;
            System.out.print(","+t);
        }
    }
}