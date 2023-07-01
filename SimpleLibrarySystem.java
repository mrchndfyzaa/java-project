package data_perpustakaan;
import java.util.Scanner;
class Proses_ {
    private String JudulBuku;
    private String PenulisBuku;
    private String Sinopsis;
    private int JumlahPeminjam;
    
    public Proses_() {
        JudulBuku = "";
        PenulisBuku = "";
        Sinopsis = "";
        JumlahPeminjam = 0;        
    }
    
    public Proses_(String JudulBuku, String PenulisBuku, String Sinopsis, int JumlahPeminjam) {
        this.JudulBuku = JudulBuku;
        this.PenulisBuku = PenulisBuku;
        this.Sinopsis = Sinopsis;
        this.JumlahPeminjam = JumlahPeminjam;
    }
    
    private int JumlahKata() {
        String kata[] = Sinopsis.split(" ");
        int Jumlah = kata.length;
        return Jumlah;
    }
    
    private String KategoriJumlahPeminjam() {
        String real = null;
        if (JumlahPeminjam >= 50) {
            real = "Banyak";
        }
        else if (JumlahPeminjam < 50 && JumlahPeminjam > 0) {
            real = "Sedikit";
        }
        else if (JumlahPeminjam == 0) {
            real = "Belum ada yang meminjam";            
        }
        return real;
    }
    
    public void TampilanHasil() {
        System.out.println("Judul buku              : " + JudulBuku);
        System.out.println("Penulis buku            : " + PenulisBuku);
        System.out.println("Sinopsis                : " + Sinopsis);
        System.out.println("Jumlah kata sinopsis    : " + JumlahKata());
        System.out.println("Jumlah peminjam         : " + KategoriJumlahPeminjam());
    }
}
public class Data_Perpustakaan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String JudulBuku1 = input.nextLine();
        String Penulis1 = input.nextLine();
        String Sinopsis1 = input.nextLine();
        int JumlahPeminjam1 = input.nextInt();
        input.nextLine();
        String JudulBuku2 = input.nextLine();
        String Penulis2 = input.nextLine();
        String Sinopsis2 = input.nextLine();
        int JumlahPeminjam2 = input.nextInt();
        
        Proses_ input_ = new Proses_(JudulBuku1, Penulis1, Sinopsis1, JumlahPeminjam1);
        input_.TampilanHasil();
        Proses_ input2_ = new Proses_(JudulBuku2, Penulis2, Sinopsis2, JumlahPeminjam2);
        input2_.TampilanHasil();
    }    
}
