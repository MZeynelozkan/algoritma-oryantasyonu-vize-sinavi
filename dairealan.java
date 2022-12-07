package algoritma;
import java.util.Scanner;
public class dairealan {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        int r;
        double pi=3.14, alan,aci,y;
        System.out.print("bir r değeri giriniz :");
        r= inp.nextInt();
        System.out.print("bir aci değeri giriniz ");
        aci= inp.nextDouble();
        alan=pi*r*r;
        y=(alan*aci)/360;
        System.out.println("istedeğiniz derecedeki alan değeriniz" +y );
    }
}
