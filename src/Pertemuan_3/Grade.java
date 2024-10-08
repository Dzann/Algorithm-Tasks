package Pertemuan_3;
import java.util.Scanner;

public class Grade {
    public static void main(String[] args) {
        String grade, keterangan;
        Scanner input = new Scanner(System.in);

        System.out.print("Masukan Nilai Mahasiswa: ");
        double nilaiAkhir = input.nextDouble();

        if (nilaiAkhir >= 85) {
            grade = "A";
        } else if (nilaiAkhir >= 75) {
            grade = "B";
        } else if (nilaiAkhir >= 65) {
            grade = "C";
        } else if (nilaiAkhir >= 55) {
            grade = "D";
        } else {
            grade = "E";
        }

        if (nilaiAkhir >= 85) {
            keterangan = "Lulus";
        } else if (nilaiAkhir >= 75) {
            keterangan = "Lulus";
        } else if (nilaiAkhir >= 65) {
            keterangan = "Remedial";
        } else if (nilaiAkhir >= 55) {
            keterangan = "Tidak lulus";
        } else {
            keterangan = "Tidak lulus";
        }

        System.out.println("Nilai Anda : " + nilaiAkhir);
        System.out.println("Grade Anda : " + grade);
        System.out.println("Anda Dinyatakan : " + keterangan);
        input.close();
    }
}
