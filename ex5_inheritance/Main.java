package essential.part3.ex5_inheritance;

public class Main {
    public static void main(String[] args) {
        B b = new B();
        b.field1 = 1;
        b.field2 = 2;
        b.field3 = 3;

        b.field4 = 4;
        b.field5 = 5;

        A a = (A) b;

        System.out.println(a.field1);
        System.out.println(a.field2);
        System.out.println(a.field3);

        System.out.println("b ID = " + b.hashCode());
        System.out.println("a ID = " + a.hashCode());





    }
}
