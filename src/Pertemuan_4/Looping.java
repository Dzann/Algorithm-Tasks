package Pertemuan_4;

public class Looping {
    public static void main(String[] args) {

        // For
        for (int i = 2; i <= 5; i++) {
            for (int j = 2; j <= 5; j++) {
                if (i == j) {
                    System.out.print(i + "x" + j + " = " + (i*j));
                }
            }
            System.out.println();
        }

        // While loop
        int i = 100;
        while (i >= 5) {
            System.out.println("Test " + i);
            i-=5; //decrement
        }
        
        // Do While
        int h = 100;
        do  {
            System.out.println("Test " + i);
            i-=5; //decrement
        } while (i >= 5);
        
    }

}
