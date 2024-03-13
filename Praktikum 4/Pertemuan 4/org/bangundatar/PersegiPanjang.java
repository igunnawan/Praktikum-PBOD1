/**
 * File : PersegiPanjang.java 14/03/2024
 * Penulis : Muhamad Gunawan (24060122120016)
 * Deskripsi : representasi dasar dari objek persegi panjang, turunan kelas poligon
*/

package org.bangundatar;

import org.poligon.Poligon;

public class PersegiPanjang extends Poligon {
    private double panjang;
    private double lebar;

    public PersegiPanjang(double panjang, double lebar, int jumlahSisi) {
        this.panjang = panjang;
        this.lebar = lebar;
        this.jumlahSisi = jumlahSisi;
    }

    public double hitungLuasPP() {
        return panjang*lebar;
    }

    public void printInfo() {
        System.out.println("Bangun Persegi Panjang berisi " + this.getJumlahSisi());
    }
}
