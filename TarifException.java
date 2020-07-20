package serie_exercices.Exercice3;

/**
 *
 * @author khaled
 */
//Définition de classe d'exception pour le contrôle sur la tarif de base :)
public class TarifException extends Exception{
    public TarifException()
	{
		super();
	}
	
	public TarifException(String S)
	{
		super(S);
	}
	
	public TarifException(int i)
	{
		if(i==1)
			System.out.println("Tarif Invalide !!!");
			
	} 
         public void AffichageMsgErreur()
	{
		System.out.println("erreur de saisi, merci de verifier la tarif entré :)");
	}
         
    
}
