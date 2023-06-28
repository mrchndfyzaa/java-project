package dowhile_loop;
import java.util.Scanner;
public class Dowhile_loop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = 0;
        int b;
        boolean kondisi = true;
        System.out.print("Mau ngulang berapa kali mas : ");
        b = input.nextInt();
        
        do {
            a++;
            System.out.println("ngulang ke-" + a);
            if (a == b) {
                kondisi = false;
            }
        } while (kondisi);
    }    
}
