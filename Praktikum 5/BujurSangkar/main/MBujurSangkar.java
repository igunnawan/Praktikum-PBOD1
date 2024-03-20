// Nama File : MBujurSangkar.java
// Penulis : Muhamad Gunawan / 24060122120016
// Deskripsi : Implementasi Main atau pemanggilan class BujurSangkar

import java.util.Scanner;

public class MBujurSangkar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        BujurSangkar bs = new BujurSangkar();
        System.out.println("Masukkan sisi bujur sangkar");
        double sisi = scan.nextDouble();
        System.out.println("Luas Bujur Sangkar dengan sisi " + sisi + "Satuannya adalah" + bs.hitungLuas(sisi));
        scan.close();
    }    
}

// apa yang terjadi apablia kelas BujurSangkar tidak membuat implementasi metode abstrak yang ada pada kelas BangunDatar ? jelaskan !
// MBujurSangkar tidak dapat dijalankan karena sebagai child, harus mengimplementasi metode abstrak dari parentnya yaitu BangunDatar
// Jika dijalankan di MBujurSangkar akan terdapat keluaran sebagai berikut :
// Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
// The type BujurSangkar must implement the inherited abstract method BangunDatar.hitungLuas(double)