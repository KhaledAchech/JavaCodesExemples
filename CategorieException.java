package serie_exercices.Exercice3;
/**
 *
 * @author khaled
 */

//Définition de classe d'exception pour le contrôle sur la catégorie de Client :)
public class CategorieException extends Exception{
    public CategorieException()
	{
		super();
	}
	
	public CategorieException(String S)
	{
		super(S);
	}
	
	public CategorieException(int i)
	{
		if(i==1)
			System.out.println("Categorie Invalide !!!");
			
	} 
        
         public void AffichageMsgErreur()
	{
		System.out.println("erreur de saisi, merci de verifier la catégorie de client entré :)");
                System.out.println("veuillez verifier bien que la catégorie sagit de l'un des 3 suivants :");
                System.out.println("handicapé | passager | abonné");
         
	}
    
}
