public class Multithreading_01{
    public static void main(String args[]){
        System.out.println("Main Thread");
        String name=Thread.currentThread().getName();
        System.out.println(name);
        System.out.println(Thread.currentThread().getPriority());
        //Changing thread's name & priority
        Thread t=Thread.currentThread();
        t.setName("Arnaw");
        t.setPriority(1);
        String name1=Thread.currentThread().getName();
        System.out.println(name1);
        System.out.println(Thread.currentThread().getPriority());
    }
}
/*Multitasking-(i)Process Based Multitasking
               (ii)Thread Based Multitasking
               */