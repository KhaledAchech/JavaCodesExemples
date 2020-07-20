package serie_exercices.Exercice4;

/**
 *
 * @author khaled
 */
//définition de la classe ouvrage :)
public class Ouvrage {
    
    //déclaration des attributs de la classe Ouvrage :)
    private String auteur;
    private String titre;
    private int nbexemplaire;

    //constructeur paramétré de la classe Ouvrage :)
    public Ouvrage(String auteur, String titre, int nbexemplaire) {
        this.auteur = auteur;
        this.titre = titre;
        this.nbexemplaire = nbexemplaire;
    }
    
    //les getters et setters des différents attributs de la classe Ouvrage :)
    public String getAuteur() {
        return auteur;
    }

    public void setAuteur(String auteur) {
        this.auteur = auteur;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public int getNbexemplaire() {
        return nbexemplaire;
    }

    public void setNbexemplaire(int nbexemplaire) {
        this.nbexemplaire = nbexemplaire;
    }
    
    public void Affichage ()
    {
    System.out.println(String.format("%s", "---------------------------------------------------------------------------------------------------------------------"));
    System.out.println(String.format("%30s %20s %30s %20s %10s", "Auteur", "|", "Titre", "|", "nbexemplaire"));
    System.out.println(String.format("%s", "---------------------------------------------------------------------------------------------------------------------"));
    System.out.println(String.format("%30s %20s %30s %20s %10s", this.getAuteur(), "|", this.getTitre(), "|", this.getNbexemplaire()));
    }
    
}
