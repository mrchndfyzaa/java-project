package for_loop;
import java.util.Scanner;
public class For_loop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int b, c;
        System.out.print("Masukkin mau ngulang dari angka berapa : ");
        c = input.nextInt();
        System.out.print("Masukkin mau selesai ngulang sampe angka ke berapa : ");
        b = input.nextInt();
        int a = c;
        for (; a >= b;) {
            System.out.println("ngulang ke- " + a);
            a--;
        }
/*        for (int a = c; a >= b; a--) {
            System.out.println("ngulang ke-" + a);
        } */
    }    
}
