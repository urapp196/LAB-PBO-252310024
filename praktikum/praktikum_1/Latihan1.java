import java.util.Scanner;

public class Latihan1 {
    public static void main(String[] args) {
        System.out.println("Aplikasi penghitung volume kubus");
        
        Kubus kubus = new Kubus();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan sisi kubus: ");
        int sisi = scanner.nextInt();
        kubus.sisi = sisi;

        int volume = kubus.hitungVolume();
        System.out.println("volume dari kubus: " + volume);

        scanner.close();
    }
}