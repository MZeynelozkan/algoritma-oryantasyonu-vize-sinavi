package algoritma;
import java.util.Scanner;
public class tersUcgen {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        System.out.print("Yıldızlarla ters üçgen oluşturmak için basamak sayısı giriniz: ");
        int n = inp.nextInt();
        for (int i =0; i<n; i++) {
            for (int j = 0; j <= n-i ; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k <= (2 * i) ; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

