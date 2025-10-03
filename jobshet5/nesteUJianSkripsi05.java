import java.util.Scanner;
public class nesteUJianSkripsi05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       String pesan;

       System.out.print("apakah mahasiswa sudah bebabs kompen? (ya/tidak) : ");
       String bebasKompen = sc.nextLine().trim();

       System.out.print("masukkan jumlah log bimbingan pembimbing 1: ");
        int bimbinganP1 = sc.nextInt();  
         System.out.print("masukkan jumlah log bimbingan pembimbing 2: ");
        int bimbinganP2 = sc.nextInt();
        
        if (bebasKompen.equalsIgnoreCase("ya")) {
            if (bimbinganP1 >=8 && bimbinganP2 >=4) {
                pesan = "Semua syarat terpenuhi. mahasiswa boleh mendaftar ujian skripsi";
            } else if (bimbinganP1<8 && bimbinganP2 <4) {
                pesan = "Gagal log bimbingan P1 kurang dari 8 kali dan P2 kurang dari 4 kali";
            } else if (bimbinganP1 <8) {
                pesan = "Gagal log bimbingan P1 belum mencapai 8 kali";
            } else {
                pesan = "Gagal log bimbingan P2 belum mencapai 4 kali";
            }
         
        } else {
            pesan = "Gagal! mahasiswa masih memiliki tangungan kompen";
        }
        System.out.println(pesan);
        sc.close();
    }
}
