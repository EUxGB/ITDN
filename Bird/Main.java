package essential.part3.Bird;

public class Main {
    public static void main(String[] args) {
        Bird bird1 = new Strauss();
        Bird bird2 = new Penguin();
        Bird bird3 = new Strauss();
        Bird[] birds = {bird1, bird2, bird3};
        for (Bird temp : birds) {
            temp.move();

        }
    }
}
