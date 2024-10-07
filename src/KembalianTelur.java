import java.util.*;
// menghitung uang kembalian dari pembelian kg telur jika beli lebih dari 3kg maka dapat diskon 10%, harga per kg 28k
public class KembalianTelur {
    public static void main(String[] args) {
        double perKilo, diskon, kembalian, uangBayar, totalHarga, telur;
        Scanner input = new Scanner(System.in);
        perKilo = 28000;
        diskon = 0.1;
        System.out.print("Berapa Kg Telur: ");
        telur = input.nextDouble();
        System.out.print("Uang Dibayarkan: ");
        uangBayar = input.nextDouble();

        totalHarga = telur * perKilo;
        if (telur > 3) {
            diskon = totalHarga * diskon;
        } else {
            diskon = 0.0;
        }
        double subtotal = totalHarga - diskon;
        kembalian = uangBayar - subtotal;

        System.out.println("Total Kg Yang Dibeli: " + (int) telur);
        System.out.println("total Harga: "+ (int) totalHarga);
        System.out.println("Discount: " +(int) diskon);
        System.out.println("Subtotal: "+ (int) subtotal);
        System.out.println("Uang Kembalian: "+ (int) kembalian);

        input.close();
    }
}
