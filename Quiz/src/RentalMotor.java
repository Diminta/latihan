import java.util.Scanner;

public class RentalMotor {

   
    static String[][] dataTransaksi = new String[10][3];
    static int jumlahData = 0; 

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int pilihan;

        do {
            System.out.println("\n=== APLIKASI RENTAL MOTOR SEDERHANA ===");
            System.out.println("1. Tambah Transaksi Sewa Baru");
            System.out.println("2. Lihat Daftar Transaksi");
            System.out.println("3. Keluar");
            System.out.print("Pilih menu (1-3): ");
            pilihan = scanner.nextInt();
            scanner.nextLine(); 

            if (pilihan == 1) {
                System.out.print("Masukkan Nama Peminjam: ");
                String nama = scanner.nextLine();

                System.out.println("Pilih Jenis Motor:");
                System.out.println("1. Matic (Rp 50.000 / hari)");
                System.out.println("2. Bebek (Rp 40.000 / hari)");
                System.out.print("Pilih (1/2): ");
                int jenis = scanner.nextInt();

                System.out.print("Durasi Sewa (hari): ");
                int durasi = scanner.nextInt();

                int totalHarga = hitungBiaya(jenis, durasi);
                String jenisMotor = (jenis == 1) ? "Matic" : "Bebek";

                if (totalHarga > 0 && jumlahData < 10) {
                    dataTransaksi[jumlahData][0] = nama;
                    dataTransaksi[jumlahData][1] = jenisMotor + " (" + durasi + " hari)";
                    dataTransaksi[jumlahData][2] = "Rp " + totalHarga;
                    jumlahData++;

                    System.out.println("\nTransaksi berhasil disimpan!");
                    System.out.println("Total yang harus dibayar: Rp " + totalHarga);
                } else {
                    System.out.println("Pilihan motor tidak valid atau data penuh!");
                }

            } else if (pilihan == 2) {
                tampilkanDataTransaksi();
            } else if (pilihan == 3) {
                System.out.println("Terima kasih telah menggunakan aplikasi ini!");
            } else {
                System.out.println("Pilihan tidak valid, silakan coba lagi.");
            }

        } while (pilihan != 3);

        scanner.close();
    }

    public static int hitungBiaya(int jenisMotor, int durasiSewa) {
        int tarifPerHari = 0;
        if (jenisMotor == 1) {
            tarifPerHari = 50000;
        } else if (jenisMotor == 2) {
            tarifPerHari = 40000;
        }
        return tarifPerHari * durasiSewa;
    }

    public static void tampilkanDataTransaksi() {
        System.out.println("\n=== DAFTAR TRANSAKSI RENTAL ===");
        if (jumlahData == 0) {
            System.out.println("Belum ada data transaksi.");
        } else {
            System.out.println("No | Nama Peminjam | Detail Motor & Durasi | Total Biaya");
            System.out.println("---------------------------------------------------------");
            for (int i = 0; i < jumlahData; i++) {
                System.out.println((i + 1) + "  | " + dataTransaksi[i][0] + " | " + dataTransaksi[i][1] + " | " + dataTransaksi[i][2]);
            }
        }
    }
}