public class App {
    public static void main(String[] args) throws Exception {
        
        Rekening rek = new Rekening();
        rek.setNomorRekening("123456789");
        rek.setNamPemilik("John Doe");
        rek.setSaldo(1000000.0);
        

        System.out.println("== REKENING BANK ==");

        rek.tampilkaninfo();

        rek.setor(250000);
        rek.tarik(100000);
        rek.tarik(1000000);

        System.out.println("Saldo akhir" + rek.getNamaPemilik() + ": Rp " + rek.getSaldo());
    }
}

class Rekening {
    private String NomorRekening;
    private String NamaPemilik;
    private double Saldo;

    // Setter
    public void setNomorRekening(String NomorRekening) {
        this.NomorRekening = NomorRekening;
    
    }
    public void setNamPemilik(String NamaPemilik) {
        this.NamaPemilik = NamaPemilik;

    }
    public void setSaldo(double Saldo) {
        this.Saldo = Saldo;
    }

    // Getter
    public String getNomorRekening() {
        return NomorRekening;
    }
    
    public String getNamaPemilik() {
        return NamaPemilik;
    }

    public double getSaldo(){
        return Saldo;
    }



    // Method
    public void setor (double jumlah) {
        Saldo += jumlah;
        System.out.println("Setor Rp: " + jumlah + "Berhasil");

    }

    public void tarik(double jumlah) {
        if (jumlah <= Saldo) {
            Saldo -= jumlah;
            System.out.println("Tarik Rp: " + jumlah + "Berhasil");
        } else {
            System.out.println("Tarik Rp: " + jumlah + "Gagal, Saldo tidak bisa ditarik");
        }
    }

    public void tampilkaninfo() {
        System.out.println("Nomor Rekening: " + NomorRekening);
        System.out.println("Nama Pemilik: " + NamaPemilik);
        System.out.println("Saldo: Rp " + Saldo);
        System.out.println("===================================");
    }
}

