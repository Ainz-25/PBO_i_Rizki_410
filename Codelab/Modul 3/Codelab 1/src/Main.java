
public class Main {
    public static void main(String[] args) {
        KarakterGame karakterUmum = new KarakterGame("Karakter Umum", 100);
        Pahlawan pahlawan = new Pahlawan("Brimstone", 150);
        Musuh musuh = new Musuh("Viper", 200);

        // Menampilkan status awal
        System.out.println("Status awal:");
        System.out.println(pahlawan.getNama() + " memiliki kesehatan: " + pahlawan.getKesehatan());
        System.out.println(musuh.getNama() + " memiliki kesehatan: " + musuh.getKesehatan());
        System.out.println();

        // Simulasi pertarungan
        pahlawan.serang(musuh);
        System.out.println();
        musuh.serang(pahlawan);
    }
}
