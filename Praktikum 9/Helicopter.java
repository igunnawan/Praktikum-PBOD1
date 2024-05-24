/*
 * File : Helicopter.java
 * Penulis : Muhamad Gunawan / 24060122120016
*/

public class Helicopter extends Airplane {
    private double maxLoad;

    public Helicopter(){
        this.maxLoad = 0;
    }

    public Helicopter(double maxLoad) {
        this.maxLoad = maxLoad;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + " hanya memerlukan landasan kecil";
    }

    public double calcFuelEfficency() {
        return this.maxLoad;
    }

    public double calcTripDistancy() {
        return this.maxLoad;
    }

    @Override
    public void takeOff() {
        System.out.println("Helicopter berangkat");
    }

    @Override
    public void land() {
        System.out.println("Helicopter mendarat");
    }

    @Override
    public void fly() {
        System.out.println("Helicopter terbang");
    }
    
}
