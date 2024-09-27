import java.util.Scanner;

public class PersegiPanjang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukan Panjang : ");
        double p = scanner.nextDouble();
        System.out.print("Masukan Lebar : ");
        double l = scanner.nextDouble();

        double ls = p * l ;

        System.out.print("Luas Persegi Panjang : " + ls);

        scanner.close();
    }
}