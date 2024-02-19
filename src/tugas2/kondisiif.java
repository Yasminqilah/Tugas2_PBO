package tugas2;
import java.util.Scanner;
public class kondisiif {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Masukkan karakter pertama: ");
        char karakter1 = scanner.next().charAt(0);
        
        System.out.println("Masukkan Karakter kedua: ");
        char karakter2 = scanner.next().charAt(0);
        
        int ascii1 = (int)karakter1;
        int ascii2 = (int)karakter2;
        
        int hasil = ascii1 + ascii2;
        
        System.out.println("Hasil penjumlahan kode ASCII dari"+karakter1+"dan"+karakter2+"adalah:"+hasil);
        
        scanner.close();
      
    }
    
}
