public class Prime_Pal
{
    static boolean prime(int n)
    {
        int c=0;
        for(int i=1; i<=n/2; i++)
        {
            if(n%i==0)
                c++;
        }
        if (c==1)
            return true;
        else
            return false;
    }
    public static void main()
    {
        for(int i=10; i<=1000; i++)
        {
            int rev=0;
            int temp=i;
            while (i>0)
            {
                int d=i%10;
                rev=rev*10+d;
                i=i/10;
                System.out.println(temp+" "+i);
            }
            if(prime(rev)==true&&prime(temp)==true)
                System.out.println("Hello ");
        }
    }
}