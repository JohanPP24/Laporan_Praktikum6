public class Persegi extends BangunDatar{
    float panjang;
    float lebar;

    public Persegi(String warna, float panjang, float lebar){
        super(warna);
        this.panjang = panjang;
        this.lebar = lebar;
    }

    @Override
    public void gambar(){
        System.out.println("Drawing Persegi");
    }

    @Override
    public float luas(){
        return panjang*lebar;
    }
}
