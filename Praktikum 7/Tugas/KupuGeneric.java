package Tugas;

public class KupuGeneric<T extends Kupu> {
    private T isi;

    public void setIsi(T isi) {
        this.isi = isi;
    }

    public T getIsi() {
        return this.isi;
    }

    public String gerak() {
        return isi.gerak();
    }
}
