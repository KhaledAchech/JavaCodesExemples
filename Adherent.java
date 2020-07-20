package serie_exercices.Exercice4;

/**
 *
 * @author khaled
 */
//définition de la classe Adherent :)
public class Adherent {
    
    //déclaration des attributs de la classe Adherent :)
    private String nom;
    private String prenom;
    private int nbempruntsencours;
    private int nbempruntautorises;

    //constructeur paramétré de la classe Adherent :)
    public Adherent(String nom, String prenom) {
        this.nom = nom;
        this.prenom = prenom;
        this.nbempruntsencours=0;
        this.nbempruntautorises = 3;
    }
    
    //les getters et setters des attributs de la classe Adherent :)
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

    public int getNbempruntsencours() {
        return nbempruntsencours;
    }

    public void setNbempruntsencours(int nbempruntsencours) {
        this.nbempruntsencours = nbempruntsencours;
    }

    public int getNbempruntautorises() {
        return nbempruntautorises;
    }

    public void setNbempruntautorises(int nbempruntautorises) {
        this.nbempruntautorises = nbempruntautorises;
    }
    
    //cette methode permet d'indiqué si l'Adherent a au moins un livre emprunté :)
    public boolean AunLivreEmprunte ()
    {
        boolean aunlivreemprunte = this.nbempruntsencours > 0;
        return aunlivreemprunte;
    }
    
    //cette methode permet de déterminer si il est encore possible d'emprunté un livre :)
    public boolean PeutEmprunter (){
        
        boolean peutemprunter = false ; 
        if (this.nbempruntsencours < this.nbempruntautorises)
        {
            peutemprunter = true ; 
        }    
        return peutemprunter;
    }
    
    //cette methode affiche les données d'un Adherent :)
    public void Affichage()
    {
        System.out.println("***********Adhérent***********");
        System.out.println("Prenom : " + this.getPrenom()+ " Nom : " + this.getNom());
    }
    
    //cette methode permet d'un emprunter un Livre par un Adherent si c'est possible :)
    public void Emprunter (){
        if (PeutEmprunter())
        {
            this.nbempruntsencours++;
            System.out.println("l'emprunt de livre  est fait avec succès");
        }
        else
        {
            System.out.println("Malheuresement, on a plus d'exemplaires de ce livre ");
        }
    }
    
    //cette methode permert de rendre un Livre :)
    public void Rendre(){
        if (AunLivreEmprunte())
        {
           this.nbempruntsencours--;
            System.out.println("le livre a été rendu avec succès");
        }
        else
        {
            System.out.println("impossible d'executé l'opération, l'adhérent concerné n'aucun emprunt en cours");
        }
    }
}
