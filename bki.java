package algoritma;
import java.util.Scanner;
public class bki {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        double boy,kilo,bki;
        System.out.print("boy değerinizi giriniz cm olarak ");
        boy= inp.nextDouble();
        System.out.print("kilonuzu giriniz kilogram olarak ");
        kilo= inp.nextDouble();
        bki=boy/kilo;
        if(bki<2){
            System.out.println("kilolu");
        }if(2<bki && bki<=2.5 ){
            System.out.println("normal");
        }if( 2.5<bki){
            System.out.println("zayıf");
        }
    }
}
