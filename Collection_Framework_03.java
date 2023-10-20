package OOPS;
import java.util.HashMap;
public class Collection_Framework_03 {
    public static void main(String[] args) {
        HashMap<String,Integer> mp=new HashMap<>();
        mp.put("Dhoni",7);
        mp.put("Kohli",18);
        mp.put("Rohit",45);
        System.out.println(mp);
        System.out.println(mp.keySet());
        System.out.println(mp.entrySet());
        System.out.println(mp.values());
    }
}
