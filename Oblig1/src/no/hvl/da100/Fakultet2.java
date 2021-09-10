package no.hvl.da100;

import static java.lang.Integer.parseInt;
import static javax.swing.JOptionPane.showInputDialog;

public class Fakultet2 {

	public static void main(String[] args) {
		int heltall = parseInt(showInputDialog("Heltall: "));

		if (heltall <= 0) { // tar inn input dersom det er lik eller over 0
			heltall = parseInt(showInputDialog("Heltall: "));
		}
		// eks input 5!= 1 * 2 * 3 * 4 * 5 = 120
		int resultat = 1; // løkken som kjører for + 1 på input hver gang frem til den når inputmengden
		for (int fakultet = 2; fakultet <= heltall; fakultet++) { // når fakultet er mindre eller lik input blir det
																	// ganget og lagt til +1 for hver løkke
			resultat *= fakultet; // resultat blir oppdatert og ganget med fakultetet i hver løkke
		}
		System.out.println(heltall + "!" + " = " + resultat);
	}

}
