public class Pembayaran {

    private Pemesanan pemesanan;
    private boolean status;

    public Pembayaran(Pemesanan pemesanan) {
        this.pemesanan = pemesanan;
        this.status = false;
    }

    public void bayar() {
        status = true;
    }

    public boolean isStatus() {
        return status;
    }
}
