import java.util.Scanner;

public class MLingkaran {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Masukkan jejari lingkaran");
        double angka = scan.nextDouble();
        Lingkaran l = new Lingkaran(angka);
        System.out.println("Luas lingkaran dengan jejari " + angka + " satuan adalah " + l.hitungLuas());
        scan.close();
    }
}
