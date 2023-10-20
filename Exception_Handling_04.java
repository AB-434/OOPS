class Demo
{
    public void A() throws Exception
    {
        B();
    }
    public void B() throws Exception
    {
        int num1=8;
        int num2=0;
        int result=num1/num2;
        System.out.println(result);
    }
}
public class Exception_Handling_04
{
    public static void main(String args[])
    {
        Demo obj=new Demo();
        try
        {
            obj.A();
        }
        catch(Exception ob)
        {
            System.out.println("Exception"+ob);
        }
    }
}

