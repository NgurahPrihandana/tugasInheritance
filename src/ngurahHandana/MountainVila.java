package ngurahHandana;

public class MountainVila extends Vila {
    int ketinggianVila;

    public MountainVila(String namaPenginapan, int hargaPerHari, String alamat, int jumlah_karyawan, int lamaMenginap, int ketinggianVila) {
        super(namaPenginapan, hargaPerHari, alamat, jumlah_karyawan, lamaMenginap);
        this.ketinggianVila = ketinggianVila;
    }

    @Override
    public void pemandangan() {
        if(ketinggianVila >= 1400) {
            System.out.println("Dapat merasakan segarnya angin di ketinggian, melihat pemandangan full gunung dan matahari terbit");
        } else if(ketinggianVila >= 1000) {
            System.out.println("Dapat merasakan segarnya angin di ketinggian dan melihat pemandangan matahari terbit");
        } else {
            System.out.println("Dapat merasakan segarnya angin di ketinggian");
        }
    }

    @Override
    public void objectUtama() {
        System.out.println("Selling point utama kami adalah pegunungan yang tinggi");
    }
}
