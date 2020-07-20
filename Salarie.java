package serie_exercices.Exercice2;

/**
 *
 * @author khaled
 */
// definition de la classe Salarie :)
public class Salarie implements Comparable<Salarie>{
    //declaration des attributs de la classe salarie :)
    private int cin;
    private String nom;
    private String prenom;
    private double salairedebase;
    private int nbreheuresup;
    private double prixheuresup;

    //constructeur sans parametre de la classe salarie pour des raisons de test :)
    public Salarie() {
    }
    
    //constructeur parametré de la classe salarie :)
    public Salarie(int cin, String nom, String prenom, double salairedebase, int nbreheuresup, double prixheuresup) {
        this.cin = cin;
        this.nom = nom;
        this.prenom = prenom;
        this.salairedebase = salairedebase;
        this.nbreheuresup = nbreheuresup;
        this.prixheuresup = prixheuresup;
    }
 
    //getters et setters des attributs de la classe salarie :)
       
    public double getPrixheuresup() {
        return prixheuresup;
    }

    public void setPrixheuresup(double prixheuresup) {
        this.prixheuresup = prixheuresup;
    }

    public int getCin() {
        return cin;
    }

    public void setCin(int cin) {
        this.cin = cin;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public double getSalairedebase() {
        return salairedebase;
    }

    public void setSalairedebase(double salairedebase) {
        this.salairedebase = salairedebase;
    }

    public int getNbreheuresup() {
        return nbreheuresup;
    }

    public void setNbreheuresup(int nbreheuresup) {
        this.nbreheuresup = nbreheuresup;
    }
    
    //cette methode permet d'afficher un salarie :)
    public void Affichersalarie ()
    {
        System.out.println("le cin de ce salarie est  : " + this.cin );
        System.out.println("le nom de ce salarie est  : " + this.prenom + " " + this.prenom );
        System.out.println("son salaire de base : : " + this.salairedebase );
        System.out.println("les nombre d'heures supplementaires : " + this.nbreheuresup );

    }
    
    //cette methode permet de calculer le salaire brut un salarie :)
    public double calculSalaire()
    {
        return this.salairedebase +(this.prixheuresup*this.nbreheuresup);
    }

    //trions les salariés selon leurs CIN :)
    @Override
    public int compareTo(Salarie s) {
        //retroune un entier négative, zéro ou positive si "CIN"
        //de ce salarié est moins que, égale à ou supérieur à l'objet comparé avec :)
        return this.getCin() - s.getCin();
    }
    
}
