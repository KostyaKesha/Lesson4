package LessonFour;

public class Railway extends Transport{

    protected int numOfWagon;
    public int numOfWagon() {

        return numOfWagon;
    }

    public void setNumOfWagon(int numOfWagon) {

        this.numOfWagon = numOfWagon;
    }

    public  void move () {
        super.move();
        System.out.println("Train can ride rails");
    }
}