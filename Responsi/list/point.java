// Muhamad Gunawan
// 24060122120016

package list;

public class point {
    public double absis;
    public double ordinat;

    public point () {
        absis = 0;
        ordinat = 0;
    }

    public point (double absis, double ordinat) {
        this.absis = absis;
        this.ordinat = ordinat;
    }

    public void setAbsis (double absis) {
        this.absis = absis;
    }
    
    public double getAbsis () {
        return this.absis;
    }

    public void setOrdinat (double ordinat) {
        this.ordinat = ordinat;
    }

    public double getOrdinat () {
        return this.ordinat;
    }

    public void cetak () {
        System.out.println(this.absis + "," + this.ordinat);
    }
}