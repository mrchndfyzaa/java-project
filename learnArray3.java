package array_multidimensi;
import java.util.Scanner;
import java.util.Arrays;
public class Array_Multidimensi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Belajar array multidimensi");
        
        System.out.println("");
        
        //cara membuat array 2D dengan assigment
        System.out.println("Menampilkan array 2D");
        int[][] array_2D = {
            {1,2,3},
            {4,5,6}
        };
        Menampilkanarray_2D(array_2D);
        
        System.out.println("");
        
        //cara membuat array 2D dengan deklarasi
        //yang 4 awal buat nampilin jumlah array-nya                              
        //yang 4 akhir buat mengetahui jumlah array didalam array
        int[][] _array_2D = new int[4][4];
        Menampilkanarray_2D(_array_2D);
        
    }
    
    private static void Menampilkanarray_2D(int[][] dataArray) {
        //System.out.println(Arrays.deepToString(dataArray));
        for (int i = 0; i < dataArray.length; i++) {
            System.out.println(Arrays.toString(dataArray[i]));
        }
    }
}
