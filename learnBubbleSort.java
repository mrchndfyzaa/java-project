package bubble;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Bubble {

    int[] L = {25, 27, 10, 8, 50, 21};

    void bubbleSort() {
        //code here
        int i = 0;
        int j, temp;
        
        while(i < L.length){
            for(j = 0; j < L.length-i-1; j++)
            {
                if( L[j] > L[j+1]){
                    temp = L[j];
                    L[j] = L[j+1];
                    L[j+1] = temp;
                } 
            }
            i++;
        }
    
    for(i = 0; i < L.length; i++){
        System.out.println(L[i]);
    }
}

    public static void main(String[] args) {
        Bubble sorter = new Bubble();
        System.out.println("Hasil Akhir:");
        sorter.bubbleSort();
    }
}
