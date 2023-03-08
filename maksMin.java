package algoritma;
import java.util.Scanner;
public class maksMin {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        int n,enK=0,enB=0;
        System.out.println("kaç tane sayı gireceksiniz ?");
        int a= inp.nextInt();
        for(int i=1;i<=a;i++) {
            n = inp.nextInt();
            if (n < enK) {
                enK=n;
            }
            if(n>enB){
                enB=n;
            }
        }
        System.out.println("en küçük sayı" +enK);
        System.out.println("en büyük sayı " + enB);
    }
}
