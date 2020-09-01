package no.hvl.dat100;

import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

public class oppgave_6 {

public static void main(String[] args) {
		
		int tall1 = Integer.parseInt(showInputDialog("Skriv et tall:"));
		int result = 0;
		
		if (tall1 < 0 ) {
			showMessageDialog(null,"Dette tallet er ikke gylding");
		}
		else if (tall1 == 1 || tall1 == 0) {
			result = 1;
		}
		
		else {
			for (int i=tall1 ; i>=1 ; i--) {
				int tall2 = tall1;
				result = tall2 * (tall1 - 1);
			}
		}
		showMessageDialog(null, "Svaret er: " + result  );
	}
}
