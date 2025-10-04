import java.util.Scanner;

public class Pengecekanwifi {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);

       String Jenis_pengguna ;
       int Jumlah_sks;  
       
       System.out.println("Masukkan Jenis Pengguna (Mahasiswa/Dosen) : ");
         Jenis_pengguna = scanner.nextLine();

        if (Jenis_pengguna.equalsIgnoreCase("dosen")) {
            System.out.println("Akses wifi diberikan kepada (dosen) : ");
            
        }else if (Jenis_pengguna.equalsIgnoreCase("mahasiswa")) {
            System.out.println("Masukkan Jumlah SKS yang diambil : ");
            Jumlah_sks = scanner.nextInt();

            if (Jumlah_sks >= 12) {
                System.out.println("Akses wifi diberikan kepada (mahasiswa aktif)");
            } else {
                System.out.println("Akses ditolak, karena jumlah sks kurang dari 12");
            } 
        }else{
            System.out.println("Akses ditolak");
            }
        } 
        }

    
