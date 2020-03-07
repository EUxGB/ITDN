package essential.part3.ex10_super_method;

public class B extends A {
    @Override
    public void method() {
        super.method();
        System.out.println("method from class B");
    }
}
