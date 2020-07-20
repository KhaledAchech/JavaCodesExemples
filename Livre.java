package serie_exercices.Exercice4;

/**
 *
 * @author khaled
 */
//définition de la classe Livre :)
public class Livre extends Ouvrage {
    
    //déclaration des attributs de la classe Livre :)
    private int nbpage;
    private int nbempruntes;

    //définition du constructeur paramétré de la classe Livre :)
    public Livre(String auteur, String titre, int nbexemplaire, int nbpage, int nbempruntes) {
        super(auteur, titre, nbexemplaire);
        this.nbpage=nbpage;
        if (nbempruntes > nbexemplaire)
        {
            System.out.println("cas impossible merci de vérifier les valeur saisi :)");
            System.out.println("on va utilisé la valeur par défaut pour le nombre d'emprunt pour cette cas [valeur par defaut = 0]");
        }
        else
        {
            this.nbempruntes=nbempruntes;
        }
    }

    //getters et setters de la classe Livre :)
    public int getNbpage() {
        return nbpage;
    }

    public void setNbpage(int nbpage) {
        this.nbpage = nbpage;
    }

    public int getNbempruntes() {
        return nbempruntes;
    }

    public void setNbempruntes(int nbempruntes) {
        this.nbempruntes = nbempruntes;
    }
    
    
    //cette methode permet de vérifier si le livre peut etre emprunter encore :)
    public boolean EstEmpruntable(){
        boolean estempruntable=false;
        int nbexemplaires = getNbexemplaire();
        if (nbexemplaires > this.nbempruntes)
        {
            estempruntable = true ;
        }

        return estempruntable;
    }
    
    //cette methode permet de renvoyer le nombre des exemplaire disponible d'un livre :)
    public int NbDisponible (){
        int nbdisponible=0;
        int nbexemplaires = getNbexemplaire();
        nbdisponible = nbexemplaires - this.nbempruntes;
       
        return nbdisponible;
    }
    
    //cette methode permet d'afficher la description d'un Livre :)
    @Override
    public void Affichage(){
    System.out.println(String.format("%s", "-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------"));
    System.out.println(String.format("%30s %20s %30s %20s %15s %20s %15s %20s %15s", "Auteur", "|", "Titre", "|", "nbexemplaire","|","nbpage","|","nbempruntes"));
    System.out.println(String.format("%s", "-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------"));
    System.out.println(String.format("%30s %20s %30s %20s %15s %20s %15s %20s %15s", this.getAuteur(), "|", this.getTitre(), "|", this.getNbexemplaire(), "|",this.getNbpage(),"|",this.getNbempruntes()));
    }
    
    //cette methode permert d'emprunter un Livre si c'est possible :)
    public void Emprunter (){  
        if (EstEmpruntable())
        {
            this.nbempruntes++;
            System.out.println("l'emprunt de livre "+ this.getTitre() +" est fait avec succès");
        }
        else
        {
            System.out.println("Malheuresement, on a plus d'exemplaires de ce livre "+ this.getTitre());
        }
    }
    
    //cette methode permert de rendre un Livre :)
    public void Rendre (){  
        this.nbempruntes--;
    }
    
}
