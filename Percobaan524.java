import java.util.Scanner;

public class Percobaan524 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int p, l, t, L, vol;

        System.out.print("Masukkan panjang");
        p = input.nextInt();
        System.out.print("Masukkan lebar");
        l = input.nextInt();
        System.out.print("Masukkan tinggi");
        t = input.nextInt();

        L = hitungLuas(p, l);
        System.out.println("Luas Persegi Panjang adalah " + L);
        vol = hitungVolume(t, p, l);
        System.out.println("Volume Balok adalah " + vol);
    }

    static int hitungLuas(int panjang, int lebar) {
        int L = panjang * lebar;
        return L;
    }

    static int hitungVolume(int tinggi, int panjang, int lebar) {
        int volume = hitungLuas(panjang, lebar) * tinggi;
        return volume;
    }
}
