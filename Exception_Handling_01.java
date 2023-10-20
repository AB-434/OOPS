public class Exception_Handling_01
{
    public static void main(String args[])
    {
        int num1=6;
        int num2=2;
        int result=0;
        int values[]={1,3,5,7};
        try
        {
            result=num1/num2;
            //System.out.println("In Try Block");
            System.out.println(values[4]);
        }
        catch(ArithmeticException obj)
        {
            System.out.println("Can't divide by zero"+obj);
        }
        catch(ArrayIndexOutOfBoundsException obj)
        {
            System.out.println(values[values.length-1]);
            System.out.println("Stay in your limits"+obj);
        }
        catch(Exception obj)
        {
            System.out.println("Something went wrong"+obj);
        }
        System.out.println(result);
    }
}
