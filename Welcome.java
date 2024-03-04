import java.util.*;
public class Welcome
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the word: ");
        String word=sc.next();
        int l=word.length();
        for(int i=l; i>=1; i--)
        {
            int pos=0;
            for(int j=1; j<=i; j++)
            {
                System.out.print(word.charAt(pos));
                pos++;
            }
            System.out.println();
        }
    }
}