package rank1.rank2.rank3;
import rank1.AbstractClass;
import rank1.Vehicle;
import rank1.rank2.VehicleNotEnger;

public class Bike extends VehicleNotEnger {
    int speed = 150;

    public void display() {
        System.out.println("phuong thuc cua rank3"); //in speed của lớp rank1.rank2.rank3.Bike
    }

    public void changeSpeed(){
        System.out.println("phuong thuc cua rank3");

    }


    public static void main(String args[]) {
        Vehicle a = new VehicleNotEnger();
        a.display();
        a.changeSpeed();
        System.out.println(a.speed);

        VehicleNotEnger b = new Bike();
        b.display();
        b.changeSpeed();
        System.out.println(b.speed);

        Vehicle c = new Bike();
        c.display();
        c.changeSpeed();
        System.out.println(c.speed);

        Vehicle d = new AbstractClass() {
        };
        d.display();
        d.changeSpeed();
        System.out.println(d.speed);

    }

}
