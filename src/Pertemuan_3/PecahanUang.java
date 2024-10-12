package Pertemuan_3;
import java.util.Scanner;

public class PecahanUang {
    public static void main(String[] args) throws Exception {
        int seratusRibu, limaPuluhRibu, duaPuluhRibu, sepuluhRibu, limaRibu, duaRibu, seribu, limaRatus, seratus;
        Scanner input = new Scanner(System.in);

        System.out.print("Masukan Jumlah Uang: ");
        int jumlahUang = input.nextInt();

        if (jumlahUang >= 100000) {
            seratusRibu = jumlahUang / 100000;
            jumlahUang = jumlahUang % 100000;
            System.out.println(seratusRibu + " Lembar 100.000 Rupiah");
        }

        if (jumlahUang >= 50000) {
            limaPuluhRibu = jumlahUang / 50000;
            jumlahUang = jumlahUang % 50000;
            System.out.println(limaPuluhRibu + " Lembar 50.000 Rupiah");
        }

        if (jumlahUang >= 20000) {
            duaPuluhRibu = jumlahUang / 20000;
            jumlahUang = jumlahUang % 20000;
            System.out.println(duaPuluhRibu + " Lembar 20.000 Rupiah");
        }

        if (jumlahUang >= 10000) {
            sepuluhRibu = jumlahUang / 10000;
            jumlahUang = jumlahUang % 10000;
            System.out.println(sepuluhRibu + " Lembar 10.000 Rupiah");
        }

        if (jumlahUang >= 5000) {
            limaRibu = jumlahUang / 5000;
            jumlahUang = jumlahUang % 5000;
            System.out.println(limaRibu + " Lembar 5.000 Rupiah");
        }

        if (jumlahUang >= 2000) {
            duaRibu = jumlahUang / 2000;
            jumlahUang = jumlahUang % 2000;
            System.out.println(duaRibu + " Lembar 2.000 Rupiah");
        }

        if (jumlahUang >= 1000) {
            seribu = jumlahUang / 1000;
            jumlahUang = jumlahUang % 1000;
            System.out.println(seribu + " Lembar 1.000 Rupiah");
        }

        if (jumlahUang >= 500) {
            limaRatus = jumlahUang / 500;
            jumlahUang = jumlahUang % 500;
            System.out.println(limaRatus + " Keping 500 Rupiah");
        }

        if (jumlahUang >= 200) {
            limaRatus = jumlahUang / 200;
            jumlahUang = jumlahUang % 200;
            System.out.println(limaRatus + " Keping 200 Rupiah");
        }

        if (jumlahUang >= 100) {
            seratus = jumlahUang / 100;
            jumlahUang = jumlahUang % 100;
            System.out.println(seratus + " Keping 100 Rupiah");
        }
        input.close();
    }
}
