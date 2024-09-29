package percabanganifelse;
import java.util.Scanner;
public class PercabanganIfElse {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //deklarasi variabel
        int jumlah;
        double harga,total,diskon,uang,kembalian;
        
        System.out.println("Program IF ELSE");
        System.out.println("===============================");
        System.out.print("Jumlah Barang     = ");
        jumlah = sc.nextInt();
        System.out.print("Masukkan Harga    = Rp");
        harga = sc.nextDouble();
        System.out.println("===============================");
        total = jumlah*harga;
        System.out.println("Total             = Rp"+total);
        
        if (total>100_000&&total<=200_000){
            diskon = total*0.05;
            System.out.println("Diskon 5%         = Rp"+diskon);
            total = total-diskon;
            System.out.println("Total Akhir       = Rp"+total);
        } else if (total>200_000&&total<=300_000){
            diskon = total*0.1;
            System.out.println("Diskon 10%        = Rp"+diskon);
            total = total-diskon;
            System.out.println("Total Akhir       = Rp"+total);
        } else if (total>300_000&&total<=400_000){
            diskon = total*0.15;
            System.out.println("Diskon 15%        = Rp"+diskon);
            total = total-diskon;
            System.out.println("Total Akhir       = Rp"+total);
        } else if (total>400_000&&total<=500_000){
            diskon = total*0.2;
            System.out.println("Diskon 20%        = Rp"+diskon);
            total = total-diskon;
            System.out.println("Total Akhir       = Rp"+total);
        } else{
            System.out.println("Belum ada diskon");
        }
        System.out.println("===============================");
        
        System.out.println("Masukkan Uang");
        System.out.print("Rp");
        uang = sc.nextDouble();
        if (uang>total){
            kembalian = uang-total;
            System.out.println("Kembalian         = Rp"+kembalian);
        } else if (uang==total){
            System.out.println("Uang Pas");
        }
    }
    
}
