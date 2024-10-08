package Pertemuan_3;
import java.util.Scanner;

public class Lulus {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukan Nilai Mahasiswa: ");
        double nilaiMahasiswa = input.nextDouble();

        String keterangan;
        if (nilaiMahasiswa >= 75) {
            keterangan = "Lulus";
        } else {
            keterangan = "Tidak Lulus";
        }
        System.out.println("Keterangan: " + keterangan);
        input.close();
    }
}
