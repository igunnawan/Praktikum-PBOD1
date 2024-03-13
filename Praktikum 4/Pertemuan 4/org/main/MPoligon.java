/**
 * File : PersegiPanjang.java 14/03/2024
 * Penulis : Muhamad Gunawan (24060122120016)
 * Deskripsi : driver class untuk poligon, persegi panjang, dan segitiga
 */

package org.main;

import org.bangundatar.*;

public class MPoligon {
    public static void main(String[] args) {
        PersegiPanjang persegi = new PersegiPanjang(10,10,4);
        persegi.printInfo();
        System.out.println("Luas Persegi Panjang: " + persegi.hitungLuasPP());

        segitiga segitiga = new segitiga(20, 5, 3);
        segitiga.printInfo();
        System.out.println("Luas Segitiga: " + segitiga.hitungLuasSegitiga());

    }
}
