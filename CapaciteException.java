package serie_exercices.Exercice3;

/**
 *
 * @author khaled
 */

//Définition de classe d'exception pour le contrôle sur la capacité d'un Rame :)
public class CapaciteException extends Exception {
        public CapaciteException()
	{
		super();
	}
	
	public CapaciteException(String S)
	{
		super(S);
	}
	
	public CapaciteException(int i)
	{
		if(i==1)
			System.out.println("Capacité Invalide !!!");
			
	} 
        
         public void AffichageMsgErreur()
	{
		System.out.println("erreur de saisi, merci de verifier la capacité entré :)");
	}
    
    
}
