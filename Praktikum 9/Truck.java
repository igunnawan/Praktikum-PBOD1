/*
 * File : Truck.java
 * Penulis : Muhamad Gunawan / 24060122120016
*/

public class Truck extends Vehicle {
    private double maxLoad;

    public Truck() {
        this.maxLoad = 0;
    }

    public Truck(double maxLoad) {
        this.maxLoad = maxLoad;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + " adalah angkutan darat yang sangat handal";
    }

    public double calcFuelEfficency() {
        return this.maxLoad;
    }

    public double calcTripDistancy() {
        return this.maxLoad;
    }

}
