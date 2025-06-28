import java.util.Scanner;

public class StringAscii
{
    public static void main(String x[])
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter String ");
        String str=s.nextLine();
        for(int i=0;i<str.length();i++)
        {
            System.out.print((int)str.charAt(i)+" ");
        }
    }
}