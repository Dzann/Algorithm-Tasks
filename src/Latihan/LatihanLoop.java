package Latihan;

public class LatihanLoop {
    public static void main(String[] args) {
        // int t = 3;
        // for (int h = 0; h<=135;) {
        // System.out.print(h + " ");
        // h+=t;
        // t+=3;
        // }

        System.out.println("==============================");
        // while
        // int nilai = 10;
        // int kurang = -2;
        // while (nilai >=(-80)) {
        // System.out.print(i + " ");
        // nilai+=kurang;
        // kurang-=2;
        // }

        //0 0 1 1 2 3 5 8 13 21 34 55 89
        int a = 0;
        int b = 0;
        int c = 0;
        int i = 1;
        while (c <= 89) {
            System.out.print(c + " ");
            if (i == 1) {
                c = 0;
            } else if (i == 2) {
                c = 1;
            } else {
                a = b;
                b = c;
                c = a + b;
            }
            i++;
        }
    }
}
