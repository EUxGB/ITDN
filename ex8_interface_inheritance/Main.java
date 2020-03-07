package essential.part3.ex8_interface_inheritance;

public class Main {
    public static void main(String[] args) {
        SomeClass someClass = new SomeClass();
        System.out.println(someClass.publicField);
        someClass.method();

        //UpCast
        SomeInterface someClassUp = someClass;
        System.out.println(someClassUp.interfaceField);
        someClassUp.method();

        //DownCast
        SomeClass someClassDown = (SomeClass) someClassUp;
        someClassDown.method();
        System.out.println(someClassDown.publicField);

        System.out.printf("\nhashCode %s\nhashCode %s\nhashCode %s\n",
                someClass.hashCode(),
                someClassDown.hashCode(),
                someClassUp.hashCode());


    }
}
