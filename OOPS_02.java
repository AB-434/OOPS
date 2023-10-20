package OOPS;

public class OOPS_02{
    String name;
    int marks;
    double percent;
    private static int number;//Cant use outside class through private
    private static int getter(){
        return number;
    }
    public OOPS_02(){//Default Constructor

    }
    public OOPS_02(String name,int marks,double percent){
        this.name=name;
        this.marks=marks;
        this.percent=percent;
        number++;
    }
    public static void main(String[] args) {
        /*OOPS_03 s1=new OOPS_03("Arnaw",87,91.60);
        System.out.println(s1.name);
        System.out.println(s1.marks);
        System.out.println(s1.percent);
        System.out.println(number);
        OOPS_03 s2=new OOPS_03("Dhoni",91,98.50);
        System.out.println(s2.name);
        System.out.println(s2.marks);
        System.out.println(s2.percent);
        System.out.println(number);
        s1.name="Kohli";//We can change
        System.out.println(s1.name);
        OOPS_03 s3=new OOPS_03();
        System.out.println(number);*/
        System.out.println(OOPS_02.number);
        System.out.println(getter());
    }
}
