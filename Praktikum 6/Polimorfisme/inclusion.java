package Polimorfisme;

public class inclusion {
    public static class Pegawai {
        private String nama;
        private int gajiPokok = 500000;

        public Pegawai () {
            this.nama = "";
            this.gajiPokok = 500000;
        }

        public Pegawai (String nama, int gajiPokok) {
            this.nama = nama;
            this.gajiPokok = gajiPokok;
        }

        public void setNama(String nama) {
            this.nama = nama;
        }

        public void tampilData() {
            System.out.println("Nama : " + this.nama + ", Gaji Pokok :" + this.gajiPokok);
        }
    }

    public static class Manajer extends Pegawai {
        private int tunjungan = 700000;
        
    }

    public static void main(String[] args) {
        
    }
}
