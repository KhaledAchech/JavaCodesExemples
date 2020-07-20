package serie_exercices.Exercice4;

/**
 *
 * @author khaled
 */
public class Testexercice4 {
    public static void main (String args[])
    {
        Ouvrage ouvragedetest = new Ouvrage("auteur1", "testouvrage", 20);
        ouvragedetest.Affichage();
        Livre livredetest = new Livre("auteur2", "testlivre", 20, 250, 6);
        livredetest.Affichage();
        Disque disquedetest = new Disque("auteur3", "testdisque", 5, "editeur1");
        disquedetest.Affichage();
        Adherent adherentdetest = new Adherent("adherentnom", "aherentprenom");
        adherentdetest.Affichage();
        adherentdetest.Emprunter();
        adherentdetest.Rendre();
        
        System.out.println("**********************************************************************************************");
        System.out.println("**********************************************************************************************");
        System.out.println("**********************************************************************************************");

        Livre L1 = new Livre("auteurL1", "nomL1", 3, 100, 2);
        Livre L2 = new Livre("auteurL2", "nomL2", 5, 120, 3);
        Adherent A = new Adherent("adherentAnom", "adherentAprenom");
        Emprunter E1 = new Emprunter(L1, A);
        Emprunter E2 = new Emprunter(L2, A);
        Mediatheque M = new Mediatheque("Mediatheque M", 0, 0, 0);
        
        System.out.println("le nombre d'exemplaire disponible de L1 est : " + L1.NbDisponible());
        System.out.println("**********************************************************************************************");
        M.AjouterAdherent(A);
        M.AjouterOuvrage(ouvragedetest);
        M.AjouterEmprunt(E1);
        M.AjouterEmprunt(E2);
        A.Emprunter();
        A.Emprunter();
        M.ListeAdherentAyantEmprint();
        M.ListeAdherentAyantEmprint("nomL1");

    }
    
}
