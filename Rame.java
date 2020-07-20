package serie_exercices.Exercice3;

/**
 *
 * @author khaled
 */

//définition de la classe Rame :)
public class Rame {
    
    //les attributs de la classe Rame :)
    private int code;
    private int NbClients=0;
    private int capacitemaximale;
    private Client[] clients;


    //constructeur paramétré de la classe Rame avec controle sur la capacité :) 
    public Rame(int code, int capacitemaximale) throws CapaciteException
    {
        
        this.code = code;
        if ((capacitemaximale < 0) || (capacitemaximale > 87))
        {
                    throw new CapaciteException(1);
        }
        else
        {
          this.capacitemaximale=capacitemaximale;
        }
        this.clients = new Client[capacitemaximale];
        
    }
    
    //les getters et setters des attributs de la classe Clients :)
    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public int getNbClients() {
        return NbClients;
    }

    public void setNbClients(int NbClients) {
        this.NbClients = NbClients;
    }

    public int getCapacitemaximale() {
        return capacitemaximale;
    }

    public void setCapacitemaximale(int capacitemaximale) {
        this.capacitemaximale = capacitemaximale;
    }
    
    //cette methode permet d'afficher un Rame :)
    public void AfficherRam()
    {
        System.out.println("cette ram " + this.code + "contient les passagers suivants : ");
        
        for (int i=1; i <= this.NbClients; i++)
        {
            this.clients[i].Afficherclient();   
            System.out.println("----------------------------------------------------------------------------------------------------------------");
        }
    }
    
    //cette methode permet d'ajouter un Client a la Rame :)
    public void MonterClient(Client c) throws IndexOutOfBoundsException{
        
            this.clients[this.NbClients+1] = c;
            this.NbClients++;
        
        if (this.NbClients > this.capacitemaximale)
        {
            throw new IndexOutOfBoundsException();
        }
    }
    
    //cette methode renvoi un tableau rempli par les clients qui ont comme destination celle passé en parametre  :)
    public Client[] PassagersParDestination (String destination){

        int taillenvtab=0;
        Client[] clientavecdestination = new Client[NbClients];
        for (int i = 1 ; i <= this.NbClients ; i++){
            if (this.clients[i].getDestinationclient().equals(destination))
            {
                clientavecdestination[taillenvtab] = this.clients[i];
                this.clients[i].Afficherclient();
                taillenvtab++;
                
            }  
        }
        return clientavecdestination;
    }
    
    //cette methode calcul le total des tarifs  :)
    public double Recette(){
        
        double totaltarifs=0;
        
        for (int i = 1 ; i <= this.NbClients ; i++){
            
            totaltarifs+=this.clients[i].CalculerTarifTicket();
        } 
        return totaltarifs;
    }
    
    //cette methode renvoi un tableau rempli par les clients handicapés trié par leurs CIN  :)
    public Client[] LesHandicapes() throws AgeException, TarifException, CategorieException{
        
        int taillenvtab=0;
        Client[] clientshandicapes = new Client[taillenvtab];
        Client temp = new Client (123, "test", 1, "test", 8, "test");
        for (  int  i  =  this.NbClients ;  i >= 1 ;  i -- )
        {
          for (  int  j  =  2 ;  j <= i ;  j ++ ) 
          {
              if ( this.clients[j - 1].getCinclient()  > this.clients[j].getCinclient() )
                 {
                     temp  = this.clients[j - 1] ;
                     this.clients[j - 1]  =  this.clients[j] ;
                     this.clients[j]  =  temp ;
                 }
          }
        }
          for (int cp = 0 ; cp < this.NbClients; cp++)
        {
            if (this.clients[cp].getCategorieclient().equals("handicapé"))
            {
             clientshandicapes[taillenvtab]=clients[cp];
             taillenvtab++;
        
            }
        }
                  return clientshandicapes;

    }
}
