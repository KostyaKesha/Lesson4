package LessonFour;

public class Auto extends Transport {

    protected String mobility;

    public String mobility() {

        return mobility;
    }

    public void setMobility(String mobility) {

        this.mobility = mobility;
    }

    public  void move (){
        super.move();
        System.out.println("Car can drive");
    }
}
