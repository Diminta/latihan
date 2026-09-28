public class Main {
    public static void main(String[] args) {
        Buku buku1 = new Buku();
        buku1.judul = "Java Programming";
        buku1.pengarang = "John Doe";
        buku1.jumlahHalaman = 300;
        buku1.tersedia = true;

        Buku buku2 = new Buku();
        buku2.judul = "Python Programming";
        buku2.pengarang = "Jane Smith";
        buku2.jumlahHalaman = 250;
        buku2.tersedia = false;

        Buku buku3 = new Buku();
        buku3.judul = "C++ Programming";
        buku3.pengarang = "Bob Johnson";
        buku3.jumlahHalaman = 350;
        buku3.tersedia = true;

        Buku buku4 = new Buku();
        buku4.judul = "JavaScript Programming";
        buku4.pengarang = "Alice Johnson";
        buku4.jumlahHalaman = 280;
        buku4.tersedia = true;

        Anggota anggota1 = new Anggota();
        anggota1.nama = "mica";

        Anggota anggota2 = new Anggota();
        anggota2.nama = "Bebo";

        Anggota anggota3 = new Anggota();
        anggota3.nama = "Jake";

        Anggota anggota4 = new Anggota();
        anggota4.nama = "Bob";

        buku1.tampilkanInfoBuku();
        System.out.println("------------------------------");

        buku2.tampilkanInfoBuku();
        System.out.println("------------------------------");

        buku3.tampilkanInfoBuku();
        System.out.println("------------------------------");

        buku4.tampilkanInfoBuku();
        System.out.println("------------------------------");

        anggota1.pinjamBuku(buku3);
        System.out.println("------------------------------");
        anggota2.pinjamBuku(buku2);
    System.out.println("------------------------------");
        anggota3.pinjamBuku(buku3);
        System.out.println("------------------------------");
        anggota4.pinjamBuku(buku4);
        System.out.println("------------------------------");  

    }
}

