package fr.univtln.bruno.tp.tp3.exDuCours;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.TreeMap;


/**
 * The Class SimpleCollection. Cette classe illustre l'utilisation des
 * collections de base.
 */
public class SimpleCollection {

	/**
	 * The main method.
	 * 
	 * @param args
	 *            the arguments
	 */
	public static void main(String[] args) {
		//Declaration d'une liste 
		//instanciée comme un tableau dynamique
		List<Personne> l = new ArrayList<Personne>();

		//Ajout de trois personnes.
		Personne p1 = new Personne(1, "Durand", "Pierre", 1950);
		Personne p2 = new Personne(3, "Dupond", "Pierre", 1950);
		Personne p3 = new Personne(2, "Georges", "Marc", 1950);

		l.add(p1);
		l.add(p2);
		l.add(p3);

		//Affichage de la liste en utilisant son toString()
		System.out.println(l);

		//Tri de la liste via la classe Collections
		Collections.sort(l);

		System.out.println(l);

		//Parcours classique d'une liste 
		int i = 0;
		while (i < l.size())
			System.out.println(l.get(i++).getNom());

		
		//Parcours d'une liste avec le foreach de Java5
		for (Personne p : l)
			System.out.println(p.getId());


		//Declaration d'un iterateur pour parcourir la liste
		ListIterator<Personne> it = l.listIterator();
		
		//Déclaration d'une map de Personnes dont la clé est une String
		// Map<String, Personne> m = new HashMap<String, Personne>();
		Map<String, Personne> m = new TreeMap<String, Personne>();

		//Parcours de la liste avec un Iterateur pour remplir la map	
		//avec comme clé la contacténation de son nom et de son prénom
		while (it.hasNext()) {
			Personne p = it.next();
			m.put(p.getNom() + p.getPrenom(), p);
		}

		//Affichage de la map
		System.out.println(m);

		//Accès à une valeur de la map via sa clé.
		System.out.println(m.get("DupondPierre").getNom());

	}

}
