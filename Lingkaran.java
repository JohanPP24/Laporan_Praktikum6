public class Lingkaran extends BangunDatar{
    int r;

    public Lingkaran(String warna, int r){
        super(warna);
        this.r = r;
    }

    @Override
    public void gambar(){
        System.out.println("Drawing Lingkaran");
    }

    @Override
    public float luas(){
        return (float)(3.14 * r * r);
    }
}
