// Nama File : BangunDatar.java
// Penulis : Muhamad Gunawan / 24060122120016
// Deskripsi : abstract class bernama BangunDatar dimana merupakan sebuah parent dari BujurSangkar

public abstract class BangunDatar {
    protected double luas;
    public abstract double hitungLuas(double sisi);
    public void setLuas(double l) {
        luas = l;
    }
    public double getLuas() {
        return luas;
    }
}
