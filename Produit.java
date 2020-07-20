package serie_exercices.Exercie1;

/**
 *
 * @author khaled
 */
//définition de la classe Produit :)
public class Produit {
    //les attributs de la classe produit :)
    private int codeproduit;
    private String libelleproduit;
    private char  categorieproduit;
    private double prixproduit;

    //constructeur paramétré de la classe produit :)
    public Produit(int codeproduit, String libelleproduit, char categorieproduit, double prixproduit) {
        this.codeproduit = codeproduit;
        this.libelleproduit = libelleproduit;
        this.categorieproduit = categorieproduit;
        this.prixproduit = prixproduit;
    }

    
    //les getters et setters des attributs de la classe produit :)
    public int getCodeproduit() {
        return codeproduit;
    }

    public void setCodeproduit(int codeproduit) {
        this.codeproduit = codeproduit;
    }

    public String getLibelleproduit() {
        return libelleproduit;
    }

    public void setLibelleproduit(String libelleproduit) {
        this.libelleproduit = libelleproduit;
    }

    public char getCategorieproduit() {
        return categorieproduit;
    }

    public void setCategorieproduit(char categorieproduit) {
                this.categorieproduit = categorieproduit;
    }

    public double getPrixproduit() {
        return prixproduit;
    }

    public void setPrixproduit(double prixproduit) {
        this.prixproduit = prixproduit;
    }
    
    //cette methode permet d'afficher un produit :)
    public void AfficherProd ()
    {
        System.out.println("le code de produit : " + this.codeproduit );
        System.out.println("description de produit : " + this.libelleproduit );
        System.out.println("la categorie de produit : " + this.categorieproduit );
        System.out.println("le prix de produit : " + this.prixproduit );

    }
    
}
