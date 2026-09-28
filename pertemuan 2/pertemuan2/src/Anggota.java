import java.util.ArrayList;

public class Anggota {
    String nama;
    ArrayList<Buku> daftarBukuDipinjam = new ArrayList<>();
    
    void pinjamBuku(Buku buku) {
        if (buku.tersedia) {
            daftarBukuDipinjam.add(buku);
            buku.tersedia = false;
            System.out.println(nama + " berhasil meminjam buku: " + buku.judul);
        } else {
            System.out.println("Maaf, buku " + buku.judul + " tidak tersedia untuk dipinjam.");
        }
    }
}
