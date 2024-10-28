package Latihan;

import java.util.ArrayList;

class Mobil {
    String nama;
    int harga;

    Mobil(String nama, int harga) {
        this.nama = nama;
        this.harga = harga;
    }
    @Override
    public String toString() {
        return "{" + "nama: '" + nama + '\'' + ", harga: " + harga + '}';
    }
}

public class ContohArrayList {
    public static void main(String[] args) {
        ArrayList<Object> DaftarMobil = new ArrayList<>();

        DaftarMobil.add(new Mobil("Mazda", 35000));
        DaftarMobil.add(new Mobil("Ford", 50000));
        DaftarMobil.add(new Mobil("Supra", 25000));
        DaftarMobil.add(new Mobil("Bugati", 15000));

        System.out.println(DaftarMobil);
    }
}
