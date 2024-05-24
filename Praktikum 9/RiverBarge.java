/*
 * File : RiverBarge.java
 * Penulis : Muhamad Gunawan / 24060122120016
*/

public class RiverBarge extends Vehicle {
    private double maxLoad;

    public RiverBarge() {
        this.maxLoad = 0;
    }

    public RiverBarge(double maxLoad) {
        this.maxLoad = maxLoad;
    }

    public String toString() {
        return this.getClass().getSimpleName() + " berlayar dilaut dan memiliki badan yang besar";
    }

    public double calcFuelEfficency(){
        return this.maxLoad;
    }

    public double calcTripDistancy(){
        return this.maxLoad;
    }
}
