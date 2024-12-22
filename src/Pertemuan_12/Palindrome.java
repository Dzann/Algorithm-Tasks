package Pertemuan_12;

import java.util.*;

public class Palindrome {

    public static boolean isPal(String s) {
        if (s.length() == 0 || s.length() == 1)
            return true;
        if (s.charAt(0) == s.charAt(s.length() - 1))
            return isPal(s.substring(1, s.length() - 1));
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Masukan Kata : ");
        String x = sc.nextLine();
        if (isPal(x))
            System.out.println(x + " adalah Palindrome");
        else
            System.out.println(x + " bukan Palindrome");
        
        sc.close();
    }
}
