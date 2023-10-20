package OOPS;
import java.util.Vector;
public class Collection_Framework_02 {
    public static void main(String[] args) {
        Vector<Integer> v=new Vector<>();
        v.add(1);
        v.add(3);
        v.add(5);
        v.add(1,9);
        System.out.println(v);
        Vector<Integer> v1=new Vector<>();
        v1.addAll(v);
        System.out.println(v1);
        v1.remove(3);
        v.removeAll(v);
        v1.clear();
        System.out.println(v);
        System.out.println(v1);
    }
}
