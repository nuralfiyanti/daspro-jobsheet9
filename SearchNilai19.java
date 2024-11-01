import java.util.Scanner;

public class SearchNilai19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Meminta jumlah nilai yang akan diinput
        System.out.print("Masukkan banyaknya nilai yang akan diinput: ");
        int jumlahNilai = sc.nextInt();

        // Membuat array untuk menampung nilai-nilai mahasiswa
        int[] arrNilai = new int[jumlahNilai];

        // Memasukkan nilai mahasiswa ke dalam array
        for (int i = 0; i < jumlahNilai; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            arrNilai[i] = sc.nextInt();
        }

        // Meminta pengguna memasukkan nilai yang ingin dicari
        System.out.print("Masukkan nilai yang ingin dicari: ");
        int key = sc.nextInt();
        int hasil = -1;

        // Melakukan pencarian nilai menggunakan linear search
        for (int i = 0; i < jumlahNilai; i++) {
            if (key == arrNilai[i]) {
                hasil = i; // Menyimpan indeks dari nilai yang ditemukan
                break;
            }
        }

        // Menampilkan hasil pencarian
        System.out.println();
        if (hasil != -1) {
            System.out.println("Nilai " + key + " ketemu, merupakan nilai mahasiswa ke-" + (hasil + 1));
        } else {
            System.out.println("Nilai yang dicari tidak ditemukan.");
        }
    }
}
