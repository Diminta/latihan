import java.util.ArrayList;
import java.util.Scanner;

public class MemberGym {
    // ArrayList paralel untuk menyimpan data member
    static ArrayList<String> nama = new ArrayList<>();
    static ArrayList<String> nomorMember = new ArrayList<>();
    static ArrayList<Integer> lamaAktif = new ArrayList<>(); // dalam satuan bulan
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int pilihan;
        do {
            tampilkanMenu();
            pilihan = sc.nextInt();
            sc.nextLine(); // buang newline sisa nextInt()

            switch (pilihan) {
                case 1: tambahMember(); break;
                case 2: perpanjangMembership(); break;
                case 3: hapusMember(); break;
                case 4: tampilkanMember(); break;
                case 5: System.out.println("Terima kasih sudah menggunakan GymX!"); break;
                default: System.out.println("Pilihan tidak valid!");
            }
        } while (pilihan != 5);
    }

    // Subprogram: tampilkan menu
    static void tampilkanMenu() {
        System.out.println("\n===== MENU MEMBER GYM =====");
        System.out.println("1. Tambah Member");
        System.out.println("2. Perpanjang Membership");
        System.out.println("3. Hapus Member");
        System.out.println("4. Tampilkan Member");
        System.out.println("5. Keluar");
        System.out.print("Pilih menu: ");
    }

    // Subprogram: tambah member -> ArrayList.add()
    static void tambahMember() {
        System.out.print("Masukkan nama: ");
        String n = sc.nextLine();
        System.out.print("Masukkan nomor member: ");
        String nm = sc.nextLine();
        System.out.print("Masukkan lama aktif (bulan): ");
        int lama = sc.nextInt();
        sc.nextLine();

        nama.add(n);
        nomorMember.add(nm);
        lamaAktif.add(lama);
        System.out.println("Member \"" + n + "\" berhasil ditambahkan!");
    }

    // Subprogram: perpanjang membership -> ArrayList.get() + set()
    static void perpanjangMembership() {
        if (nama.isEmpty()) {
            System.out.println("Belum ada data member.");
            return;
        }
        tampilkanMember();
        System.out.print("Pilih index member yang akan diperpanjang: ");
        int idx = sc.nextInt();
        sc.nextLine();

        if (idx < 0 || idx >= nama.size()) {
            System.out.println("Index tidak valid!");
            return;
        }
        System.out.print("Tambah berapa bulan: ");
        int tambah = sc.nextInt();
        sc.nextLine();

        int lamaBaru = lamaAktif.get(idx) + tambah;
        lamaAktif.set(idx, lamaBaru);
        System.out.println("Membership " + nama.get(idx) + " diperpanjang! Total aktif: " + lamaBaru + " bulan");
    }

    // Subprogram: hapus member -> ArrayList.remove()
    static void hapusMember() {
        if (nama.isEmpty()) {
            System.out.println("Belum ada data member.");
            return;
        }
        tampilkanMember();
        System.out.print("Pilih index member yang akan dihapus: ");
        int idx = sc.nextInt();
        sc.nextLine();

        if (idx < 0 || idx >= nama.size()) {
            System.out.println("Index tidak valid!");
            return;
        }
        String namaDihapus = nama.get(idx);
        nama.remove(idx);
        nomorMember.remove(idx);
        lamaAktif.remove(idx);
        System.out.println("Member \"" + namaDihapus + "\" berhasil dihapus!");
    }

    // Subprogram: tampilkan member -> ArrayList.get() + size()
    static void tampilkanMember() {
        System.out.println("\n===== DAFTAR MEMBER =====");
        if (nama.isEmpty()) {
            System.out.println("Belum ada data member.");
            return;
        }
        for (int i = 0; i < nama.size(); i++) {
            System.out.println(i + ". " + nama.get(i) + " | " + nomorMember.get(i) + " | " + lamaAktif.get(i) + " bulan");
        }
    }
}
