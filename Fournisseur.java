package serie_exercices.Exercie1;

import java.util.*;

/**
 *
 * @author khaled
 */
//définition de la classe Fournisseur :)
public class Fournisseur {
    //les attributs de la classe Fournisseur :)
    private int codefournisseur;
    private String raisonsocialefournisseur;
    private String numerotelephonefournisseur;
    private List<Produit> Listeproduits;
    
    //constructeur paramétré de la classe Fournisseur :)    
    public Fournisseur(int codefournisseur, String raisonsocialefournisseur, String numerotelephonefournisseur) {
        this.Listeproduits = new ArrayList<Produit>(34);
        this.codefournisseur = codefournisseur;
        this.raisonsocialefournisseur = raisonsocialefournisseur;
        this.numerotelephonefournisseur = numerotelephonefournisseur; 
    }
    
    //les getters et setters des attributs de la classe Fournisseur :)
    public int getCodefournisseur() {
        return codefournisseur;
    }

    public void setCodefournisseur(int codefournisseur) {
        this.codefournisseur = codefournisseur;
    }

    public String getRaisonsocialefournisseur() {
        return raisonsocialefournisseur;
    }

    public void setRaisonsocialefournisseur(String raisonsocialefournisseur) {
        this.raisonsocialefournisseur = raisonsocialefournisseur;
    }

    public String getNumerotelephonefournisseur() {
        return numerotelephonefournisseur;
    }

    public void setNumerotelephonefournisseur(String numerotelephonefournisseur) {
        this.numerotelephonefournisseur = numerotelephonefournisseur;
    }

    public List<Produit> getListeproduits() {
        return Listeproduits;
    }

    public void setListeproduits(List<Produit> Listeproduits) {
        this.Listeproduits = Listeproduits;
    }

   
    
    //cette methode permet d'afficher le code d'un fournisseur et les produits qu'il fournis :)
    public void AfficherFor(){
        
        System.out.println("le code de fournisseur : " + this.codefournisseur );
        System.out.println("le nombre de produits de ce fournisseur : " + this.Listeproduits.size());

    }
    
    //cette methode permet d'ajouter un produit a la liste des produits d'un fournisseur :)
    public void AjouterProd(Produit nouveauproduit)
    {
        if (this.Listeproduits.size()<35)//35 le nombre maximum autoriser des produits par fournisseur
        {
            this.Listeproduits.add(nouveauproduit);
        }
        else
        {
            System.out.println("ce fournisseur a atteint le maximum des produits");
        }
    }
    
     //cette methode permet de classifier les produits d'un fournisseurs selon les catégories dans des tableaux :)
    public void ClassificationProd()
    {
        Produit[] TabCategorieA = new Produit[34];
        Produit TabCategorieB [] = null;
        Produit TabCategorieC [] = null;
        int indiceA=0;
        int indiceB=0;
        int indiceC=0; 
        Produit p1 = new Produit (0,"test",'C',45);
          for(int i = 0; i < Listeproduits.size(); i++)
    {

            if (Listeproduits.get(i).getCategorieproduit()=='A')
            {
                TabCategorieA[indiceA]=Listeproduits.get(i);
                indiceA++;
                System.out.println("le produit : "+Listeproduits.get(i).getCodeproduit() + " a ete ajouter a la tableau de categorie A");
            }
            if (Listeproduits.get(i).getCategorieproduit()=='B')
            {
                TabCategorieA[indiceB]=Listeproduits.get(i);
                indiceB++;
                System.out.println("le produit : "+Listeproduits.get(i).getCodeproduit() + " a ete ajouter a la tableau de categorie B");
            }
            if (Listeproduits.get(i).getCategorieproduit()=='C')
            {
                TabCategorieA[indiceC]=Listeproduits.get(i);
                indiceC++;
                System.out.println("le produit : "+Listeproduits.get(i).getCodeproduit() + " a ete ajouter a la tableau de categorie C");
            }
    }               
        
       
    }
    
}
