package condass2;
import java.util.Scanner;
public class CondAss2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String nama, password = null, nama_baru, password_baru;
        System.out.print("Masukkan nama anda : ");
        nama = input.nextLine();
        System.out.print("Masukkan password baru anda : ");
        password : input.next();
        System.out.println("Data anda tersimpan!");
        System.out.println("Kini masukkan kembali nama dan password anda!");
        System.out.print("Ketik nama : ");
        nama_baru = input.next();
        System.out.print("Ketik password : ");
        password_baru = input.next();
        String tampilan = (nama_baru == nama) ? "nama : "+ nama : "data tidak ditemukan";
        String tampilan2 = (password_baru == password) ? "password : " + password + " username : iloveu3000_" : "data tidak ditemukan";
        System.out.println(tampilan);
        System.out.println(tampilan2);
    }   
}
