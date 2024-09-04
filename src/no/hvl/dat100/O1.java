package no.hvl.dat100;

import static java.lang.Integer.parseInt;
import static javax.swing.JOptionPane.showInputDialog;

public class O1 {
	public static void main(String[] args) {
		//a. b. c.
		int poengsum = 110;
		int[] poengsummer = {22, 32, 55, 11, -99, 54, 33, 55, 38, 78};
		
		for (int i = 0; i < poengsummer.length; i++) {
			
			if(poengsummer[i] >= 0 && poengsummer[i] <= 39) {
				System.out.println("F");
			}else if (poengsummer[i] >= 40 && poengsummer[i] <= 49) {
				System.out.println("E");
			}else if (poengsummer[i] >= 50 && poengsummer[i] <= 59) {
				System.out.println("D");
			}else if (poengsummer[i] >= 60 && poengsummer[i] <= 79) {
				System.out.println("C");
			}else if (poengsummer[i] >= 80 && poengsummer[i] <= 89) {
				System.out.println("B");
			}else if (poengsummer[i] >= 90 && poengsummer[i] <= 100) {
				System.out.println("A");
			}else {
				String tallTxt = showInputDialog("Ugyldig poengsum, Gi et ny poengsum for poengsum nr " + (i + 1) + ":");
				int tall = parseInt(tallTxt);
				poengsummer[i] = tall;
				i = i -1;
			}
		}
		
	}
}
