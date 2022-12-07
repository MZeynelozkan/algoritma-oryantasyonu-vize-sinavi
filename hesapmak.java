package algoritma;
import java.util.Scanner;
public class hesapmak {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        int n1,n2,select;
        System.out.print("bir n1 giriniz");
        n1= inp.nextInt();
        System.out.print("bir n2 giriniz ");
        n2= inp.nextInt();
        System.out.print("1-toplama\n2-çıkarma\n3-bölme\n4-çarpma");
        System.out.print("bir değer girinzi :");
        select= inp.nextInt();
        switch (select){
            case 1 :
                System.out.print("toplam =" +(n1+n2));
                break;
            case 2 :
                System.out.print("çıkarma =" +(n1-n2));
                break;
            case 3 :
                if(n2!=0) {
                    System.out.print("bölme =" + (n1 / n2));
                }else{
                    System.out.println("sayı sıfıra bölünmez");
                }
                break;
            case 4 :
                System.out.print("çarpma =" +(n1*n2));
                break;
        }
    }
}
