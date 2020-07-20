package serie_exercices.Exercice2;

/**
 *
 * @author khaled
 */
public class Testexercice2 {
    public static void main(String[] args) {
        Salarie salarie1 = new Salarie(12345601, "nomsalarie1", "prenomsalarie1", 1100, 3, 30);
        Salarie salarie2 = new Salarie(12345602, "nomsalarie2", "prenomsalarie2", 2200, 2, 50);
        Salarie salarie3 = new Salarie(66345603, "nomsalarie3", "prenomsalarie3", 3300, 1, 10);
        Salarie salarie4 = new Salarie(42345603, "nomsalarie4", "prenomsalarie4", 1500, 5, 100);
        salarie1.Affichersalarie();
        System.out.println(salarie1.calculSalaire());
        System.out.println("--------------------------------------------------------------------");
        salarie2.Affichersalarie();
        System.out.println(salarie2.calculSalaire());
        System.out.println("--------------------------------------------------------------------");
        
        Entreprise entreprise1 = new Entreprise ("adresse entreprise 1", "Raison sociale entreprise1 ", "Raison commercial entreprise1 ", 50 );
        entreprise1.Afficherentreprise();
        System.out.println("--------------------------------------------------------------------");
        entreprise1.AjoutSalarie(salarie1);
        entreprise1.AjoutSalarie(salarie2);
        entreprise1.AjoutSalarie(salarie3);
        entreprise1.AjoutSalarie(salarie4);
        entreprise1.Afficherentreprise();
        
        System.out.println("--------------------------------------------------------------------");
        entreprise1.TriEnt();
        System.out.println(entreprise1.SommeSalaireBrut());
        System.out.println("la position de salarie recherché est : " + entreprise1.RechercheSal(salarie3));
        entreprise1.Afficherentreprise();
        System.out.println("--------------------------------------------------------------------");
        entreprise1.SuppSal(salarie4);
        entreprise1.Afficherentreprise();
        System.out.println("--------------------------------------------------------------------");
        entreprise1.SuppTout();
        entreprise1.Afficherentreprise();
        
        
    }
    
}
