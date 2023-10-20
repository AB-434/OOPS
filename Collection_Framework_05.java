package OOPS;
import java.util.Vector;
import java.util.Iterator;
public class Collection_Framework_05 {
    public static void main(String[] args) {
        Vector<Integer> v=new Vector<>();
        v.add(1);
        v.add(3);
        v.add(5);
        v.add(7);
        v.add(9);
        int num=v.get(2);
        System.out.println(num);
        Iterator<Integer> iterate=v.iterator();
        while(iterate.hasNext()){
            System.out.print(iterate.next());
            System.out.print(" ");
        }
    }
}
