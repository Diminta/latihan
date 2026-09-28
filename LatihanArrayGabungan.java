import java.util.Scanner;

public class LatihanArrayGabungan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("masukkan jumlah elemen array yang diinginkan: ");
        int jumlahElemen = scanner.nextInt();
        int[] arrayAngka = new int[jumlahElemen];

        System.out.println("masukkan " + jumlahElemen + " angka ke dalam array:");
        for (int i = 0; i < jumlahElemen; i++) {
            System.out.print("Angka ke-" + (i + 1) + ": ");
            arrayAngka[i] = scanner.nextInt();
        }

        int nilaiTertinggi = arrayAngka[0];
        for (int i = 1; i < jumlahElemen; i++) {
            if (arrayAngka[i] > nilaiTertinggi) {
                nilaiTertinggi = arrayAngka[i];
            }
        }
        System.out.println("1. nilai tertinggi dari array tersebut adalah: " + nilaiTertinggi);


        System.out.print("\nMasukkan angka yang ingin dicari di dalam array: ");
        int angkaDicari = scanner.nextInt();
        boolean ditemukan = false;

        for (int i = 0; i < jumlahElemen; i++) {
            if (arrayAngka[i] == angkaDicari) {
                ditemukan = true;
                break;
            }
        }

        if (ditemukan) {
            System.out.println("2. hasil pencarian: angka " + angkaDicari + " ada di dalam array.");
        } else {
            System.out.println("2. hasil pencarian: angka " + angkaDicari + " tidak ada di dalam array.");
        }

        System.out.println("\n3. menampilkan isi array dari belakang  :");
        for (int i = jumlahElemen - 1; i >= 0; i--) {
            System.out.print(arrayAngka[i] + " ");
        }
        System.out.println();

        scanner.close();
    }
}