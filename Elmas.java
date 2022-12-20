package Baslangic;
import java.util.Scanner;
public class Elmas {
    public static void main(String[] args) {
        Scanner klavye = new Scanner(System.in);
        System.out.println("Bir Sayı Giriniz :");
        int n = klavye.nextInt();

        for (int i = 0; i <= n; i++) {
            for (int j = 0; j < (n - i); j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i + 1); k++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
        for (int i = 1; i < n; i++) {
            for (int k = 1; k <= (n - (n - i)); k++) {
                System.out.print(" "); //spaces
            }
            for (int j = (((2 * n) - 3) - ((2 * i) - 1)); j >= 0; j--) {
                System.out.print("*"); //second line stars
            }

            System.out.println("");
        }
    }
}

