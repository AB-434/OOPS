public class Exception_Handling_03
{
    public static void main(String args[])
    {
        int num1=6;
        int num2=-2;
        try
        {
            if(num2<0)
            {
                Exception obj=new ArithmeticException();
                throw obj;
                //System.out.println("Enter a valid number");
            }
            else
            {
                int result=num1/num2;
                System.out.println(result);
            }
        }
        catch(Exception obj)
        {
            System.out.println("Error"+obj);
        }
    }
}