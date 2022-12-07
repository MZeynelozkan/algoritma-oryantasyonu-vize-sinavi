package algoritma;
import java.util.Scanner;
public class üslübulma {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        int n,k;
        int total=1;
        System.out.print("lütfen bir üssü alınacak giriniz :");
        n= inp.nextInt();
        System.out.print("üs olarak alınacak sayıyı giriniz :");
        k= inp.nextInt();
        for(int i=1; i<=k;i++){
            total=total*n;
        }
        System.out.print(total);
    }
}
