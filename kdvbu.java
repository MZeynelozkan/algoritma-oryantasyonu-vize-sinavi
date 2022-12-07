package algoritma;
import java.util.Scanner;
public class kdvbu {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        int x;
        double kdv1=1.18, kdv2=1.08;
        System.out.print("bir ürün değeri giriniz :");
        x= inp.nextInt();
        double kdvliFiyat=(1000>=x)? x*kdv1 : x*kdv2;
        System.out.println("kdvli fiyat =" +kdvliFiyat );
    }
}
