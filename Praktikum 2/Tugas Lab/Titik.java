import java.lang.Math; 

public class Titik {
    private double absis;
    private double ordinat;

    public Titik(double absis, double ordinat) {
        this.absis = absis;
        this.ordinat = ordinat;
    }
    public Titik(){
        this(0,0);
    }

    public double getOrdinat() {
        return this.ordinat;
    }

    public double getAbsis() {
        return this.absis;
    }

    public void setAbsis(double absis) {
        this.absis = absis;
    }

    public void setOrdinat(double ordinat) {
        this.ordinat = ordinat;
    }

    public double getJarakPusat() {
        double rumusx, rumusy;
        rumusx = this.absis*this.absis;
        rumusy = this.ordinat*this.ordinat;
        return Math.sqrt(rumusx+rumusy);
    }

    public void refleksiX(Titik T1) {
        T1.setOrdinat((T1.getOrdinat()*-1));
    }
    
    public void refleksiY(Titik T1) {
        T1.setAbsis((T1.getAbsis())*-1);
    }
    
    public void getRefleksiX(Titik T1) {
        refleksiX(T1);
    }

    public void getRefleksiY(Titik T1) {
        refleksiY(T1);
    }

    public double getterRefleksiX() {
        return this.ordinat*(-1);
    }

    public double getterRefleksiY() {
        return this.absis*(-1);
    }

}
