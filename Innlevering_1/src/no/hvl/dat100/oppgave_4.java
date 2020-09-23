package no.hvl.dat100;

import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

public class oppgave_4 {

public static void main(String[] args) {
		
		int brutto = Integer.parseInt(showInputDialog("Hva er bruttoinntekten?"));
		
		int trinn1 = 164101;
		int trinn2 = 230951;
		int trinn3 = 580651;
		int trinn4 = 934051;
		
		if (brutto > trinn4) {
			double skatt = brutto * (double) 0.1452;	
			showMessageDialog(null, "Skattetrinn 4. Inntekten din er " + brutto + " Kr" + " og skatten er " + skatt + " Kr");
		}
		else if (brutto > trinn3 ) {
			double skatt = brutto * (double) 0.1152;
			showMessageDialog(null, "Skattetrinn 3. Inntekten din er " + brutto + " Kr" + " og skatten er " + skatt + " Kr");
		}
		else if (brutto > trinn2 ) {
			double skatt = brutto * (double) 0.0241;
			showMessageDialog(null, "Skattetrinn 2. Inntekten din er " + brutto  + " Kr" + " og skatten er " + skatt + " Kr");
		}
		else if (brutto > trinn1 ) {
			double skatt = brutto * (double) 0.0093;
			showMessageDialog(null, "Skattetrinn 1. Inntekten din er " + brutto + " Kr" + " og skatten er " + skatt + " Kr");
		}
		else {
			showMessageDialog(null, "Skattetrinn 0 som gir ingen skatt. Inntekten din er " + brutto + " Kr");
		}
	}
}


