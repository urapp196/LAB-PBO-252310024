import java.util.Scanner;

public class Latihan3 {
	public static void main(String[] args) {
		int harga = 5000000;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Masukkan luas tanah: ");
		int luas = scanner.nextInt();
		Tanah tanah = new Tanah(luas);
		tanah.totalHarga = tanah.luas * harga;
		
		System.out.println("Harga tanah adalah:"+tanah.totalHarga);
	}
	
}