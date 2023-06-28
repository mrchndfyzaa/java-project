package for_loop_latihan;
import java.util.Scanner;
public class For_loop_latihan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int awal;
        int akhir;
        System.out.print("Masukkan nilai awal : ");
        awal = input.nextInt();
        System.out.print("Masukkan nilai akhir : ");
        akhir = input.nextInt();
        int total = 0;
        for (; awal <= akhir ; awal++) {
            total = total + awal;
        }
        System.out.println(total);
    }    
}
