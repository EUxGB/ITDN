package essential.part3.ex6_inheritance;

public class Main {
    public static void main(String[] args) {
        B b = new B();
        b.method();

        A bUp = (A) b;
        bUp.method();

        B bDown = (B) bUp;
        bDown.method();
    }
}
