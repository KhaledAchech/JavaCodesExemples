package serie_exercices.Exercie1;

/**
 *
 * @author khaled
 */
public class Testexercice1 {
    	public static void main(String[] args) {
                Produit produit1 = new Produit (001,"1er produit",'A',32.200);
                Produit produit2 = new Produit (002,"2eme produit",'B',2.200);
                Produit produit3 = new Produit (003,"3eme produit",'C',40.200);
                
                produit2.AfficherProd();
                
                Fournisseur fournisseur1 = new Fournisseur (001,"raisonsociale1","01001001");
                fournisseur1.AjouterProd(produit1);
                fournisseur1.AfficherFor();
                fournisseur1.AjouterProd(produit2);
                fournisseur1.AjouterProd(produit3);
                fournisseur1.AfficherFor();

                fournisseur1.ClassificationProd();
                
            
            
        }
}
