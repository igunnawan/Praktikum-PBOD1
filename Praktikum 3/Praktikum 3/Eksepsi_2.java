public class Eksepsi_2 {
    public void cobaAngka(int angka) throws AngkaSialException {
        if (angka == 13) {
            throw new AngkaSialException();
        }
        else {
            System.out.println("Angka " + angka + " bukan angka sial");
        }
    }

    public static void main(String[] args) {
        Eksepsi_2 as = new Eksepsi_2();
        try {
            as.cobaAngka(10);
            as.cobaAngka(13);
            as.cobaAngka(12);
        }
        catch (AngkaSialException ase) {
            System.out.println(ase.getMessage());
            System.out.println("Hati-hati memasukkan angka");
        }
    }
}

// Ketika eksepsi terjadi baris 12 akan di eksekusi sekali
// Dimana pada baris ke 14 terdapat syntax as.cobaAngka(10);
// Output dari as.cobaAngka(10), akan menjalankan method cobaAngka
// Dimana angka yang bukan sama dengan 13, sehingga akan menjalankan
// Baris ke 12

// Baris 21 akan dieksekusi ketika baris ke 19 dieksekusi
// Dimana pada baris ke 19 terdapat syntax as.cobaAngka(13);
// Output dari as.cobaAngka(13), akan menjalankan methode cobaAngka
// Dimana angka tersebut sama dengan 13, sehingga akan menjalankan
// Methode AngkaSialException. Nantinya setelah menjalankan methode AngkaSialException
// akan kembali kepada main class untuk menjalankan/mengeluarkan output getmessage()
// dan juga output "hati-hati memasukkan angka!!!"
