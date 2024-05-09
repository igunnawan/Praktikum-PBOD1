// 
// File : MapTest.java
// Deskripsi : Program yang menggunakan Generic untuk pasangan Kunci-Nilai
// 

import java.util.*;

public class MapTest {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "satu");
        map.put(2, "dua");

        // Mengambil elemen pertama
        System.out.println(map.get(1));

        // Mengambil keseluruhan kunci sebagai objek collection set
        Set<Integer> key = map.keySet();

        // Pemanggilan list
        for(Integer keys : key) {
            System.out.println(keys + " ");
        }
    }
}
