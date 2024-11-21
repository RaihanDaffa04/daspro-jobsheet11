import java.util.Scanner;

public class TugasNo2 {

    public static int[][] dataPenjualan = {
            { 20, 20, 25, 20, 10, 60, 10 },
            { 30, 80, 40, 10, 15, 20, 25 },
            { 5, 9, 20, 25, 10, 5, 45 },
            { 50, 8, 17, 18, 10, 30, 6 },
            { 15, 10, 16, 15, 10, 10, 55 }
    };
    static String[] namaMenu = {
            "Es Kopi", "Teh", "Es Degan", "Roti Bakar", "Gorengan"
    };

    public static void inputPenjualan() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Masukkan data penjualan untuk 5 menu selama 7 hari:");

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 7; j++) {
                System.out.print("Menu " + namaMenu[i] + " Hari " + (j + 1) + ": ");
                dataPenjualan[i][j] = scanner.nextInt();
            }
        }
    }

    public static void tampilkanPenjualan() {
        System.out.println("Rekap Penjualan Selama 7 Hari:");
        for (int i = 0; i < 5; i++) {
            System.out.print(namaMenu[i] + ": ");
            for (int j = 0; j < 7; j++) {
                System.out.print(dataPenjualan[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void menuTertinggi() {
        int maxPenjualan = 0;
        int menuTertinggi = -1;
        for (int i = 0; i < 5; i++) {
            int totalPenjualan = 0;
            for (int j = 0; j < 7; j++) {
                totalPenjualan += dataPenjualan[i][j];
            }
            if (totalPenjualan > maxPenjualan) {
                maxPenjualan = totalPenjualan;
                menuTertinggi = i;
            }
        }
        System.out.println("Menu dengan penjualan tertinggi adalah " + namaMenu[menuTertinggi]
                + " dengan total penjualan " + maxPenjualan);
    }

    public static void rataRataPenjualan() {
        System.out.println("Rata-rata Penjualan untuk Setiap Menu:");
        for (int i = 0; i < 5; i++) {
            int totalPenjualan = 0;
            for (int j = 0; j < 7; j++) {
                totalPenjualan += dataPenjualan[i][j];
            }
            double rataRata = totalPenjualan / 7.0; 
            System.out.println(namaMenu[i] + ": " + rataRata);
        }
    }

    public static void main(String[] args) {
        inputPenjualan();

        tampilkanPenjualan();

        menuTertinggi();

        rataRataPenjualan();

    }
}