/*
 * File : Kryptonian.java
 * Penulis : Muhamad Gunawan / 24060122120016
*/

public abstract class Kryptonian extends Animal implements IFlyer {
    public abstract void eat();
    public String toString() {
        return this.getClass().getSimpleName();
    }

    public abstract void takeOff();
    public abstract void land();
    public abstract void fly();
}
