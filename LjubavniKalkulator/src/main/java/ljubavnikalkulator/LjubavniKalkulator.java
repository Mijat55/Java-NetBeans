/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ljubavnikalkulator;

import java.util.Arrays;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Marko
 */
 public class LjubavniKalkulator {
     public static void main(String[] args) {
         new LjubavniKalkulatorCode().setVisible(true);
		String ime1 = ("Unesi prvo ime");
		String ime2 = ("Unesi drugo ime");
		String rezultat = "";
		for (int i : ljubav(brojeviPonavljanja(ime1, ime2))) {
			rezultat += i;
		}

		System.out.println(ime1 + " i " + ime2 + " se vole " + rezultat + "%");

	}

	public static int[] brojeviPonavljanja(String ime1, String ime2) {

		String zajedno = ime1.toLowerCase() + ime2.toLowerCase();
		int brojac = 0;
		int[] brojevi = new int[zajedno.length()];
		char[] imena = (zajedno.toCharArray());

		System.out.println(Arrays.toString(imena));

		for (int i = 0; i < zajedno.length(); i++) {
			brojac = 0;
			for (int j = 0; j < zajedno.length(); j++) {
				if (zajedno.charAt(i) == zajedno.charAt(j)) {

					brojac++;
				}
			}
			brojevi[i] = brojac;

		}

//		for (int i = 0; i < zajedno.length(); i++) {
//			System.out.print(" " + zajedno.charAt(i) + " ");
//		}

		brojevi = rasclaniBroj(brojevi);

		System.out.println(Arrays.toString(brojevi));

		if (ime1.length() >= ime2.length()) {
			int[] meduNiz = new int[ime1.length()];
			for (int i = 0; i < ime1.length(); i++) {
				if (i >= ime2.length()) {
					meduNiz[i] = brojevi[brojevi.length - (i + 1)];
				} else {
					meduNiz[i] = brojevi[i] + brojevi[brojevi.length - (1 + i)];
				}
			}

			return rasclaniBroj(meduNiz);
		} else {
			int[] meduNiz = new int[ime2.length()];
			for (int i = 0; i < ime2.length(); i++) {
				if (i >= ime1.length()) {
					meduNiz[i] = brojevi[brojevi.length - (1 + i)];
				} else {
					meduNiz[i] = brojevi[i] + brojevi[brojevi.length - (1 + i)];
				}
			}
			return rasclaniBroj(meduNiz);
		}

	}

	public static int[] ljubav(int[] niz) {

		System.out.println(Arrays.toString(niz));

		if (niz.length <= 2) {
			return niz;
		} else {
			if (niz.length % 2 == 0) {
				int[] pomocniNiz = new int[niz.length / 2];
				for (int i = 0; i < pomocniNiz.length; i++) {
					pomocniNiz[i] = niz[i] + niz[niz.length - (1 + i)];
				}
				pomocniNiz = rasclaniBroj(pomocniNiz);

				if (pomocniNiz.length > 2) {
					return ljubav(pomocniNiz);
				} else {
					return ljubav(pomocniNiz);
				}
			} else {
				int[] pomocniNiz = new int[(niz.length / 2) + 1];
				for (int i = 0; i < pomocniNiz.length; i++) {
					if (i == pomocniNiz.length - 1) {
						pomocniNiz[i] = 0 + niz[niz.length - (1 + i)];
					} else {
						pomocniNiz[i] = niz[i] + niz[niz.length - (1 + i)];
					}
				}

				if (pomocniNiz.length > 2) {
					return ljubav(rasclaniBroj(pomocniNiz));
				} else {
					return ljubav(rasclaniBroj(pomocniNiz));
				}
			}
		}

	}

	public static int[] rasclaniBroj(int[] niz) {
		int brojac = 0;
		for (int i : niz) {
			if (i >= 10) {
				brojac++;
			}
		}
		int[] pomocniNiz = new int[niz.length + brojac];

		for (int i = 0, j = 0; i < niz.length; i++) {
			if (niz[i] < 10) {
				pomocniNiz[j++] = niz[i];
			} else {
				pomocniNiz[j++] = (niz[i] / 10);
				pomocniNiz[j++] = (niz[i] % 10);
			}
		}

		return pomocniNiz;

                
                
               
	}
        
 }

         
