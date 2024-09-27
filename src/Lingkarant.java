import java.util.Scanner;

public class Lingkarant{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukan Jari-jari : ");

        double jariJari = scanner.nextDouble();

        boolean KelipatanTujuh = (jariJari % 7 == 0);

        double keliling;

        if (KelipatanTujuh) {
            keliling = 2 * (22.0 / 7) * jariJari;
        } else {
            keliling = 2 * Math.PI * jariJari;
        }

        System.out.println("keliling lingkaran : " + keliling);

        scanner.close();
    }
}