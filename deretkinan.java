package binus.forum;
import java.util.Scanner;

public class deretkinan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String repeat = "y";
        while (repeat.equalsIgnoreCase("y")) {
            String nama = "";
            while (nama.length() > 25 || nama.length() < 1) {
                System.out.print("Masukkan Nama Anda [1..25]: ");
                nama = scanner.nextLine();
                if (nama.length() > 25 || nama.length() < 1) {
                    System.out.println("Panjang nama harus di antara 1-25 karakter, silakan coba lagi.");
                }
            }

            String NIM = "";
            while (NIM.length() != 10) {
                System.out.print("Masukkan NIM Anda [harus 10 angka]: ");
                NIM = scanner.nextLine();

                // Validasi input harus berupa angka
                if (!NIM.matches("\\d+")) {
                    System.out.println("Input harus berupa angka, silakan coba lagi.");
                    NIM = "";
                    continue;
                }

                // Validasi input harus 10 karakter
                if (NIM.length() != 10) {
                    System.out.println("NIM harus terdiri dari 10 angka, silakan coba lagi.");
                    NIM = "";
                }
            }

            System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\n\nRegistrasi Sukses..\nSelamat datang "+nama+" [NIM "+NIM+"].. ^^v\n\nMari belajar macam-macam deret bilangan..\n\n@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\n\n");

            Integer angka = 0;
            while (angka < 5 || angka > 20) { // validasi input angka
                System.out.print("Masukkan Sembarang Angka [5..20] : ");
                while (!scanner.hasNextInt()) { // validasi input integer
                    System.out.print("Input harus berupa angka, silakan coba lagi: ");
                    scanner.next();
                }
                angka = scanner.nextInt();
                if (angka < 5 || angka > 20) {
                    System.out.println("Jumlah angka harus di antara 5 dan 20, silakan coba lagi.");
                }
            }

            System.out.println("\n@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\n\nDeret Bilangan\n###########\n");

            System.out.println("\n"+angka+" Bilangan Genap :");
            Integer genap = 0;
            Integer count = 0;
            Integer jumlahgenap = 0;
            while (count < angka) {
                genap += 2;
                System.out.print(genap + " ");
                count++;
                jumlahgenap = jumlahgenap + genap;
            }
            System.out.println("\nHasil Penjumlahan = "+jumlahgenap);

            System.out.println("\n"+angka+" Bilangan Ganjil :");
            Integer ganjil = 1;
            Integer count2 = 0;
            Integer jumlahganjil = 0;
            while (count2 < angka) {
                System.out.print(ganjil + " ");
                jumlahganjil = jumlahganjil + ganjil;
                ganjil += 2;
                count2++;
            }
            System.out.println("\nHasil Penjumlahan = "+jumlahganjil);

            System.out.println("\n"+angka+" Bilangan Fibonacci :");
            Integer prev = 0;
            Integer next = 0;
            Integer fibonacci = 1;
            Integer count3 = 0;
            Integer jumlahfibonacci = 0;
            while (count3 < angka) {
                System.out.print(fibonacci + " ");
                next = prev + fibonacci;
                prev = fibonacci;
                jumlahfibonacci = jumlahfibonacci + fibonacci;
                fibonacci = next;
                count3++;
            }
            System.out.println("\nHasil Penjumlahan = "+jumlahfibonacci);

            scanner.nextLine();
            System.out.print("\n\nAnda ingin mengulang? [y/t] :");
            repeat = scanner.nextLine();
        }
    }
}
