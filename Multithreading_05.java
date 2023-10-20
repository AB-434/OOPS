import java.util.*;
class Multithreading_05{
    public static void main(String args[]){
        System.out.println("Main Thread");
        MyThread1 t1=new MyThread1();
        //MyThread2 t2=new MyThread2();
        t1.setName("main");
        //t2.setName("Hello");
        t1.start();
        //t2.start();
    }
}
class MyThread1 extends Thread{
    public void run()
    {
        String name=Thread.currentThread().getName();
        if(name=="Arnaw")
        {
            print();
        }
        else
        {
            display();
        }
    }
    public void print()
    {

        for(int i=0;i<3;i++){
            System.out.println("B");
        }
    }
    public void display()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int x=sc.nextInt();
        System.out.println(x);
    }
}