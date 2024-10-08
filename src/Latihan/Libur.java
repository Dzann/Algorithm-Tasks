package Latihan;
import java.util.Scanner;

public class Libur {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukan Hari : ");
        String hari = input.nextLine();
        // hari = hari.toLowerCase();

        if (hari.equalsIgnoreCase("sabtu") || hari.equalsIgnoreCase("minggu")) {
            System.out.println("Hari Libur");
        } else {
            System.out.println("Hari Kerja");
        }
        input.close();
    }
}
