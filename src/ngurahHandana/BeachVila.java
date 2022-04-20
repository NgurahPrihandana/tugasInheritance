package ngurahHandana;

public class BeachVila extends Vila{
    String ombakPantai;

    public BeachVila(String namaPenginapan, int hargaPerHari, String alamat, int jumlah_karyawan, int lamaMenginap) {
        super(namaPenginapan, hargaPerHari, alamat, jumlah_karyawan, lamaMenginap);
    }

    @Override
    public void pemandangan() {
        if(ombakPantai.equals("Tenang")) {
            System.out.println("Dapat melihat indahnya ombak tenang");
        } else {
            System.out.println("Dapat melakukan kegiatan surfing");
        }
    }

    @Override
    public void objectUtama() {
        System.out.println("Selling point utama kami adalah ombak yang indah");
    }
}
