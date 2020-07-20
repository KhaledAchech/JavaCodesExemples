package serie_exercices.Exercice4;

import java.util.*;

/**
 *
 * @author khaled
 */

//définition de la classe Médiatheque :)
public class Mediatheque {
    
    //déclaration des attributs de la classe Médiateque :)
    private String nom;
    private Ouvrage tabouvrage[];
    private Adherent tabadherent[];
    private Emprunter tabemprunt[];
    private int nbouvrage = 0;
    private int nbadherent = 0;
    private int nbemprunt = 0;
    
    //constructeur paramétré de la classe Mediateque :)
    public Mediatheque(String nom, int nbouvrage, int nbadherent, int nbemprunt) {
        this.nom = nom;
        this.nbouvrage = nbouvrage;
        this.nbadherent = nbadherent;
        this.nbemprunt = nbemprunt;
        
        this.tabouvrage = new Ouvrage[100];
        this.tabadherent = new Adherent[100];
        this.tabemprunt = new Emprunter[100];
    }
    
    //cette méthode permet d'ajouter un Ouvrage à la Médiatheque :)
    public boolean AjouterOuvrage(Ouvrage o){
        boolean ouvrageajoute=false;
        if (this.nbouvrage < 100)
        {
            this.tabouvrage[this.nbouvrage+1]=o;
            ouvrageajoute=true;
            this.nbouvrage++;
            System.out.println("Ouvrage : " +o.getTitre() + " a été ajouté avec succès");
        }
        else
        {
            System.out.println("on atteint le maximum, l'ajout n'a pas pu etre conclu");
        }
        
        return ouvrageajoute;
    }
    
    //cette méthode permet d'ajouter un Adherent à la médiatheque :)
    public boolean AjouterAdherent(Adherent a){
        boolean adherentajoute=false;
        if (this.nbadherent < 100)
        {
            this.tabadherent[this.nbadherent+1]=a;
            adherentajoute=true;
            this.nbadherent++;
            System.out.println("L'adherent : " +a.getPrenom()+ " " + a.getNom()+" a été ajouté avec succès");
        }
        else
        {
            System.out.println("on atteint le maximum, l'ajout n'a pas pu etre conclu");
        }
        
        return adherentajoute;
    }
    
    //cette méthode permet d'ajouter un emprunt à la Médiatheque :)
    public boolean AjouterEmprunt(Emprunter e){
        boolean empruntajoute = false;
        if (this.nbemprunt < 100)
        {
            this.tabemprunt[this.nbemprunt+1]=e;
            empruntajoute=true;
            nbemprunt++;
            System.out.println("L'emprunt a été ajouté avec succès");
        }
        else
        {
            System.out.println("on atteint le maximum, l'ajout n'a pas pu etre conclu");
        }
        return empruntajoute;
    }
    
    //cette methode permet d'afficher la liste des adherents ayant au moins un livre emprunté :)
    public void ListeAdherentAyantEmprint()
    {
        ArrayList<Adherent> Listeadherent = new ArrayList<Adherent>();
        
        for (int i = 1 ; i <= this.nbadherent ; i++)
        {
            if (this.tabadherent[i].AunLivreEmprunte())
            {
                this.tabadherent[i].Affichage();
                Listeadherent.add(this.tabadherent[i]);
                
            }
        }
        
        System.out.println("la liste des adherents ayant au moins un livre emprunté :");
        for (Adherent A : Listeadherent) 
        {
            A.Affichage();
        }
    }
        //cette methode permet d'afficher la liste des adherents qu'on emprunté le livre dont le titre est passé en paramétre :)
    public void ListeAdherentAyantEmprint(String titre)
    {
         ArrayList<Adherent> Listeadherent = new ArrayList<Adherent>();
        for (int i = 1 ; i <= this.nbemprunt ; i++)
        {
            if (this.tabemprunt[i].getLivreemprunte().getTitre().equalsIgnoreCase(titre))
            {
                Listeadherent.add(this.tabemprunt[i].getAdherentquilemprunte());
            }
            
        }
        
        System.out.println("la liste des adherents ayant au moins un livre emprunté :");
        for (Adherent A : Listeadherent) 
        {
            A.Affichage();
        }
    }
 
    
}
