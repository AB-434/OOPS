package OOPS;

public class Inheritance_01 {
    public static void main(String[] args) {
    Banana obj=new Banana();
    obj.print();
    /*Mango obj1=new Mango();
    obj1.print();
    obj1.display();
    obj1.text();*/
    Papaya obj2=new Papaya();
    obj2.print();
    //obj2.message();
}
}
class Apple
{
    void print()
    {
        System.out.println("Apple");
    }
}
class Banana extends Apple //Single Level Inheritance
{
    private void display()
    {
        System.out.println("Banana");
    }
}
class Mango extends Banana //Multi Level Inheritance
{
    void text()
    {
        System.out.println("Mango");
    }
    //Here display() is inherited method
}
class Papaya extends Apple //Hierarchical Inheritance
{
    void message() //Specialized Method
    {
        System.out.println("Papaya");
    }
    void print() // Overriding
    {
        System.out.println("Not Apple");
    }
}


