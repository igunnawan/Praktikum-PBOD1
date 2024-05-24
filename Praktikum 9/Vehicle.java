/*
 * File : UpperboundClass.java
 * Penulis : Muhamad Gunawan / 24060122120016
*/

public abstract class Vehicle extends UpperboundClass {
    public double calcFuelEfficency(){
        return 0.0;
    }

    public double calcTripDistancy(){
        return 0.0;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName();
    }

}
