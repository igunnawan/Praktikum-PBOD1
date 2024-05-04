package LatihanVeryEasy;

// Nama : Muhamad Gunawan
// Program : TestSenjata.java
// Penjelasan : TestSenjata.java merupakan main file java yang akan mengimplementasikan Class Senjata

public class TestSenjata {
    public static void main(String[] args) {
        Senjata ak47 = new Senjata("Tar");
        Senjata m16 = new Senjata("Dor");
    
        System.out.println("Jumlah Peluru AK47: " + ak47.getPeluru());
        System.out.println("AK47 mengisi peluru ");
        ak47.setPeluru(10);
        System.out.println("Jumlah Peluru AK47: " + ak47.getPeluru());
        System.out.println("AK47 Menembak" + ak47.getBunyi());
        ak47.menembak();
        System.out.println("Jumlah Peluru AK47: " + ak47.getPeluru());

        System.out.println();

        System.out.println("Jumlah Peluru M16: " + m16.getPeluru());
        System.out.println("M16 mengisi peluru ");
        m16.setPeluru(10);
        System.out.println("Jumlah Peluru M16: " + m16.getPeluru());
        System.out.println("M16 Menembak" + m16.getBunyi());
        m16.menembak();
        System.out.println("Jumlah Peluru M16: " + m16.getPeluru());
    }
}
