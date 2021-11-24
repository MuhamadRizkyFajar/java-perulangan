import java.util.Scanner;

public class LuasLingkaran {
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Menghitung Luas Lingkaran ");
		System.out.print("Masukkan Nilai Jari-jari Lingkaran :");
		int r=sc.nextInt();
		int r1=(int)Math.pow(r, 2);
		int L=22*r1/7;
		System.out.println("Hasil luas Lingkaran = "+L);
		System.out.println("Terima Kasih");
	}
}
