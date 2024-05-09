// 
// File : Main.java
// Deskripsi : Program Main yang berisi class Kupu dengan menggunakan methode Generic
// Penulis : Muhamad Gunawan / 24060122120016
// 

abstract class Kupu {
    void gerak() {

    }
}

class Ulat extends Kupu {
    void gerak() {
        System.out.println("Ulat merayap");
    }
}

class Kepompong extends Kupu { 
    void gerak() {
        System.out.println("Kepompong diam");
    }
}

class KupuDewasa extends Kupu {
    void gerak() {
        System.out.println("Kupu terbang");
    }
}

class Data<T> {
    private T isi;
    
    public void setIsi(T isi) {
        this.isi = isi;
    }

    public T getIsi() {
        return this.isi;
    }
}

public class Main {
    public static void main(String[] args) {
        Ulat K;
        Data<Kupu> anu;
        
        K = new Ulat();
        anu = new Data<>();

        anu.setIsi(K);
        anu.getIsi().gerak();

        anu.setIsi(new Kepompong());
        anu.getIsi().gerak();

        anu.setIsi(new KupuDewasa());
        anu.getIsi().gerak();
    }
}
