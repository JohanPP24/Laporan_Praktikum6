public class Main {
    public static void main(String[] args){
        // Membuat objek BangunDatar dari class Lingkaran
        BangunDatar lingkaran = new Lingkaran("Kuning", 6);
        // Membuat objek BangunDatar dari class Segitiga
        BangunDatar segitiga = new Segitiga("Hijau", 4, 6);
        // Membuat objek BangunDatar dari class Persegi
        BangunDatar persegi = new Persegi("Merah", 8, 5);
        /*Memanggil method Gambar */
        lingkaran.gambar();
        segitiga.gambar();
        persegi.gambar();
        System.out.println("Luas Lingkaran : " + lingkaran.luas());
        System.out.println("Luas Segitiga : " + segitiga.luas());
        System.out.println("Luas Persegi : " + persegi.luas());
    }
}
