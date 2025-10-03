import java.util.Scanner;
public class switchCetakKRS05 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("===== Cetak KRS Siakad =====");
        System.out.print("masukan semeester saat ini  : ");
        int semester = sc.nextInt();

        switch (semester) {
            case 1:
                System.out.println("KRS semester 1 tampilkan");
                break;
            case 2:
                System.out.println("KRS semester 2 tampilkan");         
                break;
            case 3:
                System.out.println("KRS semester 3 tampilkan"); 
                break;
            case 4:
                System.out.println("KRS semester 4 tampilkan");
                break;
            case 5:
                System.out.println("KRS semester 5 tampilkan");
                break;
            case 6:
                System.out.println("KRS semester 6 tampilkan");
                break;
            case 7:
                System.out.println("KRS semester 7 tampilkan");
                break;
            case 8:
                System.out.println("KRS semester 8 tampilkan");
                break;
            default:
                System.out.println("semester tidak valid");
                break;
        }

         }
        
    }
