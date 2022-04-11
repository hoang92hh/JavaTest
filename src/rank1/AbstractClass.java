package rank1;

public abstract class AbstractClass extends Vehicle {
    public int  speed = 50;

    public  int getSpeed() {
        return speed;
    }

    public  void setSpeed(int speed) {
        this.speed = speed;
    }
    public void display() {
        System.out.println("phuong thuc cua abstract"); //in speed của lớp rank1.rank2.rank3.Bike
    }

    public void changeSpeed(){
        System.out.println("phuong thuc cua abstract");

    }



}
