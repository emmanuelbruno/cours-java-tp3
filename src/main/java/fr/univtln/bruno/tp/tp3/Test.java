package fr.univtln.bruno.tp.tp3;

import fr.univtln.bruno.tp.tp2.animal.Animal;

import java.util.*;


public class Test {

    /**
     * @param args
     */
    public static void main(String[] args) {
        //Un ensemble d'animaux
        // Set animaux = new HashSet();
        Set<AnimalTatoue> animaux = new TreeSet<AnimalTatoue>();
        System.out.println(animaux.add(new AnimalTatoue("Canari", "Titi", Animal.Sexe.MALE)));
        System.out.println(animaux.add(new AnimalTatoue("Canidé", "Medor", Animal.Sexe.MALE)));

        // animaux.remove(new AnimalTatoue("Titi"));
        System.out.println(animaux.add(new AnimalTatoue("Canari", "Titi", Animal.Sexe.MALE)));

        System.out.println(animaux);

        //Parcours d'une collection avec un Iterateur
        Iterator<AnimalTatoue> itAnimaux = animaux.iterator();
        while (itAnimaux.hasNext())
            System.out.println(" #>"+itAnimaux.next());

        //et avec un foreach
        for (Object a : animaux)
            System.out.println(" >" + a);

        //Construction d'une liste à partir d'une autre collection
        List<AnimalTatoue> lAnimaux = new ArrayList<AnimalTatoue>(animaux);
        System.out.println(lAnimaux.add(new AnimalTatoue("Homme", "Albert", Animal.Sexe.MALE)));

        //Tri d'une liste
        System.out.println(lAnimaux);
        Collections.sort(lAnimaux);
        System.out.println(lAnimaux);

        //Génération d'une tableau à partir d'une collection
        AnimalTatoue[] tAnimaux = new AnimalTatoue[lAnimaux.size()];
        lAnimaux.toArray(tAnimaux);
        for (AnimalTatoue a : tAnimaux)
            System.out.print(a + " ");
        System.out.println();

        //Création d'une map d'animaux avec comme clé un tatouage
        //Map<Tatouage, AnimalTatoue> m = new HashMap<Tatouage, AnimalTatoue>();
        Map<Tatouage, AnimalTatoue> animalTatoueMap = new TreeMap<Tatouage, AnimalTatoue>();
        AnimalTatoue animalTatoue;
        animalTatoueMap.put((animalTatoue = new AnimalTatoue("Canidé", "Rex", Animal.Sexe.MALE)).getTatouage(), animalTatoue);
        animalTatoueMap.put((animalTatoue = new AnimalTatoue("Canidé", "Médor", Animal.Sexe.MALE)).getTatouage(), animalTatoue);
        animalTatoueMap.put((animalTatoue = new AnimalTatoue("Canari", "Titi", Animal.Sexe.FEMELLE)).getTatouage(), animalTatoue);
        System.out.println("Map: " + animalTatoueMap);

        MapAnimalTatoue maMapAnimalTatoue = new MapAnimalTatoue();
        maMapAnimalTatoue.put(new AnimalTatoue("Canidé", "Rex", Animal.Sexe.MALE));
        maMapAnimalTatoue.put(new AnimalTatoue("Canidé", "Médor", Animal.Sexe.MALE));
        maMapAnimalTatoue.put(new AnimalTatoue("Canari", "Titi", Animal.Sexe.FEMELLE));
        System.out.println("MaMap:" + animalTatoueMap);

        //Récupéraration de l'ensemble des clé
        System.out.println("clés de la map: " + animalTatoueMap.keySet());
        //Test de l'existence d'une clé
        System.out.println("Test existence de clé: " + animalTatoueMap.containsKey(new Tatouage("Canidé", 2)));
        //Accès à un élément d'une map via sa clé
        System.out.println("Recherche par clé: "+animalTatoueMap.get(new Tatouage("Canidé", 2)));
    }

}
