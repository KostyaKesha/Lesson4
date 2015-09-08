package LessonFour;

public class Water extends Transport{

    protected int capacity;

    public int capacity() {

        return capacity;
    }

    public void setCapacity(int capacity) {

        this.capacity = capacity;
    }
    public  void move () {
        super.move();
        System.out.println("Ship can swim");
    }

}
