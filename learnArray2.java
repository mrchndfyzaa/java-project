package array_2;
import java.util.Arrays;
public class Array_2 {
    public static void main(String[] args) {
        int[] array_2 = {1, 2, 3, 4, 5};
        int[] array_3 = new int[4];
        
        //hal ini terjadi karena pada awalnya masing2 array memiliki memori yang berbeda
        System.out.println(array_2);
        System.out.println(array_3);
        
        array_3 = array_2;
        
        //tapi saat sudah disamakan, memori array-nya akan sama
        //makanya akan sama array-nya
        System.out.println(array_2);
        System.out.println(array_3);
        
        System.out.println("");
        
        System.out.println(Arrays.toString(array_2));
        System.out.println(Arrays.toString(array_3));
        
        System.out.println("");
        
        //tapi bagaimana jika kita ingin mengubah isi dari array_2?
        //apakah akan ngaruh ke array_3?
        //jawabannya adalah akan keubah juga, kok bisa?
        //sama aja kayak kita masukin nilai ke array_3
        array_2[0] = 67;
        array_3[2] = 65;
        System.out.println(Arrays.toString(array_2));
        System.out.println(Arrays.toString(array_3)); 
        
        System.out.println("");
        
        UbahArray(array_2);
        System.out.println(Arrays.toString(array_2));
        System.out.println(Arrays.toString(array_3));                
    }
    
    //ini akan bahaya saya kita membuat method baru
    //method yang argumentnya adalah reference, bukan nilainya (pass by reference)
    //bukan pass by value
    private static void UbahArray(int[] DataArray) {
        System.out.println("");
        
        for( int data : DataArray) {
            System.out.println(data);
        }
        System.out.println("");
        
        DataArray[3] = 63;
        for( int data : DataArray) {
            System.out.println(data);
        }
        System.out.println("");
    }
    
}
