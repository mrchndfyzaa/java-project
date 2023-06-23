package bilangan_prima;
import java.util.Scanner;
public class Bilangan_prima {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int batas_atas;
        int x, y, z;
        System.out.println("Hai ini adalah program untuk mencetak bilangan prima sesuai dengan batas yang di berikan.");
        System.out.print("Ketik batas atas : ");
        batas_atas = input.nextInt();
        System.out.println("Maka " + batas_atas + " bilangan prima pertama adalah :");       
        for (x = 2; x <= batas_atas; x++) {
            y = 1;
            for (z = 2; z < x; z++) {
                if (x % z == 0) {
                    y = 0;                   
                }
            }
            if (y == 1) {
                System.out.println(x + " ");
            }
        }
        System.out.println();
    }   
}
