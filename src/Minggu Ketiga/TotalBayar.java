import java.util.Scanner;

public class TotalBayar {
    public static void main(String[] args) throws Exception {
        double diskon1, diskon2, diskon3, diskon = 0;
        Scanner input = new Scanner(System.in);
        diskon1 = 0.05;
        diskon2 = 0.1;
        diskon3 = 0.12;
        // total belanja > 50k dapet diskon 10k
        System.out.print("Masukan Total Belanja : ");
        double totalBayar = input.nextDouble();
        if (totalBayar > 200000 ) {
            diskon = totalBayar * diskon3;
            if (diskon > 50000) {
                diskon = 50000;
            }
            // diskon = diskon > 50000 ? 50000 : diskon; //bisa pake cara ternary
        } else if (totalBayar > 100000 ) {
            diskon = totalBayar * diskon2;
            if (diskon > 15000) {
                diskon = 15000;
            }
        } else if (totalBayar > 50000) {
            diskon = totalBayar * diskon1;
            if (diskon > 4000) {
                diskon = 4000;
            }
        }
        double totalBelanja = totalBayar - diskon;
        System.out.println("Diskon yang didapat : Rp." + (int) diskon);
        System.out.println("Total belanja : Rp." + (int) totalBelanja);
        input.close();
    }

}
