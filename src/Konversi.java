
import java.util.Scanner;

/**
 *
 * @author Raehan Reza M
 */
public class Konversi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // pilihan
        System.out.println("Pilihan Konversi : \n"
                + " 1. Jam -> Menit\n"
                + " 2. Detik -> Hari, Jam, Menit, dan Detik");
        System.out.println("\nMasukkan Pilihan : ");
        try (Scanner options = new Scanner(System.in)){
            if(!options.hasNextInt()){
                System.out.println("Itu alfabet, Anda salah!");
            } else {
                if(options.nextInt() == 1){
                    System.out.println("Masukkan Jam : ");
                           Scanner Hours = new Scanner(System.in);
                           JamKeMenit(Hours.nextInt());
                } else {
                    System.out.println("Masukan Detik : ");
                    try(Scanner seconds = new Scanner(System.in)){
                        DetikKeHari(seconds.nextLong());
                        
                    }
                }
            }
        }            
    }

    private static void JamKeMenit(long jam) {
        long menit = jam * 60;
        System.out.println("Menit : " + menit);
    }
    private static void DetikKeHari(long detik) {
        // hari
        int hari = (int) (detik / (60 * 60 * 24));
        
        // jam
        detik %= (60 * 60 * 24);
        int jam = (int) (detik / (60 * 60));
        
        // menit
        detik %= (60 * 60);
        int menit = (int) (detik / 60);
        
        //detik 
        detik %= 60;
        
        System.out.println(hari + "Hari, " + jam + " Jam, " + menit + "Menit, " + detik + "Detik, ");
        
    }
}
        
    

