package no.hvl.da100;

import static java.lang.Integer.parseInt;
import static javax.swing.JOptionPane.showInputDialog;

public class Karakterskala {

	public static void main(String[] args) {
		final int N = 10;

		for (int antallInput = 1; antallInput <= N; antallInput++) { // avsluttes etter 10 input
			int karakter = parseInt(showInputDialog("Poengsum: "));

			while (karakter > 100 || karakter < 0) { // kjøres om poengsumen er ugyldig
				karakter = parseInt(showInputDialog("Ugyldig poengsum, prøv igjen!")); 																						
			}
			
			if (karakter >= 0 && karakter <= 39) {
				System.out.println("F");
			} else if (karakter >= 40 && karakter <= 49) { // 40 eller høyere og 49 eller mindre for E
				System.out.println("E");
			} else if (karakter >= 50 && karakter <= 59) { // 50 eller høyere og 59 eller mindre for D
				System.out.println("D");
			} else if (karakter >= 60 && karakter <= 79) { // 60 eller høyere og 79 eller mindre for C
				System.out.println("C");
			} else if (karakter >= 80 && karakter <= 89) { //
				System.out.println("B");
			} else if (karakter >= 90 && karakter <= 100) {
				System.out.println("A"); // 
			}
		}
	}
}