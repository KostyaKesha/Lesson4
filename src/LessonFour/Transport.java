package LessonFour;

public class Transport {
    public static void main(String[] args) {
        String name;
        int speed;
        int size;

        Auto auto = new Auto();
        Railway railway = new Railway();
        Water water = new Water();
        Air air = new Air();

        auto.move();
        railway.move();
        water.move();
        air.move();
    }
    public void move () {
        System.out.println("Everything can move");
    }
}
