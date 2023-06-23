package bilangan_romawi;
import java.util.Scanner;
public class Bilangan_Romawi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int bilangan;
        bilangan = input.nextInt();
        if(bilangan <= 4999){
           Kumpulan_Bilangan_Romawi(bilangan);
            System.out.println("");
        }
        else{
            System.out.println("Maaf angka yang anda masukkan terlalu besar");
        }        
    }
    
    private static void Kumpulan_Bilangan_Romawi(int input_bil) {
        String[] huruf_Romawi = {"I", "IV", "V", "IX", "X", "XL", "L", "XC", "C", "CD", "D", "CM", "M"};
        do {
            if(input_bil >= 1000) {
                System.out.print(huruf_Romawi[12]);
                input_bil = input_bil - 1000;
            }
            else if(input_bil >= 900) {
                System.out.print(huruf_Romawi[11]);
                input_bil = input_bil - 900;
            }
            else if(input_bil >= 500) {
                System.out.print(huruf_Romawi[10]);
                input_bil = input_bil - 500;
            }
            else if(input_bil >= 400) {
                System.out.print(huruf_Romawi[9]);
                input_bil = input_bil - 400;
            }
            else if(input_bil >= 100) {
                System.out.print(huruf_Romawi[8]);
                input_bil = input_bil - 100;
            }
            else if(input_bil >= 90) {
                System.out.print(huruf_Romawi[7]);
                input_bil = input_bil - 90;
            }
            else if(input_bil >= 50) {
                System.out.print(huruf_Romawi[6]);
                input_bil = input_bil - 50;
            }
            else if(input_bil >= 40) {
                System.out.print(huruf_Romawi[5]);
                input_bil = input_bil - 40;
            }
            else if(input_bil >= 10) {
                System.out.print(huruf_Romawi[4]);
                input_bil = input_bil - 10;
            }
            else if(input_bil >= 9) {
                System.out.print(huruf_Romawi[3]);
                input_bil = input_bil - 9;
            }
            else if(input_bil >= 5) {
                System.out.print(huruf_Romawi[2]);
                input_bil = input_bil - 5;
            }
            else if(input_bil >= 4) {
                System.out.print(huruf_Romawi[1]);
                input_bil = input_bil - 4;
            }
            else if(input_bil >= 1) {
                System.out.print(huruf_Romawi[0]);
                input_bil = input_bil - 1;
            }
        } while (input_bil > 0);
    }    
}
