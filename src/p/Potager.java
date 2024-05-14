package p;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

import UUU.Utilitaires;
import m.Aliment;
import m.Carotte;
import m.Pdt;
import m.Poireau;
import m.Pomme;

public class Potager {

	//A la bonne place?
	HashMap<Aliment, Integer> gardeManger = new HashMap<Aliment, Integer>();
	ArrayList<Aliment> potager = new ArrayList<Aliment>();
	float argentDisponible = 10;
	
	
	
	
	public void cestparti() {
		
		System.out.println("Bonjour");
		System.out.println("Bienvenue dans votre potager!");
		
		/*System.out.println("Souhaitez vous restaurer une sauvegarde?");
		
		if(Utilitaires.readString().equals("oui")) {
			//TODO
			//Lecture d'un fichier txt contenant les informations normalisés du potager
			Utilitaires.restaurationData();
		}*/
		
		boolean appliOn = true;
		
		do {
			//a la bonne place???
			System.out.println("Choix :");
			System.out.println("1 Planter");
			System.out.println("2 Etat du potager");
			System.out.println("3 Recolter");
			System.out.println("4 Vendre au marché");
			System.out.println("5 Sauvegarder");
			System.out.println("6 Exit");

			int i = Utilitaires.readInt();
			
			switch (i) {
			case 1:
				System.out.println("Que voulez-vous planter?"
						+ " 1 Pdt, 2 Carotte, 3 Poireau, 4 Pomme");
				int j = Utilitaires.readInt();
				
				

				//TO DO
				//Gestion saisie utilisateur : ajout d'un des fruits/legumes saisie dans le potager
				//On plante une unité.
				
				planter(j);
				break;
			case 2:
				Utilitaires.printPotager(potager);
				pousseAliment();
				break;
			case 3:
				System.out.print("Quel fruit ou legume voulez vous recolter?");
				int jj = Utilitaires.readInt();

				//TO DO
				//On peut recolter l'un des fruits/legumes à maturité (ni trop tôt, ni trop tard)
				recolter();
				
				break;
			case 4 : 
				System.out.println("Vente au marché");
				//TO DO
				//Quel fruit/legume vendre ?
				break;
			
			case 5:
				System.out.println("Sauvegarde dans un fichier");
				//TO DO
				//On sauvegarde ce qui est dans le potager, ainsi que l'argent courant
				break;
			case 6:
				appliOn = false;
				break;
			default:
				;
			}
		}
		
		//TO DO
		//ajout : la pousse de chaque fruit/legume du potager 
		//(il faut qu'à chaque action, tous les fruits et légumes poussent)
		//les fruits et légumes trop mûr sont perdus et retirés du potager
		
		
		while(appliOn);
	}
	
	public void planter(int j) {
		switch(j) {
		case 1:
			Aliment pdt = new Pdt();
			potager.add(pdt);
			break;
		case 2:
			Aliment carotte = new Carotte();
			potager.add(carotte);
			break;
		case 3:
			Aliment poireau = new Poireau();
			potager.add(poireau);
			break;
		case 4:
			Aliment pomme = new Pomme();
			potager.add(pomme);
			break;
		default:
			;
		}
	}
	
	public void pousseAliment() {
		;
		for(Aliment aliment : potager) {
			int a = aliment.getMomentPousse() + 1;
			aliment.setMomentPousse(a);
//			if(aliment.getDureePousse() < aliment.getMomentPousse()) {
//				potager.remove(aliment);
//			}
		}
	}
	
	public void recolter() {
		for(Aliment aliment : potager) {
			for (int i = 0; i < potager.size(); i++) {
				if(aliment.getDureePousse() == aliment.getMomentPousse()) {
					gardeManger.put(aliment, i);
//					potager.remove(aliment);
				}
			}
			
		}
		System.out.println(gardeManger);
	}


}
