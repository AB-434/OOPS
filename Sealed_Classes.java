package OOPS;
sealed class E permits F,G {

}
sealed class F extends E permits H{

}
non-sealed class G extends E{

}
final class H extends F{

}
public class Sealed_Classes {
    public static void main(String[] args) {

    }
}
