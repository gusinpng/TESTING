import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Member member = null;
        Pemesanan pemesanan = null;
        Pembayaran pembayaran = new Pembayaran();

        boolean jalan = true;

        while (jalan) {

            System.out.println("\n====================================");
            System.out.println(" SISTEM PEMESANAN MEMBERSHIP GYM");
            System.out.println("====================================");
            System.out.println("1. Registrasi");
            System.out.println("2. Lihat Paket Gym");
            System.out.println("3. Buat Pemesanan");
            System.out.println("4. Lihat Data Member");
            System.out.println("5. Pembayaran");
            System.out.println("6. Keluar");

            System.out.print("\nPilih menu : ");
            int menu = input.nextInt();
            input.nextLine();

            if (menu == 1) {

                System.out.println("\n===== REGISTRASI MEMBER =====");

                System.out.print("Nama : ");
                String nama = input.nextLine();

                System.out.print("No HP : ");
                String noHp = input.nextLine();

                System.out.print("Email : ");
                String email = input.nextLine();

                member = new Member(nama, noHp, email);

                System.out.println("\nRegistrasi berhasil!");

            } else if (menu == 2) {

                System.out.println("\n===== DAFTAR PAKET GYM =====");

                PaketGym bulanan = new PaketBulanan();
                PaketGym tahunan = new PaketTahunan();

                System.out.println("\n1.");
                bulanan.tampilkanInfo();

                System.out.println("\n2.");
                tahunan.tampilkanInfo();

            } else if (menu == 3) {

                if (member == null) {

                    System.out.println("\nSilakan registrasi terlebih dahulu.");

                } else {

                    System.out.println("\n===== BUAT PEMESANAN =====");
                    System.out.println("1. Paket Bulanan");
                    System.out.println("2. Paket Tahunan");

                    System.out.print("Pilih paket : ");
                    int pilihPaket = input.nextInt();

                    PaketGym paket = null;

                    if (pilihPaket == 1) {
                        paket = new PaketBulanan();
                    } else if (pilihPaket == 2) {
                        paket = new PaketTahunan();
                    }

                    if (paket != null) {

                        pemesanan = new Pemesanan(member, paket);

                        System.out.println("\nPemesanan berhasil dibuat!");
                    }
                }

            } else if (menu == 4) {

                if (member == null) {

                    System.out.println("\nBelum ada data member.");

                } else {

                    System.out.println("\n===== DATA MEMBER =====");

                    System.out.println("Nama   : " + member.getNama());
                    System.out.println("No HP  : " + member.getNoHp());
                    System.out.println("Email  : " + member.getEmail());

                    if (pemesanan != null) {
                        System.out.println("Paket  : " +
                                pemesanan.getPaket().getNamaPaket());
                    } else {
                        System.out.println("Paket  : ---");
                    }

                    if (pembayaran.isStatus()) {
                        System.out.println("Status : Membership Aktif");
                    } else {
                        System.out.println("Status : Membership Tidak Aktif");
                    }
                }

            } else if (menu == 5) {

                if (member == null) {

                    System.out.println("\nSilakan registrasi terlebih dahulu.");

                } else if (pemesanan == null) {

                    System.out.println("\nSilakan membuat pemesanan terlebih dahulu.");

                } else if (pembayaran.isStatus()) {

                    System.out.println("\nMembership sudah aktif.");

                } else {

                    pembayaran.bayar();

                    System.out.println("\nPembayaran berhasil.");
                    System.out.println("Membership aktif.");
                }

            } else if (menu == 6) {

                jalan = false;

                System.out.println("\nTerima kasih telah menggunakan");
                System.out.println("Sistem Pemesanan Membership Gym.");

            } else {

                System.out.println("\nMenu tidak tersedia.");
            }
        }

        input.close();
    }
}