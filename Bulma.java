package algoritma;
import java.util.Scanner;
public class Bulma {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        int i;
        int total=0;
        do{
            System.out.print("lütfen bir i sayisi giriniz :" );
            i=inp.nextInt();
            if(i%2==0 && i%4==0){
                total=total+i;
            }
        }while(i%2==0);
        System.out.println("total =" +total);
    }
}
