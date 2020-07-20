package serie_exercices.Exercice4;

/**
 *
 * @author khaled
 */

//déclaration de la classe Disque :)
public class Disque extends Ouvrage {
    
    //déclaration des attributs de la classe Disque :)
    private String editeur;

    //constructeur paramétré de la classe Disque :)
    public Disque(String auteur, String titre, int nbexemplaire, String editeur) {
        super(auteur, titre, nbexemplaire);
        this.editeur = editeur;
    }

    // les getters et setters de la classe Disque :)
    public String getEditeur() {
        return editeur;
    }

    public void setEditeur(String editeur) {
        this.editeur = editeur;
    }
    
     //cette methode permet d'afficher la description d'un Disque :)
    @Override
     public void Affichage(){
    System.out.println(String.format("%s", "-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------"));
    System.out.println(String.format("%30s %20s %30s %20s %15s %20s %15s", "Auteur", "|", "Titre", "|", "nbexemplaire","|","editeur"));
    System.out.println(String.format("%s", "-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------"));
    System.out.println(String.format("%30s %20s %30s %20s %15s %20s %15s", this.getAuteur(), "|", this.getTitre(), "|", this.getNbexemplaire(), "|",this.getEditeur()));
    }
    
}
