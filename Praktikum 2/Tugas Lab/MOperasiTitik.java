public class MOperasiTitik {
    public static void main(String[] args) {
        Titik t1 = new Titik();
        Titik t2 = new Titik();
        Titik t3 = new Titik();
        t1.setAbsis(5);
        t1.setOrdinat(2);
        t2.setAbsis(1);
        t2.setOrdinat(3);
        t3.setAbsis(4);
        t3.setOrdinat(5);
        System.out.println("Titik T1(" + t1.getAbsis() + "," + t1.getOrdinat() + ")");
        System.out.println("Titik T2(" + t2.getAbsis() + "," + t2.getOrdinat() + ")");
        System.out.println("Titik T2(" + t3.getAbsis() + "," + t3.getOrdinat() + ")");
        System.out.println("Get Jarak Pusat :" + t1.getJarakPusat());

        t1.getRefleksiX(t1);
        System.out.println("Titik T1 (" + t1.getAbsis()+ "," + t1.getOrdinat() + ") => Setelah RefleksiX");

        t1.getRefleksiY(t1);
        System.out.println("Titik T1 (" + t1.getAbsis()+ "," + t1.getOrdinat() + ") => Setelah RefleksiY");

        t3.setOrdinat(t3.getterRefleksiX());
        System.out.println("Titik T3 (" + t3.getAbsis()+ "," + t3.getOrdinat() + ") => Setelah RefleksiX");
        

    }
}
