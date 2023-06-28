package deretfibonacci;


import java.util.Scanner;
public class Deretfibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        long bilke0 = 0;
        long bilke1 = 1;
        long bilke2 = 1;
        long a = 1;
        long bilangan;
        long result;
        String result2 = "";
        
        bilangan = input.nextInt();
        while (a < bilangan) {
            a++;
            bilke2 = bilke1 + bilke0;
            bilke0 = bilke1;
            bilke1 = bilke2;
        }
        if (bilangan == 1) {
            result = 0;
        }
        else {
            result = bilke2;
        }
        System.out.println(result);
        String baru = Long.toString(result);

        String kataReversed = "";
        int panjangKata = baru.length();
        for (int i = panjangKata - 1; i >= 0; i--) {
            kataReversed = kataReversed + baru.charAt(i);
            
        }
        String data2[] = kataReversed.split("");
        
        for (int i = 0; i < data2.length; i++) {
            result2 = data2[0];
        }        
        System.out.println(result2);
    }    
}
