package fpb;

import java.util.Scanner;
public class FPB {
    static int gcd_(int a, int b){
        if (b == 0){
            return a;                        
        }
        else{
            int gcd = a%b;
            return gcd_(b, gcd);  
        }             
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        int first_number = input.nextInt();
        int second_number = input.nextInt();

        int gcd;
        
        if(first_number > second_number){
            System.out.println(gcd_(first_number, second_number));
            
        }
        else{
            System.out.println(gcd_(second_number, first_number));
        }
        
    }
}
   
