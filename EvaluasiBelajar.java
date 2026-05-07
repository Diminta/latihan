import java.util.Scanner;

public class EvaluasiBelajar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlahMahasiswa = input.nextInt();

        // Membuat array 1 dimensi untuk nama dan lama belajar
        String[] namaMahasiswa = new String[jumlahMahasiswa];
        double[] waktuBelajarMingguan = new double[jumlahMahasiswa];

        System.out.println("\n--- Input Data Mahasiswa ---");
        // Looping untuk mengisi data ke dalam array
        for (int i = 0; i < jumlahMahasiswa; i++) {
            System.out.println("Mahasiswa ke-" + (i + 1));
            System.out.print("Nama: ");
            namaMahasiswa[i] = input.nextLine();
            
            System.out.print("Lama belajar dalam 1 minggu (jam): ");
            waktuBelajarMingguan[i] = input.nextDouble();
            input.nextLine(); // Membersihkan sisa baris
            System.out.println();
        }

        System.out.println("=== Hasil Evaluasi Waktu Belajar ===");
        // Looping untuk menghitung rata-rata dan mengevaluasi status
        for (int i = 0; i < jumlahMahasiswa; i++) {
            // Menghitung rata-rata per hari (1 minggu = 7 hari)
            double rataRataPerHari = waktuBelajarMingguan[i] / 7.0;
            String status;

            // Evaluasi kondisi: jika rata-rata 2-4 jam per hari dianggap "Aktif"
            if (rataRataPerHari >= 2 && rataRataPerHari <= 4) {
                status = "Aktif";
            } else {
                status = "Perlu Motivasi";
            }

            // Menampilkan hasil
            System.out.println("Nama Mahasiswa     : " + namaMahasiswa[i]);
            System.out.println("Total Waktu (Ahad) : " + waktuBelajarMingguan[i] + " jam");
            System.out.printf("Rata-rata per Hari : %.2f jam\n", rataRataPerHari);
            System.out.println("Status Evaluasi    : " + status);
            System.out.println("------------------------------------");
        }

        input.close();
    }
}