package Pertemuan_4;

public class Tugas4 {
    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 6; j++) {
                if ((j % 2 == 1) ^ (i == 2)) {
                    System.out.print("S ");
                } else {
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }
}
