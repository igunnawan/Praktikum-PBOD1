/*
 * File : ProgramMedium.java
 * Penulis : Muhamad Gunawan / 24060122120016
*/

import java.util.*;

public class ProgramMedium {
    public static void main(String[] args) {
        Truck truck = new Truck();
        System.out.println(truck);
        SeaPlane Splane = new SeaPlane();
        System.out.println(Splane);
        Helicopter copter = new Helicopter();
        System.out.println(copter);
        System.out.println("#################################################");

        List<Truck> armadaTruck = new ArrayList<>();
        List<SeaPlane> armadaSeaPlane = new ArrayList<>();
        List<Helicopter> armadaHelicopter = new ArrayList<>();
        
        armadaTruck.add(truck);
        armadaTruck.add(truck);
        armadaTruck.add(truck);
        System.out.println("Jumlah Armada Truck : " + armadaTruck.size());
        
        armadaSeaPlane.add(Splane);
        System.out.println("Jumlah Armada SeaPlane : " + armadaSeaPlane.size());

        armadaHelicopter.add(copter);
        armadaHelicopter.add(copter);
        System.out.println("Jumlah Armada Helicopter : " + armadaHelicopter.size());
        System.out.println("#################################################");

        ArmadaKendaraan armadakendaraan = new ArmadaKendaraan();
        armadakendaraan.tambahArmada(armadaTruck);
        System.out.println(">> Jumlah unit kendaraan : " + armadakendaraan.getAllArmada().size());
        System.out.println("Menambahkan armada baru");

        armadakendaraan.tambahArmada(armadaHelicopter);
        System.out.println(">> Jumlah unit kendaraan : " + armadakendaraan.getAllArmada().size());
        System.out.println("Menambahkan armada baru");
        
        armadakendaraan.tambahArmada(armadaSeaPlane);
        System.out.println(">> Jumlah unit kendaraan : " + armadakendaraan.getAllArmada().size());
        System.out.println("Menambahkan armada baru");
        

    }
}
