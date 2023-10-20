package OOPS;

class Encapsulation{
    public static void main(String args[]){
        X obj=new X();
        obj.display("Arnaw",18);
    }
}
class X{
    private String name;
    private int age;
    private void setData(String name,int age)
    {
        this.name=name;
        this.age=age;
    }
    public void display(String name,int age)
    {
        setData(name,age);
        System.out.println(name);
        System.out.println(age);
    }
}
