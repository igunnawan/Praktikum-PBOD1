public class BangunDatarGenericTest {
    public static void main(String[] args) {
        Lingkaran L = new Lingkaran(2);
        BangunDatarGeneric<Lingkaran> bdg = new BangunDatarGeneric<Lingkaran>();
        bdg.set(L);
        System.out.println("Keliling lingkaran : " + bdg.hitungKeliling());
        System.out.println("Tipe Generic : " + bdg.get().getClass().getName());
    }
}
