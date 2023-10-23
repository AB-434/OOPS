package OOPS;
public class Nested_Classes {
    public static void main(String[] args) {
        Outer.Inner obj=new Outer.Inner();
        obj.print();
        Outer obj1=new Outer();
        obj1.print();
    }
}
class Outer{
    void print(){
        System.out.println("Inside Outer Class");
    }
    static class Inner{
        void print(){
            System.out.println("Inside Inner Class");
        }
    }
}