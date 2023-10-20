import java.util.*;
public class Multithreading_03{
    public static void main(String args[])  {
        System.out.println("Main Method");
        A obj1=new A();
        B obj2=new B();
        obj1.start();
        obj2.start();
    }
}
class A extends Thread{
    public void run()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number x");
        int num=sc.nextInt();
        System.out.println(num);
        try{
            for(int i=0;i<3;i++){
                System.out.println("A");
                Thread.sleep(100);
            }}
        catch(Exception e){
            System.out.println("Error");
        }
        System.out.println("End Of Program");
    }
}

class B extends Thread{
    public void run()
    {
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<3;i++){
            System.out.println("B");
        }
        System.out.println("Enter a number y");
        int x=sc.nextInt();
        System.out.println(x);
    }
}