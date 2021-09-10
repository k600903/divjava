package no.hvl.da100;

import static java.lang.Integer.parseInt;
import static javax.swing.JOptionPane.showInputDialog;
import static java.lang.Math.*;

public class Nfakultet {

	 // eks fakultet: 4! = 4 * 3 * 2 * 1 = 24
	public static void main(String[] args) {
		int n = parseInt(showInputDialog("Heltall: "));
		
		
		if (n <=0) {
			
		}
		int resultat = 1;
		for (int f = 2; f <= n; f++) {
			resultat *=f;
		}
	}
}