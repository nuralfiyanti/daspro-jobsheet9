import java.util.Scanner;

public class PemesananKafe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Memasukkan jumlah pesanan
        System.out.print("Masukkan jumlah pesanan: ");
        int jumlahPesanan = scanner.nextInt();
        scanner.nextLine(); // Mengkonsumsi newline setelah nextInt()

        // Membuat array untuk menyimpan nama pesanan dan harga
        String[] namaPesanan = new String[jumlahPesanan];
        double[] hargaPesanan = new double[jumlahPesanan];

        // Memasukkan nama dan harga pesanan
        for (int i = 0; i < jumlahPesanan; i++) {
            System.out.print("Masukkan nama pesanan ke-" + (i + 1) + ": ");
            namaPesanan[i] = scanner.nextLine();

            System.out.print("Masukkan harga pesanan ke-" + (i + 1) + ": ");
            hargaPesanan[i] = scanner.nextDouble();
            scanner.nextLine(); // Mengkonsumsi newline setelah nextDouble()
        }

        // Menghitung total biaya
        double totalBiaya = 0;
        for (double harga : hargaPesanan) {
            totalBiaya += harga;
        }

        // Menampilkan daftar pesanan dan total biaya
        System.out.println("\nDaftar Pesanan:");
        for (int i = 0; i < jumlahPesanan; i++) {
            System.out.println(namaPesanan[i] + " - Harga: Rp " + hargaPesanan[i]);
        }
        System.out.printf("Total Biaya: Rp %.2f\n", totalBiaya);
    }
}
