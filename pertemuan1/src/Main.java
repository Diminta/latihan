class kalkulator {

    int nilai_a;
    int nilai_b;
    int hasiljmlh;
    int hasilkrg;
    int hasilkali;
    int hasilbagi;

    void tampilkan_hasil() {
        System.out.println("Hasil Penjumlahan: " + hasiljmlh);
        System.out.println("Hasil Pengurangan: " + hasilkrg);
        System.out.println("Hasil Perkalian: " + hasilkali);
        System.out.println("Hasil Pembagian: " + hasilbagi);
    }

}

public class Main {
    public static void main(String[] args) {
        kalkulator kalk = new kalkulator();
        kalk.nilai_a = 10;
        kalk.nilai_b = 5;

        kalk.hasiljmlh = kalk.nilai_a + kalk.nilai_b;
        kalk.hasilkrg = kalk.nilai_a - kalk.nilai_b;
        kalk.hasilkali = kalk.nilai_a * kalk.nilai_b;
        kalk.hasilbagi = kalk.nilai_a / kalk.nilai_b;

        kalk.tampilkan_hasil();
    }
}