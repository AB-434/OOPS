enum Status{
    Running,Failed,Pending,Success;
}
public class Enum_01{
    public static void main(String args[]){
        int i=5;
        Status s=Status.Running;
        System.out.println(s);
        System.out.println(s.ordinal());
        Status[] ss=Status.values();
        System.out.println(ss);
        for(Status x:ss){
            System.out.println(x);
        }
        if(s==Status.Running)//switch(s)
            System.out.println("Yes");
        System.out.println(s.getClass());
    }
}