public class Garis {
    private Titik titikAwal;
    private Titik titikAkhir;

    public Garis(Titik titikAwal, Titik titikAkhir) {
        this.titikAwal = titikAwal;
        this.titikAkhir = titikAkhir;
    }

    public Titik gettitikAwal() {
        return this.titikAwal;
    }

    public Titik gettitikAkhir() {
        return this.titikAkhir;
    }

    public Titik settitikAwal(Titik titikAwal) {
        return this.titikAwal;
    }
    
    public Titik settitikAkhir(Titik titikAkhir) {
        return this.titikAkhir;
    }

    public double getPanjang(Garis A) {
        double rumusx, rumusy;
        rumusx = A.gettitikAkhir().getAbsis()-A.gettitikAwal().getAbsis();
        rumusy = A.gettitikAkhir().getOrdinat()-A.gettitikAwal().getOrdinat();
        return Math.sqrt(rumusx*rumusx+rumusy*rumusy);
    }

    public double getGradien(Garis A) {
        double rumusx, rumusy;
        rumusx = A.gettitikAkhir().getAbsis()-A.gettitikAwal().getAbsis();
        rumusy = A.gettitikAkhir().getOrdinat()-A.gettitikAwal().getOrdinat();
        return rumusy/rumusx;
    }

    public void getRefleksiY(Garis A) {
        
    }

    public boolean isTegakLurus(Garis G1, Garis G2) {
        if(getGradien(G1)*getGradien(G2)==-1) {
            return true;
        }  
        else {
            return false;
        }
    }

}