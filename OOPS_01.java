package OOPS;
public class OOPS_01 {
    public static class Student{
        String name;
        int marks;
        double percent;
    }
    public static void print(Student obj1){
        System.out.println(obj1.name);
    }
    public static void change(int x){
        x=9;
        System.out.println(x);//9
    }
    public static void main(String args[]){
        class Car{//Multiple classes
            String name;
            String type;
            int mileage;
        }
        Car obj2=new Car();
        obj2.name="MG Hector";
        System.out.println(obj2.name);
        Student obj1=new Student();//We can make more objects
        obj1.name="Arnaw";
        obj1.marks=87;
        obj1.percent=91.60;
        System.out.println(obj1.name);//Arnaw
        System.out.println(obj1.marks+13);//100
        System.out.println(obj1.percent);//91.6
        print(obj1);//Passing object only when class is made outside main function
        int x=5;
        System.out.println(x);//5
        change(x);
        System.out.println(x);//5
    }
}


