class Lingkaran{
    private double jari_jari;
    public Lingkaran(double jari_jari){
        this.jari_jari = jari_jari;
    }
    public double hitungKeliling(){
        return 2*Math.PI*jari_jari;
    }
}

public class Asersi_2 {
    public static void main(String[] args) {
        double jari_jari = -1;
        // assert (jari_jari>0) : "jari-jari tidak boleh nol"; // Sebelum
        assert (jari_jari>0) : "jari-jari harus lebih dari nol"; // Sesudah
        Lingkaran lingkaran = new Lingkaran(jari_jari);
        double keliling_lingkaran = lingkaran.hitungKeliling();
        System.out.println("Keliling Lingkaran = " + keliling_lingkaran);
    }
}

// Secara konsep, yang kurang tepat dari program tersebut pada bagian output assert
// Dimana jika kita memasukkan input jari_jari = -1
// Output yang dikeluarkan adalah jari-jari tidak boleh nol
// Maka dari itu, output yang seharusnya dikeluarkan adalah "jari-jari harus lebih dari 0"