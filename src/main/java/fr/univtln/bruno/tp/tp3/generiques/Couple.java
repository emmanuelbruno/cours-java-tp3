package fr.univtln.bruno.tp.tp3.generiques;

import fr.univtln.bruno.tp.tp2.animal.Animal;
import fr.univtln.bruno.tp.tp2.animal.mammifere.Homme;
import fr.univtln.bruno.tp.tp2.animal.oiseau.Aigle;

/**
 * The Class Couple. Cette classe ilustre la création d'une classe générique qui
 * permet de stocker des couples d'Objets qui spécialisent la classe animal.
 *
 * @param <T1> the generic type of element 1
 * @param <T2> the generic type of element 2
 */
public class Couple<T1 extends Animal, T2 extends Animal> {

    /**
     * The e1.
     */
    private T1 e1;

    /**
     * The e2.
     */
    private T2 e2;

    /**
     * Instantiates a new couple.
     *
     * @param e1 the e1
     * @param e2 the e2
     */
    public Couple(T1 e1, T2 e2) {
        super();
        this.e1 = e1;
        this.e2 = e2;
    }

    /**
     * The main method.
     *
     * @param args the arguments
     */
    public static void main(String[] args) {
        Couple<Homme, Aigle> c = new Couple<Homme, Aigle>(
                new Homme("Pierre", Animal.Sexe.MALE, 25),
                new Aigle("A1", Animal.Sexe.FEMELLE, 90));

        Aigle a = c.getE2();
        a.setEnvergure(100);
        Homme x = c.getE1();
        x.setDureeGestation(9);

        System.out.println(c);
    }

    /**
     * Gets the e1.
     *
     * @return the e1
     */
    public T1 getE1() {
        return e1;
    }

    /**
     * Sets the e1.
     *
     * @param e1 the e1 to set
     */
    public void setE1(T1 e1) {
        this.e1 = e1;
    }

    /**
     * Gets the e2.
     *
     * @return the e2
     */
    public T2 getE2() {
        return e2;
    }

    /**
     * Sets the e2.
     *
     * @param e2 the e2 to set
     */
    public void setE2(T2 e2) {
        this.e2 = e2;
    }

    @Override
    public String toString() {
        return "Couple{" +
                "e1=" + e1 +
                ", e2=" + e2 +
                '}';
    }

}
