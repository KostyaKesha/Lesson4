package LessonFour;


public class Air extends Transport{

    protected int hight;

    public int hight() {

        return hight;
    }

    public void setHight(int hight) {
        this.hight = hight;
    }
    public  void move () {
        super.move();
        System.out.println("Plane can fly");
    }

}
