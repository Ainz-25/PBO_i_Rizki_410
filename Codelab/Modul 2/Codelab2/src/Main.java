public class Main {
    public static void main(String[] args) {
        // Membuat objek RekeningBank
        RekeningBank rekening1 = new RekeningBank("202410370110410", "Rizki Adi Pranata", 500000);
        RekeningBank rekening2 = new RekeningBank("202410370110430", "Zaidan Diandra", 1000000);

        // Menampilkan informasi awal rekening
        rekening1.tampilkanInfo();
        rekening2.tampilkanInfo();

        // Simulasi transaksi
        rekening1.setorUang(200000);
        rekening2.setorUang(500000);

        System.out.println(); // Pemisah output

        rekening1.tarikUang(800000);
        rekening2.tarikUang(300000);

        System.out.println(); // Pemisah output

        // Menampilkan informasi akhir rekening
        rekening1.tampilkanInfo();
        rekening2.tampilkanInfo();
    }
}