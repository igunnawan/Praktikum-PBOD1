// 
// File : Main2.java
// Deskripsi : Program Main2 yang berisi class Kupu dengan menggunakan methode Generic
// Penulis : Muhamad Gunawan / 24060122120016
// 

class Kupu2 {
    void gerak2() {

    }
}

class Ulat2 extends Kupu2{
    void gerak2() {
        System.out.println("Ulat merayap");
    }
}

class Data2<T2> {
    private T2 isi2;

    public void setIsi2(T2 isi2) {
        this.isi2 = isi2;
    }

    public T2 getIsi2() {
        return this.isi2;
    }
}

public class Main2 {
    public static void main(String[] args) {
        Ulat2 K2;
        Data2<Kupu2> anu2;

        K2 = new Ulat2();
        anu2 = new Data2<>();

        anu2.setIsi2(K2);
        anu2.getIsi2().gerak2();
    }
}
