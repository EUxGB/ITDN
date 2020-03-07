package essential.part3.ex7_override;

public class Main {
    public static void main(String[] args) {

        B b = new B();
        b.move();

        A bUp = b;
        bUp.move();

        B bDown = (B) bUp;
        bDown.move();


    }


}
