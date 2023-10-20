package OOPS;
public class Data_Abstraction {
    public static void main(String[] args) {
        M ref1=new N();
        ref1.print();
        ref1.display();
        M ref2=new O();
        ref2.print();
        ref2.display();
        ref1.message();
        ref2.message();
        ((N) ref1).alert();//Downcasting
    }
}

abstract class M{
    abstract void print();
    abstract void display();
    void message()
    {
        System.out.println("Hello");
    }
}
class N extends M{
    void print()
    {
        System.out.println("B");
    }
    void display()
    {
        System.out.println("Mango");
    }
    void alert()
    {
        System.out.println("Alert");
    }
}
class O extends M{
    void print()
    {
        System.out.println("C");
    }
    void display()
    {
        System.out.println("Coconut");
    }
}
