import java.util.Scanner;

public class Suhu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Masukan Suhu Dalam Bentuk Celcius : ");
        double Celcius = scanner.nextDouble(); 
        
        double fahrenheit = Celcius * 9/5 + 32;
        System.out.println("Suhu Fahrenheit : " + fahrenheit + " F");

        scanner.close();
    }
}
