package Tugas;

public class KupuTest {
    public static void main(String[] args) {
        Ulat K = new Ulat();
        KupuGeneric<Ulat> ulat = new KupuGeneric<Ulat>();
        ulat.setIsi(K);
        ulat.getIsi().gerak();
    }
    
}
