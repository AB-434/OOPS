class AB
{
    void print(){
        System.out.println("Hello");
    }
}
abstract class AC
{
    abstract void display();
}
interface AD
{
    void message();
}
interface AE
{
    void num(int x);
}
class Anonymous{
    public static void main(String args[]){
        //Class
        AB obj=new AB(){
            void print(){
                System.out.println("Bye");
            }
        };
        obj.print();
        //Abstract Class
        AC obj1=new AC(){
            void display(){
                System.out.println("Namaste");
            }
        };
        obj1.display();
        //Interface
        AD obj2=new AD(){
            public void message(){
                System.out.println("Hii");
            }
        };
        obj2.message();
        //Lambda Expression
        AD obj3=()->System.out.println("Arnaw");
        obj3.message();
        //Passing parameters
        AE obj4=(int x)->System.out.println(x);
        obj4.num(5);
        //Return Statement
        /*D obj5=(x)->x+3;
        int res=obj5.num(7);
        System.out.println(res);*/
    }
}