public class Main {
    public static void main(String[] args) {
       
        Mahasiswa mh1 = new Mahasiswa();
       mh1.setNama("Girgas");
       mh1.setNim("25410100080");
       mh1.setNilai(80);

        Mahasiswa mh2 = new Mahasiswa();
       mh2.setNama("Muer");
       mh2.setNim("25410100088");
       mh2.setNilai(50);

       Mahasiswa mh3 = new Mahasiswa();
       mh3.setNama("Rizky");
       mh3.setNim("25410100090");
       mh3.setNilai(60);

       Mahasiswa mh4 = new Mahasiswa();
       mh4.setNama("Reza");
       mh4.setNim("25410100091");
       mh4.setNilai(90);

       System.out.println("Data Nilai Mahasiswa");
       mh1.Tampilkaninfo();
       mh2.Tampilkaninfo();
       mh3.Tampilkaninfo();
       mh4.Tampilkaninfo();  

       System.out.println("Nama Mahsiswa pertama : " + mh1.getNama());
              System.out.println("NIm Mahasiswa pertama : " + mh1.getNim());

      
    }
}

class Mahasiswa {
    private String nama;
    private String nim;
    private double nilai;

    //  Setter
    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public void setNilai(double nilai) {
        this.nilai = nilai;
    }

    //  Getter
    public String getNama() {
        return nama;
    }

    public String getNim() {
        return nim;
    }

    public double getNilai() {
        return nilai;
    }

    // Methode
    public String hitungStatus() {
        if (nilai >= 80) {
            return "A";

        } else if (nilai >= 70) {
            return "B";

            } else if (nilai >= 55) {
            return "C";

            } else if (nilai >= 40) {
            return "D";

        } else {
            return "Tidak Lulus";
        }
        
        
        }
      public String  CekKelulusan() {
            if (nilai >=55) {
                return "Lulus";
            } else {
                return "Tidak Lulus";
            }
        }
        public void Tampilkaninfo() {
            System.out.println("Nama : " + nama);
            System.out.println("Nim : " + nim);
            System.out.println("Nilai : " + nilai);
            System.out.println("Status : " + hitungStatus());
            System.out.println("Keterangan : " + CekKelulusan());
            System.out.println("===================================");
        }   
        
    }
    

