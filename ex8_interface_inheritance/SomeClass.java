package essential.part3.ex8_interface_inheritance;

public class SomeClass implements SomeInterface {
    public String publicField = "publicField.SomeClass";

    @Override

    public void method() {

        System.out.println("method.SomeClass");

    }

}
