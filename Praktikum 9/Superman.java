/*
 * File : Superman.java
 * Penulis : Muhamad Gunawan / 24060122120016
*/

public class Superman extends Kryptonian {
    private String name;

    public Superman(String name){
        this.name = name;
    }

    public void leapBuilding() {
        System.out.println("Superman " + this.name + " Lompatin gedung");
    }

    public void StopBullet() {
        System.out.println("Superman " + this.name + " Menghentikan peluru");
    }

    @Override
    public void eat() {
        System.out.println("Superman " + this.name + " Makan Kryptonite");
    }

    @Override
    public void takeOff() {
        System.out.println("Superman " + this.name + " Lepas landas");
    }

    @Override
    public void land() {
        System.out.println("Superman " + this.name + " Mendarat");
    }

    @Override
    public void fly() {
        System.out.println("Superman " + this.name + " Sedang terbang");
    }
    
}
