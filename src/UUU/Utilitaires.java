package UUU;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;

import m.Aliment;

import java.util.Scanner;

public class Utilitaires {

	public static int readInt() {
		Scanner sc = new Scanner(System.in);
		int i = 0;
		try {
			i = sc.nextInt();
		} catch (Exception e) {
		}
		return i;
	}

	public static void printHashMap(HashMap<Aliment, Integer> gardeManger) {

	}

	// le truc qui print le potager doit indiquer par une lettre minuscule
	// ce qui n'est pas mûr, et par une majuscule ce qui est prêt à être recolté
	// donc, pas ce qui est en dessous!
	public static void printPotager(ArrayList<Aliment> potager) {
		
		for (Aliment aliment : potager) {
			System.out.println(aliment.toString());
		}
//
//		String[] tabPotager = new String[10];
//		for (int i = 0; i < tabPotager.length; i++) {
//
//			for (Aliment aliment : potager) {
//				String s = aliment.toString();
//				if (aliment.getMomentPousse() == 5) {
//					s.toUpperCase();
//					tabPotager[i] = s;
//				}
//				else {
//					s.toLowerCase();
//					tabPotager[i] = s;
//				}
//			}
//
//			System.out.println(tabPotager);
//		}
		
		
	}

}
