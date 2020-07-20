package serie_exercices.Exercice4;

/**
 *
 * @author khaled
 */

//définition de la classe Emprunter :)
public class Emprunter {
    
    //déclaration des attributs de la classe Emprunter :)
    private Livre livreemprunte;
    private Adherent adherentquilemprunte;

    //constructeur paramétré de la classe Emprunter :)
    public Emprunter(Livre livreemprunte, Adherent adherentquilemprunte) {
        this.livreemprunte = livreemprunte;
        this.adherentquilemprunte = adherentquilemprunte;
    }
    
    //getters de la classe Emprunter :)
    public Livre getLivreemprunte() {
        return livreemprunte;
    }

    public Adherent getAdherentquilemprunte() {
        return adherentquilemprunte;
    }
    
    //cette methode permet de terminer l'emprunt :)
    public void Terminer(Livre L, Adherent A){
        L.Rendre();
        A.Rendre();
    }
    
    
    
}
