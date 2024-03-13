/**
 * File : BujurSangkar.java 14/03/2024
 * Penulis : Muhamad Gunawan (24060122120016)
 * Deskripsi : representasi dasar dari objek segitiga, turunan kelas poligon
*/

package org.bangundatar;
import org.poligon.Poligon;

public class segitiga extends Poligon {
    private double tinggi;
    private double alas;

    public segitiga(double tinggi, double alas, int jumlahSisi) {
        this.tinggi = tinggi;
        this.alas = alas;
        this.jumlahSisi = 3;
    }

    public double hitungLuasSegitiga() {
        return (tinggi*alas)/2;
    }

    public double getTinggi() {
        return this.tinggi;
    }

    public double getAlas() {
        return this.alas;
    }

    public void printInfo() {
        System.out.println("Bangun Segitiga berisi " + this.getJumlahSisi());
    }
}
