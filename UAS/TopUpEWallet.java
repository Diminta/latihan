import java.util.ArrayList;
import java.util.Scanner;

public class TopUpEWallet {
    // ArrayList paralel untuk menyimpan data pengguna
    static ArrayList<String> nama = new ArrayList<>();
    static ArrayList<String> nomorHp = new ArrayList<>();
    static ArrayList<Double> saldo = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int pilihan;
        do {    
            tampilkanMenu();
            pilihan = sc.nextInt();
            sc.nextLine(); // buang newline sisa nextInt()

            switch (pilihan) {
                case 1: tambahPengguna(); break;
                case 2: topUpSaldo(); break;
                case 3: hapusPengguna(); break;
                case 4: tampilkanSaldo(); break;
                case 5: System.out.println("Terima kasih sudah menggunakan E-Wallet!"); break;
                default: System.out.println("Pilihan tidak valid!");
            }
        } while (pilihan != 5);
    }

    // Subprogram: tampilkan menu
    static void tampilkanMenu() {
        System.out.println("\n===== MENU E-WALLET =====");
        System.out.println("1. Tambah Pengguna");
        System.out.println("2. Top Up Saldo");
        System.out.println("3. Hapus Pengguna");
        System.out.println("4. Tampilkan Saldo");
        System.out.println("5. Keluar");
        System.out.print("Pilih menu: ");
    }

    // Subprogram: tambah pengguna -> ArrayList.add()
    static void tambahPengguna() {
        System.out.print("Masukkan nama: ");
        String n = sc.nextLine();
        System.out.print("Masukkan nomor HP: ");
        String hp = sc.nextLine();

        nama.add(n);
        nomorHp.add(hp);
        saldo.add(0.0); // saldo awal 0
        System.out.println("Pengguna \"" + n + "\" berhasil ditambahkan!");
    }

    // Subprogram: top up saldo -> ArrayList.get() + set()
    static void topUpSaldo() {
        if (nama.isEmpty()) {
            System.out.println("Belum ada data pengguna.");
            return;
        }
        tampilkanSaldo();
        System.out.print("Pilih index pengguna yang akan top up: ");
        int idx = sc.nextInt();
        sc.nextLine();

        if (idx < 0 || idx >= nama.size()) {
            System.out.println("Index tidak valid!");
            return;
        }
        System.out.print("Masukkan jumlah top up: ");
        double jumlah = sc.nextDouble();
        sc.nextLine();

        double saldoBaru = saldo.get(idx) + jumlah;
        saldo.set(idx, saldoBaru);
        System.out.println("Top up berhasil! Saldo " + nama.get(idx) + " sekarang: Rp" + saldoBaru);
    }

    // Subprogram: hapus pengguna -> ArrayList.remove()
    static void hapusPengguna() {
        if (nama.isEmpty()) {
            System.out.println("Belum ada data pengguna.");
            return;
        }
        tampilkanSaldo();
        System.out.print("Pilih index pengguna yang akan dihapus: ");
        int idx = sc.nextInt();
        sc.nextLine();

        if (idx < 0 || idx >= nama.size()) {
            System.out.println("Index tidak valid!");
            return;
        }
        String namaDihapus = nama.get(idx);
        nama.remove(idx);
        nomorHp.remove(idx);
        saldo.remove(idx);
        System.out.println("Pengguna \"" + namaDihapus + "\" berhasil dihapus!");
    }

    // Subprogram: tampilkan saldo -> ArrayList.get() + size()
    static void tampilkanSaldo() {
        System.out.println("\n===== DAFTAR PENGGUNA =====");
        if (nama.isEmpty()) {
            System.out.println("Belum ada data pengguna.");
            return;
        }
        for (int i = 0; i < nama.size(); i++) {
            System.out.println(i + ". " + nama.get(i) + " | " + nomorHp.get(i) + " | Rp" + saldo.get(i));
        }
    }
}
