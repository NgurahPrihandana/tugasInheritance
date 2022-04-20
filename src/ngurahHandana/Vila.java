package ngurahHandana;

public class Vila extends Penginapan{
    public int jumlah_karyawan;
    private int lamaMenginap;

    public Vila(String namaPenginapan, int hargaPerHari, String alamat, int jumlah_karyawan, int lamaMenginap) {
        super(namaPenginapan, hargaPerHari, alamat);
        this.jumlah_karyawan = jumlah_karyawan;
        this.lamaMenginap = lamaMenginap;
    }

    public int hargaMenginap() {
        int total = super.hargaPerHari * lamaMenginap;
        if(lamaMenginap > 10) {
            total = total - (total * 10 / 100);
        } else {
            total = total - (total * 15 / 100);
        }
        return total;
    }

    public void pemandangan() {
        System.out.println("Pemandangan vila");
    }

    public void setLamaMenginap(int lamaMenginap) {
        if(lamaMenginap < 0) {
            System.out.println("Lama Menginap tidak boleh kurang dari 0 dan diotomatiskan menjadi 1 hari");
            this.lamaMenginap = 1;
        } else {
            this.lamaMenginap = lamaMenginap;
        }
    }

    public void objectUtama() {
        System.out.println("Selling point kami adalah vila yang mewah");
    }
}
