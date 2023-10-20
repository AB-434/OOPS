package OOPS;
import java.util.*;
public class Yield {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the numbers");
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println("Enter your choice");
        int choice=sc.nextInt();
        var k=switch(choice)
        {
            case 1:
                int sum=a+b;
                yield sum;
            case 2:
                int difference=a-b;
                yield difference;
            case 3:
                int product=a*b;
                yield product;
            default :
                yield -1;
        };
        System.out.println(k);
    }
}
