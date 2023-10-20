import java.util.*;
class Multithreading_04{
    public static void main(String args[]) throws Exception{
        System.out.println("Main Method");
        Arnaw obj1=new Arnaw();
        Baitha obj2=new Baitha();
        Thread t1=new Thread(obj1);
        Thread t2=new Thread(obj2);
        System.out.println(t1.isAlive());
        t1.start();
        System.out.println(t1.isAlive());
        t1.join();
        t2.start();
    }
}
class Arnaw implements Runnable{
    public void run(){
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
class Baitha implements Runnable{
    public void run(){
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<3;i++){
            System.out.println("B");
        }
        System.out.println("Enter a number y");
        int x=sc.nextInt();
        System.out.println(x);
    }
}