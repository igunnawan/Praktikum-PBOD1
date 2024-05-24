/*
 * File : Bird.java
 * Penulis : Muhamad Gunawan / 24060122120016
*/

public class Bird extends Animal implements IFlyer {

    public void buildNest() {
        System.out.println("Burung membuat sarang");
    }

    public void layEggs() {
        System.out.println("Burung mengerami telur");
    }

    @Override
    public void takeOff() {
        System.out.println("Burung lepas landas");
    }

    @Override
    public void land() {
        System.out.println("Burung mendarat");    
    }

    @Override
    public void fly() {
        System.out.println("Burung terbang");
    }

    @Override
    public void eat() {
        System.out.println("Burung makan");    
    }
    
}
