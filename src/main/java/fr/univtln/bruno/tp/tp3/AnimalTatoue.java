package fr.univtln.bruno.tp.tp3;


import fr.univtln.bruno.coursjava.tp.tp2.animal.Animal;

/**
 * The Class AnimalTatoue. Cette classe illustre la redefinition de equal, hashcode,
 * toString et l'implantation de la classe Comparable quand des instances d'une
 * classe doivent être insérée dans une collection (table de hachage ou
 * structure triée).
 */
public class AnimalTatoue extends Animal implements Comparable<AnimalTatoue> {

    private final Tatouage tatouage;

    public AnimalTatoue(String espece, String nom, Sexe sexe) {
        this(new Tatouage(espece), nom, sexe);
    }

    public AnimalTatoue(Tatouage tatouage, String nom, Sexe sexe) {
        super(nom, sexe);
        this.tatouage = tatouage;
    }

    @Override
    public String getMoyenExpression() {
        return null;
    }

    @Override
    public int hashCode() {
        return tatouage.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return tatouage.equals(obj);
    }

    @Override
    public int compareTo(AnimalTatoue o) {
        return tatouage.compareTo(o.getTatouage());
    }

    public Tatouage getTatouage() {
        return tatouage;
    }

    @Override
    public String toString() {
        return getNom() + " (" + getTatouage().getEspece() + getTatouage().getId() + ")";
    }
}
