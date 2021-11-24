import java.util.Scanner;

public class MainApp {

		public static void main(String[] args) {
			MainApp main= new MainApp();
			main.Aplikasi();
			// Aplikasi running
			boolean run=true;
			int count=0;
			String jawab;
			Scanner sc=new Scanner(System.in);
			
			while (run) {
				System.out.print("You want exit this app ? "
						+ "\n yes/no?");
				jawab=sc.nextLine();
				if (jawab.equalsIgnoreCase("yes")) {
					run=false;
				}else if(jawab.equalsIgnoreCase("No")) {
					main.Aplikasi();
					count++;
				}
			}
			System.out.println("Than You!");
		}

		public void Aplikasi() {
			//Aplikasi Perhitungan
					//Aplikas Rumus Bangun Datar
					//-Luas PersegiPanjang
					//-Luas Segitiga
					//-Luas Lingkaran
					Scanner scan= new Scanner(System.in);
					System.out.println("Aplikasi Perhitungan\n"
							+ "Luas PersegiPanjang\n"
							+ "Luas Segitiga\n"
							+ "Luas Lingkaran\n"
							+ "Silahkan dipilih");
					double panjang,lebar,tinggi,jari2,luas;
					String bentukbidang=scan.nextLine();
					
					if (bentukbidang.equalsIgnoreCase("PersegiPanjang")) {
						System.out.print("Panjang = ");
						panjang=scan.nextInt();
						System.out.print("Lebar = ");
						lebar=scan.nextInt();
						luas=panjang*lebar;
						System.out.println("Luas Persegi Panjang = "+luas);
					} else if (bentukbidang.equalsIgnoreCase("Segitiga")) {
						System.out.print("Alas = ");
						panjang=scan.nextInt();
						System.out.print("Tinggi = ");
						lebar=scan.nextInt();
						luas=panjang*lebar/2;
						System.out.println("Luas Segitiga = "+luas);
					} else if (bentukbidang.equalsIgnoreCase("Lingkaran")) {
						System.out.print("Jari-jari = ");
						jari2=scan.nextInt();
						luas=Math.PI*Math.pow(jari2, 2);
						System.out.println("Luas Lingkaran = "+luas);
					}
		}
}
