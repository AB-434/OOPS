interface Apple
{
    int num=5;
    void show();
    default void display()
    {
        System.out.println("Bye");
    }
    static void message()
    {
        System.out.println("Message");
    }
}
interface XY
{
    void print();
}
class Banana implements Apple,XY
{
    public void show()
    {
        System.out.println("Hello");
    }
    public void print()
    {
        System.out.println("Hii");
    }
}
public class Interface{
    public static void main(String args[]){
        System.out.println(Apple.num);
        Banana obj=new Banana();
        //A obj=new B(); can't call print() function
        obj.show();
        obj.print();
        obj.display();
        Apple.message();
    }
}

/*
Only abstract methods
Cannot be instantiated
Variables are public,static,final
Methods are public,abstract
No Constructor
*/

/*
1.Default Methods in Interfaces
2.Static Methods in Interfaces
3.Functional Interfaces (Only one abstract method)
*/