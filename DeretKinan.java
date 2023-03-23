package tugaskelompok_2;
import java.util.Scanner;

public class deretkinan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Validasi Nama
        String nama;
        do {
            System.out.print("Masukkan Nama Anda (1-25 karakter): ");
            nama = input.nextLine();
        } while (nama.length() < 1 || nama.length() > 25);
        
        // Validasi NIM
        String nim;
        do {
            System.out.print("Masukkan NIM Anda (10 karakter): ");
            nim = input.nextLine();
        } while (nim.length() != 10);
        
        // Validasi Jumlah Angka
        int jumlahAngka;
        do {
            System.out.print("Masukkan Jumlah Angka (5-20): ");
            jumlahAngka = input.nextInt();
            input.nextLine(); // membersihkan buffer
        } while (jumlahAngka < 5 || jumlahAngka > 20);
        
        // Membuat deret angka
        int[] deret = new int[jumlahAngka];
        for (int i = 0; i < jumlahAngka; i++) {
            System.out.print("Masukkan angka ke-" + (i+1) + ": ");
            deret[i] = input.nextInt();
            input.nextLine(); // membersihkan buffer
        }
        }
}
