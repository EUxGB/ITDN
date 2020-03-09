package essential.part3.ex12_final_methods;

class A {
    void method1(){
        System.out.println("methodA1");
    }
    void method2(){
        System.out.println("methodA2");
    }

}

class B extends A{
    //@Override
    public final void method1(){
        System.out.println("methodB1");
    }
    //@Override
    public void method2(){
        System.out.println("methodB2");
    }

}

class C extends B{
    //@Override
    public void method2(){
        System.out.println("methodC2");
    }



}

public class Main {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        C c = new C();

        a.method1();
        b.method1();
        c.method1();
        System.out.println();
        a.method2();
        b.method2();
        c.method2();

    }
}
