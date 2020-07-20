package serie_exercices.Exercice3;

/**
 *
 * @author khaled
 */
//définition de la classe Client :)
public class Client  {
    
    //les attributs de la classe Client :)
    private int cinclient ;
    private String nomclient;
    private int ageclient;
    private String destinationclient;
    private double tarifdebase;
    private String categorieclient;
    
    //constructeur paramétré de la classe Client avec controle sur l'age, tarif et catégorie :) 
    public Client(int cinclient, String nomclient, int ageclient, String destinationclient, double tarifdebase, String categorieclient) throws AgeException, TarifException, CategorieException
    {
        this.cinclient = cinclient;
        this.nomclient = nomclient;
        if (ageclient < 8)
        {
            throw new AgeException(1);
        }
        else
        {
            this.ageclient = ageclient;
        }
        
        this.destinationclient = destinationclient;
        if ((tarifdebase < 0.875)||(tarifdebase > 1.400))
        {
            throw new TarifException(1);
        }
        else
        {
            this.tarifdebase = tarifdebase;
        }
        
        if((categorieclient.equals("handicapé")) || (categorieclient.equals("passager")) || (categorieclient.equals("abonné")))
        {
            this.categorieclient = categorieclient;
        }
        else
        {
            throw new CategorieException(1);
        }
    }

    //les getters et setters des attributs de la classe Clients :)
    public int getCinclient() {
        return cinclient;
    }

    public void setCinclient(int cinclient) {
        this.cinclient = cinclient;
    }

    public String getNomclient() {
        return nomclient;
    }

    public void setNomclient(String nomclient) {
        this.nomclient = nomclient;
    }

    public int getAgeclient() {
        return ageclient;
    }

    public void setAgeclient(int ageclient) {
        this.ageclient = ageclient;
    }

    public String getDestinationclient() {
        return destinationclient;
    }

    public void setDestinationclient(String destinationclient) {
        this.destinationclient = destinationclient;
    }

    public double getTarifdebase() {
        return tarifdebase;
    }

    public void setTarifdebase(double tarifdebase) {
        this.tarifdebase = tarifdebase;
    }

    public String getCategorieclient() {
        return categorieclient;
    }

    public void setCategorieclient(String categorieclient) {
        this.categorieclient = categorieclient;
    }
    
    //cette methode permet d'afficher un Client :)
    public void Afficherclient(){
        System.out.println("la cin de client est : " + this.cinclient);
        System.out.println("le nom de client est : " + this.nomclient);
        System.out.println("l'age de client est : " + this.ageclient);
        System.out.println("la destination de client est : " + this.destinationclient);
        System.out.println("la tarif de base est : " + this.tarifdebase);
        System.out.println("la catégorie de client est : " + this.categorieclient);
    }
    
    //cette methode permet de calculer le tarif d'un ticket :)
    public double CalculerTarifTicket (){
        double tarif;
        if ((this.categorieclient.equals("handicapé")) || (this.categorieclient.equals("abonné")))
        {
            tarif = 0;
        }
        else
        {
          if ((this.ageclient >= 8) && (this.ageclient <= 10))
              tarif=0;
          else if ((this.ageclient > 10) && (this.ageclient <= 15))
              tarif=0.3*this.tarifdebase;
          else 
              tarif=this.tarifdebase;   
        }
        return tarif;
    }
    
    
}
