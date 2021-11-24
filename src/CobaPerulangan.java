import java.util.Scanner;

public class CobaPerulangan {

	public static void main(String[] args) {
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
			}
			count++;
		}
		System.out.println("Than You!");
	}

}
