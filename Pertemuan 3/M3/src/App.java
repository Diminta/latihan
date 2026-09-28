// Source code is decompiled from a .class file using FernFlower decompiler (from Intellij IDEA).
public class App {
   public App() {
   }

   public static void main(String[] args) throws Exception {
      Rekening rek = new Rekening();
      rek.setNomorRekening("123456789");
      rek.setNamPemilik("John Doe");
      rek.setSaldo((double)1000000.0F);
      System.out.println("== REKENING BANK ==");
      rek.tampilkaninfo();
      rek.setor((double)250000.0F);
      rek.tarik((double)100000.0F);
      rek.tarik((double)1000000.0F);
      System.out.println("Saldo akhir" + rek.getNamaPemilik() + ": Rp " + rek.getSaldo());
   }
}


class Rekening {
   private String NomorRekening;
   private String NamaPemilik;
   private double Saldo;

   Rekening() {
   }

   public void setNomorRekening(String NomorRekening) {
      this.NomorRekening = NomorRekening;
   }

   public void setNamPemilik(String NamaPemilik) {
      this.NamaPemilik = NamaPemilik;
   }

   public void setSaldo(double Saldo) {
      this.Saldo = Saldo;
   }

   public String getNomorRekening() {
      return this.NomorRekening;
   }

   public String getNamaPemilik() {
      return this.NamaPemilik;
   }

   public double getSaldo() {
      return this.Saldo;
   }

   public void setor(double jumlah) {
      this.Saldo += jumlah;
      System.out.println("Setor Rp: " + jumlah + "Berhasil");
   }

   public void tarik(double jumlah) {
      if (jumlah <= this.Saldo) {
         this.Saldo -= jumlah;
         System.out.println("Tarik Rp: " + jumlah + "Berhasil");
      } else {
         System.out.println("Tarik Rp: " + jumlah + "Gagal, Saldo tidak bisa ditarik");
      }

   }

   public void tampilkaninfo() {
      System.out.println("Nomor Rekening: " + this.NomorRekening);
      System.out.println("Nama Pemilik: " + this.NamaPemilik);
      System.out.println("Saldo: Rp " + this.Saldo);
      System.out.println("===================================");
   }
}
