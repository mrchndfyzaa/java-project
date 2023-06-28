package fungsi_rekursif;
import java.util.Scanner;
public class Fungsi_rekursif {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int nilai;
        System.out.print("Masukkan sebuah nilai : ");
        nilai = 10;
        System.out.println("Nilai yang dimasukkan adalah : " + nilai); 
        
        printNilai(nilai);
        
        System.out.println("");
        System.out.println("program menghitung bilangan berurutan");
        int jumlah = jumlahNilai(nilai);
        System.out.println("jumlah = " + jumlah);
        
        System.out.println("");
        System.out.println("program menghitung faktorial bilangan");
        int faktorial = hasilFaktorial(nilai);
        System.out.println("faktorial = " + faktorial);
    }
    
    //fungsi rekursif sederhana
    
        private static int hasilFaktorial(int parameter) {
        //membuat program faktorial bilangan
        System.out.println("Parameter = " + parameter);
            if (parameter == 1) {
                return parameter;
            }
        return parameter * hasilFaktorial (parameter-1);
    }
       
    private static int jumlahNilai (int parameter) {
        //membuat program penjumlahan bilangan yang berurutan
        System.out.println("Parameter = " + parameter);
            if (parameter == 0) {
                return parameter;
            }
        return parameter + jumlahNilai (parameter-1);
    }
    private static void printNilai (int parameter) {
        System.out.println("Nilai = " + parameter);
        
        //supaya ga stackoverflow, maka dikasih kondisi
        //rekursif harus dikasih kondisi
        if (parameter == 0){
            return;
        }
        parameter--;
        
        printNilai(parameter);
        //jika hanya menulis ini saja maka, akan terjadi stackoverflow (kelebihan memori)
    }
    
}
