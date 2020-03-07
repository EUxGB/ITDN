package essential.part3.ex11_final_class;

final class FinalClass {
    public int x;
    public int y;
}

class DerivedClass {
}

public class Main {
    public static void main(String[] args) {
        FinalClass finalClass = new FinalClass();
//        finalClass.x = 100;
//        finalClass.y = 200;

        System.out.printf("x= %d   y= %d", finalClass.x = 100, finalClass.y = 200);


    }
}
