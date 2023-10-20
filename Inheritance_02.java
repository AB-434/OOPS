package OOPS;

public class Inheritance_02 {
    public static void main(String[] args) {
        Panda obj=new Panda(5);
        //obj.sum();//Cant call private method
    }
}
class Butterfly
{
    int number=5;
    private int num=10;
    Butterfly()
    {
        System.out.println("Butterfly");
    }
    Butterfly(int x)
    {
        System.out.println("X");
    }
    private void sum()
    {
        System.out.println("Sum"+(num+5));
    }
}
class Panda extends Butterfly
{
    Panda()
    {
        //super(5);
        this(7);
        System.out.println("Panda");
    }
    Panda(int x)
    {
        System.out.println("Y");
    }
    void display()
    {
        System.out.println(number);//Cant call num
    }
}
