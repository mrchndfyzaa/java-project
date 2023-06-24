package asd1;

import java.util.Scanner;

public class Asd1 {

    
	private String noPlat, warna, merk;
        
        public Asd1(String NoPlat, String Warna, String Merk){
            //this.noPlat = noPlat;
            //this.warna = warna;
            //this.merk = merk;
        }

        public String getNoPlat() {
            return noPlat;
        }

        public void setNoPlat(String noPlat) {
            this.noPlat = noPlat;
        }

        public String getWarna() {
            return warna;
        }

        public void setWarna(String warna) {
            this.warna = warna;
        }

        public String getMerk() {
            return merk;
        }

        public void setMerk(String merk) {
            this.merk = merk;
        }
        
  	public void displayMessage() {
            System.out.println("No Plat : " + getNoPlat());
            System.out.println("Warna : " + getWarna());
            System.out.println("Merk : " + getMerk());        
        }        


    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
      	String NoPlat = input.next();
      	String Warna = input.next();
      	String Merk = input.next();
        Asd1 m1 = new Asd1(NoPlat, Warna, Merk);
        m1.setNoPlat(NoPlat);
        m1.setWarna(Warna);
        m1.setMerk(Merk);
	m1.displayMessage();
    }
}
