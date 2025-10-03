import java.util.*;
public class ifCetakKRS05 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("====Cetak KRS SIAKAD ===== ");
       System.out.print("Apkah UKT sudah lunas ? (true/false) : "); 
         boolean uktLunas = sc.nextBoolean();
            if (uktLunas) {
                System.out.println("Pembayarn UKT terverifikasi");
                System.out.println("silahkan cetak KRS dan mita tanda tangan DPA");
            } else {
                System.out.println("“Registrasi ditolak. Silakan lunasi UKT terlebih dahulu");
            } 
        } 
    }
