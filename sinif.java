package algoritma;
import java.util.Scanner;
public class sinif {
    public static void main(String[] args) {
       Scanner inp=new Scanner(System.in);
       int mat, fiz ,tur;
        System.out.print("matematik notuzu giriniz :");
        mat= inp.nextInt();
        if(mat<0 || mat>100){
            mat=0;
        }
        System.out.print("fizik notunuzu giriniz :");
        fiz= inp.nextInt();
        if(fiz<0 || fiz>100){
            fiz=0;
        }
        System.out.print("türkçe notunuzu giriniz :");
        tur=inp.nextInt();
        if(tur<0 || tur>100){
            tur=0;
        }
        double ortalama=(tur+mat+fiz)/3;
        if(ortalama>=55){
            System.out.println("sınıfı geçtiniz");
        }else{
            System.out.println("sınıfta kaldınız");
        }
    }
}
