package algoritma;
import java.util.Scanner;
public class bulmak {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        int k;
        System.out.print("bir k sayısı giriniz :");
        k= inp.nextInt();
        for(int i=0;i<=k;i++){
            if(i%2==0){
                System.out.println(i);
            }
        }
    }
}
