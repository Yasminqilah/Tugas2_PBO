package tugas2;
import java.util.Scanner;
public class KodeAscii {
      public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Masukkan jumlah uang: ");
        int uang = scanner.nextInt();
        
        System.out.println("Apakah di luar hujan? (true/false)");
        boolean hujan = scanner.nextBoolean();
        
        if(uang > 5000 && !hujan){
            System.out.println("Anda bisa keluar membeli gorengan");
        } else{
            System.out.println("Anda tidak bisa keluar membeli gorengan");
            if(uang <= 5000){
                System.out.println("Uang anda kurang");
            } if(hujan){
                System.out.println("Di luar sedang hujan");
            }
        }
        scanner.close();
    }
    
}
