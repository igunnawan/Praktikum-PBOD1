/*
 * File : SeaPlane.java
 * Penulis : Muhamad Gunawan / 24060122120016
*/

public class SeaPlane extends Airplane{
    private double maxLoad;

    public SeaPlane(){
        this.maxLoad = 0;
    }

    public SeaPlane(double maxLoad) {
        this.maxLoad = maxLoad;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + " dapat take-off dan mendarat di perairan";
    }

    public double calcFuelEfficency() {
        return this.maxLoad;
    }
    
    public double calcTripDistancy() {
        return this.maxLoad;
    }

    @Override
    public void takeOff() {
        System.out.println("SeaPlane berangkat");
    }

    @Override
    public void land() {
        System.out.println("SeaPlane mendarat");
    }
    @Override
    public void fly() {
        System.out.println("SeaPlane terbang");
    }
}
