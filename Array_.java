package array_;

//ada library khusus untuk array, bisa untuk menampilkan nilai arraynya tanpa harus manual pake soutprint
import java.util.Arrays;

public class Array_ {
    public static void main(String[] args) {
        
        // tipedata [] namaArray-nya = {komponen-komponen}
                
        //assignment array
        System.out.println("Ini adalah assignment array");
        int[] Array = {1,2,3,4};
        
        Array[2] = 67;
        //mengubah nilai array
        
        //bukan cara yang tepat untuk menampilkan array
        //System.out.println(Array);
        
        //cara yang tepat :
        System.out.println(Array[0]);
        System.out.println(Array[1]);
        System.out.println(Array[2]);
        System.out.println(Array[3]); 
        
        System.out.println("");
        
        //deklarasi array
        // syntax : tipedata[] namaArray-nya = new tipedata[jumlah array];
        System.out.println("Ini adalah deklarasi array");
        float[] arrayFloat = new float[5];
        
        arrayFloat[0] = 17.89f;
        //indeks lain yang belum ada nilainya akan ditampilkan juga tapi nol.
        
        System.out.println(arrayFloat[0]);
        System.out.println(arrayFloat[1]);
        System.out.println(arrayFloat[2]);
        System.out.println(arrayFloat[3]);
        System.out.println(arrayFloat[4]);
        
        System.out.println("");
        
        //menampilkan array yang udh dibuat tanpa harus pake soutprint satu2
        System.out.println(Arrays.toString(Array));
        System.out.println(Arrays.toString(arrayFloat));
    }    
}
