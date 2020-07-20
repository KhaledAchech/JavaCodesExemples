package serie_exercices.Exercice2;

import java.util.*;

/**
 *
 * @author khaled
 */
//description de la classe Entreprise :)
public class Entreprise {
    
    //declaration des attributs de la claase Entreprise :)
    private String addresse;
    private String raisonsociale;
    private String raisoncommerciale;
    private int nbrmaxsalarie;
    private int nbrsalarie;
    List<Salarie> Listesalarie;

    //constructeur parametré de la classe Entreprise :)
    public Entreprise(String addresse, String raisonsociale, String raisoncommerciale, int nbrmaxsalarie) {
        this.addresse = addresse;
        this.raisonsociale = raisonsociale;
        this.raisoncommerciale = raisoncommerciale;
        this.nbrmaxsalarie = nbrmaxsalarie;
        this.nbrsalarie = 0;
        Listesalarie = new ArrayList<Salarie>();
    }
    
    //les getters et setters de classe Entreprise :)

    public String getAddresse() {
        return addresse;
    }

    public void setAddresse(String addresse) {
        this.addresse = addresse;
    }

    public String getRaisonsociale() {
        return raisonsociale;
    }

    public void setRaisonsociale(String raisonsociale) {
        this.raisonsociale = raisonsociale;
    }

    public String getRaisoncommerciale() {
        return raisoncommerciale;
    }

    public void setRaisoncommerciale(String raisoncommerciale) {
        this.raisoncommerciale = raisoncommerciale;
    }

    public int getNbrmaxsalarie() {
        return nbrmaxsalarie;
    }

    public void setNbrmaxsalarie(int nbrmaxsalarie) {
        this.nbrmaxsalarie = nbrmaxsalarie;
    }

    public int getNbrsalarie() {
        return nbrsalarie;
    }

    public void setNbrsalarie(int nbrsalarie) {
        this.nbrsalarie = nbrsalarie;
    }
    
    //cette methode permet d'afficher l'Entreprise :)
    public void Afficherentreprise ()
    {
        System.out.println("l'adresse de l'entreprise  : " + this.addresse );
        System.out.println("le raison sociale de l'entreprise  : " + this.raisonsociale );
        System.out.println("le raison commerciale de l'entreprise : " + this.raisoncommerciale );
        System.out.println("le nombre maximum de salaries pour cette entreprise : " + this.nbrmaxsalarie );
        System.out.println("le nombre actuel des salaries dans cette entreprise : " + this.nbrsalarie );
        if (Listesalarie.size()>0)
        {
            System.out.println("les salaries de cette entreprise :");
                       for(int i = 0; i < Listesalarie.size(); i++)
                        {
                            Listesalarie.get(i).Affichersalarie();
                        }
        }
         
    }
    
    //cette methode permet d'ajouter un salarie a l'entreprise :)
    public void AjoutSalarie(Salarie s)
    {
	if(this.nbrsalarie>=this.nbrmaxsalarie)
            System.out.println("vous avez atteint le nombre maximum de salaries autoriser.");
        else
	{
	Listesalarie.add(s);
	this.nbrsalarie++;
	}
    }
    
    //cette methode permet de supprimer un salarie de l'entreprise :)
    public void SuppSal(Salarie s)
    {
        for(int i=0 ; i<Listesalarie.size() ; i++)
            if(Listesalarie.get(i).getCin()==s.getCin())
            {   
                Listesalarie.remove(i);
                this.nbrsalarie--;
            }
            else 
                System.out.println("ce salarie n'existe pas déja dans l'entreprise.");
                
		
    }
    
    //cette methode permet de rechercher un salarie et de retourner l'indice de la case ou il existe :)
    public int RechercheSal(Salarie s)
    {
        for(int i=0 ; i<Listesalarie.size() ; i++)
        {
            if(Listesalarie.get(i).getCin()==s.getCin())
                return i;
        }
        return 0;
    }
    
    //cette methode permet de supprimer tous les salaries de l'entreprise :)
    public void SuppTout()
    {
        for(int i=0 ; i<Listesalarie.size() ; i++)
        {
            Listesalarie.remove(i);
            i--;
        }
        this.nbrsalarie=0;
        
    }
    
   //cette methode permet de trier les salries de l'entreprise selon leurs CIN :)
   public void TriEnt()
   {
     //j'ai redefini la comparison de l'interface comparable dans la classe Salarie :)
     Collections.sort(Listesalarie);
  
   }
   
   //cette methode permet de calculer la somme des salaires bruts de tous les salariés d'une etnreprise.
   public double SommeSalaireBrut()
   {
       double sommesalairebrut=0;
        for(Salarie s:Listesalarie)
        {
          sommesalairebrut+=s.calculSalaire();
        }
       return sommesalairebrut;
   }
    
}
