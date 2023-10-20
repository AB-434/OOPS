package OOPS;
import java.util.ArrayList;
import java.util.Iterator;
public class Collection_Framework_04 {
    public static void main(String[] args) {
        ArrayList<Integer> x=new ArrayList<>();
        x.add(1);
        x.add(3);
        x.add(5);
        x.add(7);
        x.add(9);
        System.out.println(x);
        Iterator<Integer> iterate=x.iterator();
        int num=iterate.next();
        System.out.println(num);
        iterate.remove();
        while(iterate.hasNext()){
            iterate.forEachRemaining((value)-> System.out.print(value+" "));//Lambda Expression
        }
    }
}
