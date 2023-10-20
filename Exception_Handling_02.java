import java.util.*;
public class Exception_Handling_02
{
    public static void main(String args[])
    {
        int num=0;
        Scanner sc=new Scanner(System.in);
        try
        {
            num=sc.nextInt();
        }
        catch(InputMismatchException obj)
        {
            System.out.println("Enter a number"+obj);
        }
        finally
        {
            sc.close();
        }
        System.out.println(num);
    }
}