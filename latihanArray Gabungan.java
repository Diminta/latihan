import java.util.Scanner;

public class latihan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // --- BAGIAN INPUT ARRAY ---
        System.out.print("Masukkan jumlah elemen array yang diinginkan: ");
        int jumlahElemen = scanner.nextInt();
        int[] arrayAngka = new int[jumlahElemen];

        System.out.println("Masukkan " + jumlahElemen + " angka ke dalam array:");
        for (int i = 0; i < jumlahElemen; i++) {
            System.out.print("Angka ke-" + (i + 1) + ": ");
            arrayAngka[i] = scanner.nextInt();
        }

        System.out.println("\n==================================");
        System.out.println("          HASIL LATIHAN           ");
        System.out.println("==================================");

        // 1. CARI NILAI TERTINGGI
        int nilaiTertinggi = arrayAngka[0]; // Asumsikan nilai pertama yang tertinggi
        for (int i = 1; i < jumlahElemen; i++) {
            if (arrayAngka[i] > nilaiTertinggi) {
                nilaiTertinggi = arrayAngka[i];
            }
        }
        System.out.println("1. Nilai tertinggi dari array tersebut adalah: " + nilaiTertinggi);


        // 2. PENCARIAN (SEARCHING)
        System.out.print("\nMasukkan angka yang ingin dicari di dalam array: ");
        int angkaDicari = scanner.nextInt();
        boolean ditemukan = false;

        for (int i = 0; i < jumlahElemen; i++) {
            if (arrayAngka[i] == angkaDicari) {
                ditemukan = true;
                break; // Hentikan pencarian jika sudah ketemu
            }
        }

        if (ditemukan) {
            System.out.println("2. Hasil Pencarian: Angka " + angkaDicari + " ADA di dalam array.");
        } else {
            System.out.println("2. Hasil Pencarian: Angka " + angkaDicari + " TIDAK ADA di dalam array.");
        }


        // 3. MEMBALIK ARRAY
        System.out.println("\n3. Menampilkan isi array dari belakang (indeks terbesar ke terkecil):");
        for (int i = jumlahElemen - 1; i >= 0; i--) {
            System.out.print(arrayAngka[i] + " ");
        }
        System.out.println(); // Hanya untuk enter/baris baru di akhir

        // Menutup scanner
        scanner.close();
    }
}