import java.util.Scanner;

public class Kafe24 {
    public static void Menu(String namaPelanggan, boolean isMember) {
        System.out.println("Selamat datang, " + namaPelanggan + "!");
        if (isMember) {
            System.out.println("Anda adalah member, dapatkan diskon 10% untuk setiap pembelian!");
        }

        System.out.println("===== MENU RESTO CAFE =====");
        System.out.println("1. Kopi Hitam - Rp 15,000");
        System.out.println("2. Cappuccino - Rp 20,000");
        System.out.println("3. Latte - Rp 22,000");
        System.out.println("4. Teh Tarik - Rp 12,000");
        System.out.println("5. Roti Bakar - Rp 10,000");
        System.out.println("6. Mie Goreng - Rp 18,000");
        System.out.println("===========================");
        System.out.println("Silahkan pilih menu yang Anda inginkan.");
    }

    public static int hitungTotalHarga(int pilihanMenu, int banyakItem, String kodePromo) {
        int[] hargaItems = { 15000, 20000, 22000, 12000, 10000, 18000 };
        int hargaTotal = hargaItems[pilihanMenu - 1] * banyakItem;
        if (kodePromo.equals("DISKON50")) {
            System.out.println("Anda mendapatkan diskon 50%");
            hargaTotal *= 0.5;
        } else if (kodePromo.equals("DISKON30")) {
            System.out.println("Anda mendapatkan diskon 30%");
            hargaTotal *= 0.7;
        } else
            System.out.println("Kode anda invalid");
        return hargaTotal;
    }

    public static void main(String[] args) {
        double totalHargaPesanan = 0;
        Scanner input = new Scanner(System.in);
        Menu("Andi", true);
        while (true) {
            System.out.print("\nMasukkan nomor menu yang ingin Anda pesan: ");
            int pilihanMenu = input.nextInt();
            System.out.print("Masukkan jumlah item yang ingin dipesan: ");
            int banyakItem = input.nextInt();
            input.nextLine();
            System.out.print("Masukkan kode promo: ");
            String inputKode = input.nextLine();
            int totalHarga = hitungTotalHarga(pilihanMenu, banyakItem, inputKode);
            totalHargaPesanan += totalHarga;
            System.out.println("Total harga untuk pesanan Anda: Rp" + totalHarga);
            System.out.println("Apakah lanjut? (y/n): ");
            String lanjut = input.nextLine();
            if (lanjut.equalsIgnoreCase("n")) {
                break;
            }
        }
        System.out.println("Total pesanan anda adalah: Rp" + totalHargaPesanan);
    }
}
