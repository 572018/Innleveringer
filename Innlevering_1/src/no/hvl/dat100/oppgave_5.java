package no.hvl.dat100;

import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

public class oppgave_5 {

public static void main(String[] args) {
		
		int karakter_A = 90;
		int karakter_B = 80;
		int karakter_C = 60;
		int karakter_D = 50;
		int karakter_E = 40;
		int karakter_F = 0;
	
	for (int i=0;i<10;i++) {	
		int karakter = Integer.parseInt(showInputDialog("Hvor mange poeng fikk du?"));
		
		if (karakter >= karakter_A && karakter <= 100) {
			showMessageDialog(null, "Karakter A");
		}
		else if (karakter >= karakter_B && karakter < karakter_A) {
			showMessageDialog(null, "Karakter B");
		}
		else if (karakter >= karakter_C && karakter < karakter_B) {
			showMessageDialog(null, "Karakter C");
		}
		else if (karakter >= karakter_D && karakter < karakter_C) {
			showMessageDialog(null, "Karakter D");
		}
		else if (karakter >= karakter_E && karakter < karakter_D) {
			showMessageDialog(null, "Karakter E");
			
		}
		else if (karakter >= karakter_F && karakter < karakter_E) {
			showMessageDialog(null, "Karakter F");
		}
		else {
			showMessageDialog(null, "Dette er ikke en gyldig poengsum");
			i--;
		}
		
	}

	}
}
