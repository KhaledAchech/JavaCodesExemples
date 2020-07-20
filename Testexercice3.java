package serie_exercices.Exercice3;

/**
 *
 * @author khaled
 */
public class Testexercice3 {
    public static void main(String[] args) {
        try {
            Client client1 = new Client(655978712, "client1", 9, "ariana", 0.900, "abonné");
            Client client2 = new Client(323154487, "client2", 16, "nabeul", 1.200, "handicapé");
            Client client3 = new Client(896526421, "client3", 23, "tunis", 1.400, "passager");
            Client client4 = new Client(23144452, "client4", 10, "beja", 1.000, "passager");
               try {
                    Rame R1 = new Rame(1, 50);
                    R1.MonterClient(client1);
                    R1.MonterClient(client2);
                    R1.MonterClient(client3);   
                    Rame R2 = new Rame(2, 42);
                    R2.MonterClient(client4);
                    System.out.println(R2.Recette());
                         try{
                             Ligne L = new Ligne(2, 5);
                             L.AjouterRame(R1);
                             L.AjouterRame(R2);
                             System.out.println(L.Recette());
                             L.PassagersParDestination("ariana");
                             }
                        catch (CapaciteException ex) {ex.AffichageMsgErreur();} 
                    }
                catch (CapaciteException ex) {ex.AffichageMsgErreur();}
                
        
        }
        catch (AgeException ex) {ex.AffichageMsgErreur();} 
        catch (TarifException ex) {ex.AffichageMsgErreur();}
        catch (CategorieException ex) {ex.AffichageMsgErreur();}
    
    }
}
