/*
 * File : ArmadaKendaraan.java
 * Penulis : Muhamad Gunawan / 24060122120016
*/

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class ArmadaKendaraan {
    private List<UpperboundClass> armada;
    
    public ArmadaKendaraan() {
        this.armada = new ArrayList<>();
    }

    public void tambahArmada() {
        this.armada = new ArrayList<>();
    }

    public void tambahArmada(Collection<? extends UpperboundClass> koleksi) {
        armada.addAll(koleksi);
    }

    public List<UpperboundClass> getAllArmada() {
        return new ArrayList<>(armada);
    }
}
