package essential.part3.Bird;

public class Swallow extends Bird {
    @Override
    public void move (){
        System.out.println("fly");
    }
    //свойство ковариантного возврата
    public Swallow meth (){
        return new Swallow();
    }
}
