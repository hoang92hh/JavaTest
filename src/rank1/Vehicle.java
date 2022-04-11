package rank1;


import interfacePackage.IActive;

public abstract class Vehicle implements IActive {
   public int  speed = 50;

    public  int getSpeed() {
        return speed;
    }

    public  void setSpeed(int speed) {
        this.speed = speed;
    }




}


