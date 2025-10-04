import java.util.Scanner;   
public class tugas2_05 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("masukkan angka  : ");
        int angka = sc.nextInt();
        System.out.println("=============================");
        if (angka % 2 == 0) {
            System.out.println(angka + " adalah bilangan genap");
        } else {
            System.out.println(angka + " adalah bilangan ganjil");
        sc.close();
        }
    }
}
