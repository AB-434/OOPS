package OOPS;

public class StaticExample {
    String name;
    int en_no;
    static String college;
    public void StaticExample(){
        name="XY";
        en_no=-1;
    }
    static{
        college="Parul";
    }
    static void print(){
        System.out.println("Hello World");
    }
    public static void main(String[] args) {
        StaticExample obj1=new StaticExample();
        obj1.name="Arnaw";
        obj1.en_no=34;
        StaticExample obj2=new StaticExample();
        obj2.name="Dhoni";
        obj2.en_no=7;
        StaticExample.college="Parul University";
        System.out.println(obj1.name+" "+obj1.en_no+" "+StaticExample.college);
        System.out.println(obj2.name+" "+obj2.en_no+" "+StaticExample.college);
        StaticExample.print();
    }
}
