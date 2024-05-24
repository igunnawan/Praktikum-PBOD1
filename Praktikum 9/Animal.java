/*
 * File : Animal.java
 * Penulis : Muhamad Gunawan / 24060122120016
*/

public abstract class Animal {
    public abstract void eat();
    
    @Override
    public String toString() {
        return this.getClass().getSimpleName();
    }
}
