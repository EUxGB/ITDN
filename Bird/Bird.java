package essential.part3.Bird;

public class Bird {
    public void move() {
        System.out.println("different ways ");
    }

    //метод фабрик
    Bird meth (){
        return new Swallow();
    }
}
