import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
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

        input.close();
    }
}
