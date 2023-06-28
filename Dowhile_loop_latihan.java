package dowhile_loop_latihan;
import java.util.Scanner;
public class Dowhile_loop_latihan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int awal, akhir;
        awal = input.nextInt();
        akhir = input.nextInt();
        int hasil = 0;
        do {
            hasil = hasil + awal;
            awal++;
        } while (awal <= akhir);
        System.out.println(hasil);
    }    
}
