import java.util.Scanner;

public class ArrayRataNilai19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Meminta jumlah mahasiswa dari pengguna
        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlahMhs = sc.nextInt();
        
        int[] nilaiMhs = new int[jumlahMhs];
        double totalLulus = 0, totalTidakLulus = 0;
        int countLulus = 0, countTidakLulus = 0;

        // Mengisi nilai mahasiswa
        for (int i = 0; i < jumlahMhs; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            nilaiMhs[i] = sc.nextInt();

            // Mengelompokkan nilai mahasiswa yang lulus dan tidak lulus
            if (nilaiMhs[i] > 70) {
                totalLulus += nilaiMhs[i];
                countLulus++;
            } else {
                totalTidakLulus += nilaiMhs[i];
                countTidakLulus++;
            }
        }

        // Menghitung rata-rata nilai lulus dan tidak lulus
        double rataLulus = countLulus > 0 ? totalLulus / countLulus : 0;
        double rataTidakLulus = countTidakLulus > 0 ? totalTidakLulus / countTidakLulus : 0;

        // Menampilkan hasil
        System.out.println("Rata-rata nilai lulus = " + rataLulus);
        System.out.println("Rata-rata nilai tidak lulus = " + rataTidakLulus);
    }
}
