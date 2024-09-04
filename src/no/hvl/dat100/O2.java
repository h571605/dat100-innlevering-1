package no.hvl.dat100;

public class O2 {
	public static void main(String[] args) {
		double bruttoinntekt = 270001;
		double trinnskatten;
		
		if(bruttoinntekt >= 208051 && bruttoinntekt <= 292850 ) {
			trinnskatten = 0.017;
			System.out.println("Trinnskatt " + trinnskatten + " Betal " + trinnskatten * bruttoinntekt);;
		} else if(bruttoinntekt >= 292851 && bruttoinntekt <= 670000) {
			trinnskatten = 0.04;
			System.out.println("Trinnskatt " + trinnskatten + " Betal " + trinnskatten * bruttoinntekt);
		} else if(bruttoinntekt >= 670001 && bruttoinntekt <= 937900) {
			trinnskatten = 0.136;
			System.out.println("Trinnskatt " + trinnskatten + " Betal " + trinnskatten * bruttoinntekt);
		} else if(bruttoinntekt >= 937901 && bruttoinntekt <= 1350000) {
			trinnskatten = 0.166;
			System.out.println("Trinnskatt " + trinnskatten + " Betal " + trinnskatten * bruttoinntekt);
		} else if(bruttoinntekt > 1350000) {
			trinnskatten = 0.176;
			System.out.println("Trinnskatt " + trinnskatten + " Betal " + trinnskatten * bruttoinntekt);
		}
	}
}
