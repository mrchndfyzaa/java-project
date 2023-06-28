package ganjil;
public class Ganjil {
    public static void main(String[] args) {
        for (int i = 10; i < 30; i++) {
            if ((i % 2 == 1) && (i != 21) && (i != 27)){
                System.out.println(i);
            }           
        }
    }
    
}
