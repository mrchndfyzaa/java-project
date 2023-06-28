package calendar;
//240

import java.util.GregorianCalendar;
public class Calendar {
    public static void main(String[] args) {
        String[] daftarBulan = {
            "Januari",
            "Februari",
            "Maret",
            "April",
            "Mei",
            "Juni",
            "Juli",
            "Agustus",
            "September",
            "Oktober",
            "November",
            "Desember"
        };
        
        GregorianCalendar display = new GregorianCalendar();
        System.out.println(daftarBulan[display.get(GregorianCalendar.MONTH)]);
        System.out.println(display.getTime());
        System.out.println(display.get(GregorianCalendar.MONTH));
        
    }
}
