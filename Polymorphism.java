package OOPS;
class Polymorphism{
    public static void main(String args[]){
        //Static Polymorphism : At compilation time eg, Overloading
        //Dynamic Polymorphism : At runtime eg, Overriding
        A obj1=new A();
        A obj2=new B();
        A obj3=new C();
        obj1.print();
        obj1.display();
        obj2.print();
        obj2.display();
        obj3.print();
        obj3.display();
        Array obj=new Array();
        //obj.poly(obj1);
        //obj.poly(obj2);
        //obj.poly(obj3);
		/*A ref;
		ref=obj1;
		ref.print();
		ref.display();*/
    }
}
class Sample{
    void poly(A ref)
    {
        ref.print();
        ref.display();
        System.out.println("-----------");
    }
}
class A{
    void print()
    {
        System.out.println("A");
    }
    void display()
    {
        System.out.println("Apple");
    }
}
class B extends A{
    void print()
    {
        System.out.println("B");
    }
    void display()
    {
        System.out.println("Mango");
    }
}
class C extends A{
    void print()
    {
        System.out.println("C");
    }
    void display()
    {
        System.out.println("Coconut");
    }
}