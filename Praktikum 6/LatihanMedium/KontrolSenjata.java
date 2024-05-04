package LatihanMedium;

public class KontrolSenjata {
    private Senjata senjata;

    public KontrolSenjata(Senjata senjata) {
        this.senjata = senjata;
    }

    public boolean isAdaPeluru() {
        return senjata.getPeluru() == 0;
    }

    public void isiPeluru(int jumlahPeluru) {
        senjata.setPeluru(senjata.getPeluru() + jumlahPeluru);
        System.out.println("Peluru berhasil ditambah: " + senjata.getPeluru());
    }

    public void menembak(int jumlahPeluru) {
        System.out.println("Siap menembak " + jumlahPeluru + " kali");
        if (senjata.getPeluru() == 0) {
            System.out.println("Peluru Habis");
        }
        else {
            if (jumlahPeluru <= senjata.getPeluru()) {
                for (int i=0; i < jumlahPeluru; i++) {
                    System.out.println(senjata.getBunyi());
                }
                senjata.setPeluru(senjata.getPeluru() - jumlahPeluru);
            }
            else {
                for (int i=0; i < senjata.getPeluru(); i++) {
                    System.out.println(senjata.getBunyi());
                }
                for (int i=0; i<jumlahPeluru-senjata.getPeluru(); i++) {
                    System.out.println("Gagal tembak, peluru Habis");
                }
                
                senjata.setPeluru(0);
            }
            System.out.println("Peluru sisa: " + senjata.getPeluru());
        }
    }

    public String menusuk() {
        return "Jleb!"; 
    }
}
