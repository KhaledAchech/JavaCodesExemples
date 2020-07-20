package serie_exercices.Exercice3;

/**
 *
 * @author khaled
 */

//définition de la classe Ligne :)
public class Ligne {
    
    //les attributs de la classe Ligne :)
    private int code;
    private int nbrames;
    private int capacitemax;
    private Rame[] rames;
    
    //constructeur paramétré de la classe Ligne avec controle sur la capacité :) 
    public Ligne(int code, int capacitemax) throws CapaciteException
    {
        
        this.code = code;
        
        if ((capacitemax < 0) || (capacitemax > 5))
        {
                    throw new CapaciteException(1);
        }
        else
        {
          this.capacitemax=capacitemax;
        }
        this.rames = new Rame[capacitemax];
        
    }

    //les getters et setters des attributs de la classe Ligne :)    
    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }
    
    public void AjouterRame (Rame r) throws IndexOutOfBoundsException
    {
         if (this.nbrames < this.capacitemax)
        {
            this.rames[this.nbrames+1] = r;
            this.nbrames++;
        }
        else
        {
            throw new IndexOutOfBoundsException();
        }
        
    }
    
     //cette methode renvoi un tableau rempli par les clients qui ont comme destination celle passé en parametre  :)
     public Client[][] PassagersParDestination (String destination){
        
        int taillenvtab=0;
        Client[][] clientavecdestination = new Client[capacitemax][];
        
        for (int i = 1 ; i <= this.nbrames ; i++){
            {
                clientavecdestination[taillenvtab] = this.rames[i].PassagersParDestination(destination);
                taillenvtab++;
            }  
        }
        return clientavecdestination;
    }
     
      //cette methode calcul le total des tarifs  :)
       public double Recette(){
        
        double totaltarifs=0;
        for (int i = 1 ; i <= this.nbrames ; i++){
            totaltarifs+=this.rames[i].Recette();
        } 
        return totaltarifs;
    }
    
       //cette methode renvoi un tableau rempli par les clients handicapés trié par leurs CIN  :)
       public Client[][] LesHandicapes() throws AgeException, TarifException, CategorieException{
           
        int taillenvtab=0;
        Client[][] clientshandicapes = new Client[taillenvtab][];
          for (int i = 0 ; i < this.nbrames; i++)
          {
              clientshandicapes[taillenvtab] = this.rames[i].LesHandicapes();
              taillenvtab++;
          }
          
        return clientshandicapes;
       }
    
    
}
