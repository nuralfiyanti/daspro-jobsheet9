import java.util.Scanner;

public class NilaiMahasiswa {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        // Memasukkan jumlah nilai mahasiswa
        System.out.print("Input jumlah mahasiswa = ");
        int n = input.nextInt();

        int nilaiMhs[] = new int[n];
        int total = 0;

        // Memasukkan setiap nilai mahasiswa dan menghitung total
        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.print("Input nilai mahasiswa ke-" + (i + 1) + " : ");
            nilaiMhs[i] = input.nextInt();
            total += nilaiMhs[i];
        }

        // Menghitung rata-rata
        double rata2 = (double) total / n;
        System.out.println("Rata-rata = " + rata2);

        // Inisialisasi nilai minimum dan maksimum
        int min = nilaiMhs[0];
        int max = nilaiMhs[0];

        // Mencari nilai minimum dan maksimum
        for (int i = 1; i < nilaiMhs.length; i++) {
            if (nilaiMhs[i] > max) {
                max = nilaiMhs[i];
            }
            if (nilaiMhs[i] < min) {
                min = nilaiMhs[i];
            }
        }

        // Menampilkan nilai minimum dan maksimum
        System.out.println("Nilai Terendah = " + min);
        System.out.println("Nilai Tertinggi = " + max);

        // Menampilkan semua nilai mahasiswa
        System.out.println("Semua nilai yang dimasukkan:");
        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.println("Nilai mahasiswa ke-" + (i + 1) + " : " + nilaiMhs[i]);
        }
    }
}
