import java.util.Scanner;

public class RumusPytaghoras {
	
	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		int b,c,a;
		System.out.print("Masukan Nilai B :");
		b=input.nextInt();
		System.out.print("Masukan Nilai C :");
		c=input.nextInt();
		a=(int)Math.sqrt(Math.pow(b, 2)+Math.pow(c, 2));
		System.out.println("Hasil Nilai A :"+a);
		double data_a=a;
		System.out.println("Promotion to double : "+data_a);
		char data_a1= (char) data_a;
		System.out.println("Sackled to char :"+data_a1);
	}
}
