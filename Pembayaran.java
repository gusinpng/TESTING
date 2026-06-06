public class Pembayaran {

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