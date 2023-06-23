package condass;
import java.util.Scanner;
public class CondAss {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s = "Filkom";
        String val = (s == "Filkom") ? "Brawijaya" : "null";
        System.out.println(s + " " + val);     
        String nama, nim;
        System.out.print("masukkan nama anda : ");
        nama = input.nextLine();
        System.out.print("masukkan nim anda : ");
        nim = input.next();
        String tampilan = (nama == "Marchenda Fayza Madjid") ? nama : "input nama salah";
        String tampilan2 = (nim == "195150700111025") ? nim : "input nim salah";
        System.out.println(tampilan);
        System.out.println(tampilan2);
    }   
}
