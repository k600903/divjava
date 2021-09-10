package no.hvl.da100;

import static java.lang.Integer.parseInt;
import static javax.swing.JOptionPane.showInputDialog;

public class Trinnskatt {

	public static void main(String[] args) {
		int lonn = parseInt(showInputDialog("Bruttolønn:"));

		// deler de forskjellige med 100 for å få riktig prosent
		double sats0 = 0; // brukes ikke
		double sats1 = 0.0093;
		double sats2 = 0.0241;
		double sats3 = 0.1152;
		double sats4 = 0.1452;

		if (lonn >= 0 && lonn <= 164100) { // om lønnen er over 0 og under eller 164 100
			System.out.println("Din trinnskatt er: " + lonn); // unngår i gange med sats0 (0), så skriver bare ut input igjen
		} else if (lonn >= 164101 && lonn <= 230950) { // sats 1
			System.out.println("Din trinnskatt er:" +  (lonn * sats1));
		} else if (lonn >= 230951 && lonn <= 580650) { // sats 2
			System.out.println("Din trinnskatt er: " + (lonn * sats2));
		} else if (lonn >= 580651 && lonn <= 934050) { // sats 3
			System.out.println("Din trinnskatt er: " + (lonn * sats3));
		} else if (lonn >= 934051) { // sats 4
			System.out.println("Din trinnskatt er: " + (lonn * sats4));
		}
	}
}
