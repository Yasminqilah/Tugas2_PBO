package tugas2;
import java.util.Scanner;
public class Tugas2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
                
        System.out.println("Masukkan Bilangan Pertama: ");
            int angka1 = scanner.nextInt();
        System.out.println("Masukkan Bilangan Kedua: ");
            int angka2 = scanner.nextInt();
        System.out.println("Masukkan Bilangan Ketiga: ");
            int angka3 = scanner.nextInt();
            
         System.out.println("Hasil Penjumlahan : " +(angka1+angka2+angka3));
         System.out.println("Hasil Pengurangan : " +(angka2-angka1-angka3));
         System.out.println("Hasil Perkalian : " +(angka1*angka3*angka2));
         
         if(angka2!=0 && angka3!=0){
             System.out.println("Hasil Pembagian : " +((double)angka1/angka2/angka3));
         } else{
             System.out.println("Tidak bisa melakukan pembagan karena salah satu angka adalah nol");
              }
           scanner.close(); 
       
    }
    
}
