package essential.part3.ex9_interface_inheritance;

public class Main {
    public static void main(String[] args) {
        SomeClass someClass = new SomeClass();
        someClass.method1();

        SomeInterface1 someClassUp1 = someClass;
        someClassUp1.method1();

        SomeInterface2 someClassUp2 = someClass;
        someClassUp2.method2();

        SomeInterface3 someClassUp3 = someClass;
        someClassUp3.method3();

        SomeClass someClassDown = (SomeClass) someClassUp1;
        someClassDown.method1();
        someClassDown.method2();
        someClassDown.method3();



    }
}
