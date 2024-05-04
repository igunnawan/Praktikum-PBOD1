package LatihanMedium;

public class Senjata {
    private String bunyi;
    private int peluru;
    private boolean menusuk;

    public Senjata() {
        this.bunyi = "-";
        this.peluru = 0;
    }

    public Senjata(String bunyi) {
        this.bunyi = bunyi;
    }

    public void setBunyi(String bunyi) {
        this.bunyi = bunyi;
    }

    public void setPeluru(int peluru) {
        this.peluru = peluru;
    }

    public void setMenusuk(boolean menusuk) {
        this.menusuk = menusuk;
    }
    
    public String getBunyi() {
        return this.bunyi;
    }

    public int getPeluru() {
        return this.peluru;
    }

    public boolean getMenusuk() {
        return this.menusuk;
    }

    public void menembak() {
        this.peluru--;
        System.out.println("Sisa Peluru: " + getPeluru());
    }

    public boolean isMenusuk() {
        return menusuk;
    }

    public String menusuk() {
        if (isMenusuk()) {
            return "Jleb!";
        } else {
            return "Gagal, belum pasang bayonet";
        }
    }
}
