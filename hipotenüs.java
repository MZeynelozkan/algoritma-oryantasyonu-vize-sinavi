package algoritma;
import java.util.Scanner;
public class hipotenüs {
    public static void main(String[] args) {
    Scanner inp=new Scanner(System.in);
    int x, y;
    double z;
        System.out.print("önce bir x değeri giriniz sonra bir y değeri giriniz :");
        x= inp.nextInt();
        y= inp.nextInt();
        z=Math.sqrt((x*x)+(y*y));
        System.out.println("hipotenüs değeriniz =" +z);
    }
}
