package Pertemuan_2;
import java.util.Scanner;

public class Kubus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukan Panjang SIsi : ");
        double sisi = scanner.nextDouble();

        double volume = sisi * sisi * sisi;
        System.out.print("Volume Kubus : " + volume);
        
        scanner.close();
    }
}
