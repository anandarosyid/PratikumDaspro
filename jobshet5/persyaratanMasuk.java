import java.util.Scanner;

public class persyaratanMasuk {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("apakah anda punya kartu mahasiswa? true/false");
         boolean kartu_mahasiswa = scanner .nextBoolean();
         System.out.println("apakah anda sudh regritasi online? true/false");
         boolean regritasi_online = scanner .nextBoolean();

         System.out.println("==============================");

         if (kartu_mahasiswa || regritasi_online) {
             System.out.println("anda boleh masuk perpustakaan");
         } else {
             System.out.println("anda tidak boleh masuk perpustakaan");
         }
    }
}

