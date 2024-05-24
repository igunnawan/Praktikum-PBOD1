/*
 * File : Airplane.java
 * Penulis : Muhamad Gunawan / 24060122120016
*/

public abstract class Airplane extends UpperboundClass implements IFlyer {
    public double calcFuelEfficency() {
        return 0.0;
    }

    public double calcTripDistancy() {
        return 0.0;
    }
    
    public String toString() {
        return this.getClass().getSimpleName();
    }

    public abstract void takeOff();
    public abstract void land();
    public abstract void fly();
}
