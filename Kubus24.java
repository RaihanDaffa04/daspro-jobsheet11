import java.util.Scanner;

public class Kubus24 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int volume, s, luarPermukaan;
        System.out.print("Input sisi: ");
        s = input.nextInt();
        volume = volumeKubus(s);
        System.out.println("Volume kubus adalah: " + volume);
        luarPermukaan = luarPermukaan(s);
        System.out.println("Luar permukaan adalah: " + luarPermukaan);;
    }
    public static int volumeKubus (int s) {
        int volume = s * s * s;
        return volume;
    }
    public static int luarPermukaan (int s) {
        int luarPermukaan = 6 * s * s;
        return luarPermukaan;
    }
    Scanner close;
}
