public class Segitiga extends BangunDatar{
    int alas;
    int tinggi;

    public Segitiga(String warna, int alas, int tinggi){
        super(warna);
        this.alas = alas;
        this.tinggi = tinggi;
    }

    @Override
    public void gambar(){
        System.out.println("Drawing Segitiga");

    }

    @Override
    public float luas(){
        return alas * tinggi * 1/2;
    }
}
