/*
 * File : Airport.java
 * Penulis : Muhamad Gunawan / 24060122120016
*/

public class Airport extends Airplane {
    private Airplane airplane;
    private String name;

    public Airport() {
        this.name = "";
    }
    
    public Airport(Airplane airplane, String name) {
        this.airplane = airplane;
        this.name = name;
    }

    public String givePermissionToLand(IFlyer flyer) {
        if (flyer instanceof Airplane) {
            return airplane + " Selamat datang di Airport " + name + " silahkan mendarat";
        }
        else {
            return "Kalian tidak diizinkan mendarat";
        }
    } 

    @Override
    public void takeOff() {
        System.out.println("Silahkan lepas landas");
    }

    @Override
    public void land() {
        System.out.println("Silahkan mendarat");
    }

    @Override
    public void fly() {
        System.out.println("Selamat jalan dan Selamat terbang");
    }
    
}
