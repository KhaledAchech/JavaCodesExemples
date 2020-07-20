package serie_exercices.Exercice3;

/**
 *
 * @author khaled
 */
//Définition de classe d'exception pour le contrôle sur l'age de Client :)
public class AgeException extends Exception{
	
	
	public AgeException()
	{
		super();
	}
	
	public AgeException(String S)
	{
		super(S);
	}
	
	public AgeException(int i)
	{
		if(i==1)
			System.out.println("Age Invalide !!!");
			
	} 
        
        public void AffichageMsgErreur()
	{
		System.out.println("erreur de saisi, merci de verifier l'age entré :)");
	}
    
    
}
