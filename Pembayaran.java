public class Pembayaran {

    private Pemesanan pemesanan;
    private boolean status;

    public Pembayaran() {
        status = false;
    }

    public void bayar() {
        status = true;
    }

    public boolean isStatus() {
        return status;
    }
}
