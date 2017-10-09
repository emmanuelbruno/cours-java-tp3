package fr.univtln.bruno.tp.tp3;

import com.google.common.collect.HashMultiset;
import com.google.common.collect.Multiset;

/**
 * The Class Tatouage. Cette classe sert de clé pour stocker dans Animaux
 * dans une map
 */
public class Tatouage implements Comparable<Tatouage> {
    private static Multiset<String> especesId = HashMultiset.create();

    /**
     * The espece.
     */
    private final String espece;

    /**
     * The id.
     */
    private final int id;

    public Tatouage(String espece, int id) {
        this.espece = espece;
        this.id = id;
    }

    /**
     * Instantiates a new tatouage.
     *
     * @param espece the espece
     */
    public Tatouage(String espece) {
        this.espece = espece;
        especesId.add(espece);
        this.id = especesId.count(espece);
    }

    /* (non-Javadoc)
     * @see java.lang.Comparable#compareTo(java.lang.Object)
     */
    @Override
    public int compareTo(Tatouage arg0) {
        int result;
        if ((result = espece.compareTo(arg0.espece)) == 0)
            result = id - arg0.id;

        return result;
    }

    /*
     * (non-Javadoc)
     *
     * @see java.lang.Object#equals(java.lang.Object)
     */
    @Override
    public boolean equals(Object arg0) {
        if (arg0 instanceof Tatouage) {
            Tatouage t2 = (Tatouage) arg0;
            return espece.equals(t2.espece) && id == t2.id;
        } else
            return super.equals(arg0);
    }

    /**
     * Gets the espece.
     *
     * @return the espece
     */
    public String getEspece() {
        return espece;
    }

    /**
     * Gets the id.
     *
     * @return the id
     */
    public int getId() {
        return id;
    }

    /*
     * (non-Javadoc)
     *
     * @see java.lang.Object#hashCode()
     */
    @Override
    public int hashCode() {
        return (espece + id).hashCode();
    }

    /*
     * (non-Javadoc)
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return "Tatouage [espece=" + espece + ", id=" + id + "]";
    }

}
