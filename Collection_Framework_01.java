package OOPS;
import java.util.ArrayList;
public class Collection_Framework_01 {
    public static void main(String[] args) {
        ArrayList<Integer> x=new ArrayList<>();
        x.add(1);
        x.add(3);
        x.add(5);
        System.out.println(x);
        System.out.println(x.size());
        x.remove(0);
        System.out.println(x);
        int temp=x.get(1);
        System.out.println(temp);
    }
}
