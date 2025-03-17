//Class Hewan
class Hewan {
   //Attribut
   String nama;
   String jenis;
   String suara;
   String warna;

   public Hewan(String nama, String jenis, String suara,  String warna) {
       this.nama = nama;
       this.jenis = jenis;
       this.suara = suara;
       this.warna = warna;
   }
        public void tampilkanInfo(){
       System.out.println("nama: " + nama);
       System.out.println("jenis: " + jenis);
       System.out.println("suara: " + suara);
       System.out.println("warna: " + warna);
       System.out.println();

   }
}