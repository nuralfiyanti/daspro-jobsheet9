import java.util.Scanner;

public class CafeMenu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Daftar menu makanan
        String[] menu = {
            "Nasi Goreng",
            "Mie Goreng",
            "Roti Bakar",
            "Kentang Goreng",
            "Teh Tarik",
            "Cappuccino",
            "Chocolate Ice"
        };

        // Meminta input dari pengguna
        System.out.print("Masukkan nama makanan yang ingin dicari: ");
        String makananDicari = sc.nextLine();

        // Mencari makanan menggunakan linear search
        boolean ditemukan = false;
        for (String makanan : menu) {
            if (makanan.equalsIgnoreCase(makananDicari)) {
                ditemukan = true;
                break;
            }
        }

        // Menampilkan hasil pencarian
        if (ditemukan) {
            System.out.println(makananDicari + " tersedia di menu.");
        } else {
            System.out.println(makananDicari + " tidak ada di menu.");
        }
    }
}
