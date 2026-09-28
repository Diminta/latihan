import java.util.Scanner;
import java.util.ArrayList;

public class wallet {
    

    static ArrayList<String> listNama = new ArrayList<String>();
    static ArrayList<String> listNoHp = new ArrayList<String>();
    static ArrayList<Double> listSaldo = new ArrayList<Double>();
    static Scanner input = new Scanner(System.in);

    public static void main (String[] args) {

        int pilih;
        do {
            Menu();
            pilih = input.nextInt();
            input.nextLine(); // buang newline sisa nextInt()

            switch (pilih) {
                case 1: tambahPengguna(); break;
                case 2: topUpSaldo(); break;
                case 3: hapusPengguna(); break;
                case 4: tampilkanSaldo(); break;
                case 5: System.out.println("Terima kasih sudah menggunakan E-Wallet!"); break;
                default: System.out.println("Pilihan tidak valid!");
            }
         } while (pilih != 5);  

        }
        

        static void Menu() {
            System.out.println("\n===== MENU E-WALLET =====");
            System.out.println("1. Tambah Pengguna");
            System.out.println("2. Top Up Saldo");
            System.out.println("3. Hapus Pengguna");
            System.out.println("4. Tampilkan Saldo");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu: ");
        
    }



    static void tambahPengguna() {
        System.out.print("Masukkan nama: ");
        String n = input.nextLine();
        System.out.print("Masukkan nomor HP: ");
        String hp = input.nextLine();

        listNama.add(n);
        listNoHp.add(hp);
        listSaldo.add(0.0); // saldo awal 0
        System.out.println("Pengguna \"" + n + "\" berhasil ditambahkan!");
    }
}


