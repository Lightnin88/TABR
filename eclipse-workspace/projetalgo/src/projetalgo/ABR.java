package projetalgo;


/**
 * Classe ABR<V> : classe générique qui représente un arbre binaire de recherche.
 * 
 * @author HABIB Clément - GODET Thibaut
 *
 */
public class ABR<V extends Comparable<V>> {
	protected Noeud<V> _racine;
	
	
	/**
	 * Constructeur de ABR.
	 */
	public ABR(){
		_racine = null;
	}	
	
	
	/**
	 * Méthode toString() de ABR.
	 * @return une chaîne de caractères correspondant aux valeurs de l'ABR,
	 * 		   dans l'ordre correspondant au type générique V.
	 */
	public String toString(){
		String valeurs = "[";
		
		if(!arbreVide())
			valeurs += _racine.toString();
		
		valeurs += "]";
		
		return valeurs;
	}

	
	
	
	
	
	/**
	 * Méthode qui teste si l'ABR est vide.
	 * @return vrai si l'ABR est vide ; faux sinon.
	 */
	public boolean arbreVide()
	{
		return _racine==null;
	}
	
	
	/**
	 * Méthode récursive qui ajoute une valeur dans l'ABR, si elle n'est pas déjà présente.
	 * @param mot : le mot à ajouter à l'ABR.
	 * @return le noeud correspondant soit à la valeur ajoutée, soit à la valeur déjà présente.
	 */
	public Noeud<V> ajoutValeur(V valeur)
	{
		if (arbreVide())
		{
			this._racine=new Noeud<V>(valeur);
			return this._racine;
		}else
			return this._racine.ajoutValeur(valeur);
	}
	
	
	/**
	 * Méthode récursive qui retourne le nombre de noeuds de l'ABR.
	 * @return le nombre de noeuds présents dans l'ABR.
	 */
	public int nbNoeuds()
	{					
		return arbreVide()?0:_racine.nbNoeuds();
	}
	
	
	/**
	 * Méthode récursive qui recherche une valeur dans l'ABR.
	 * @param valeur : la valeur à chercher.
	 * @return le noeud correspondant à la valeur recherchée 
	 * 		   si elle est présente dans l'ABR ; null, sinon.
	 */
	public Noeud<V> rechercheNoeud(V valeur)
	{
		return arbreVide()?null:_racine.rechercheNoeud(valeur);
	}
	
	/**
	 * Méthode qui teste si une valeur appartient à l'ABR. 
	 * @param valeur : la valeur considérée.
	 * @return vrai si la valeur est présente dans l'ABR ; faux sinon.
	 */
	public boolean appartient(V valeur)
	{
		return rechercheNoeud(valeur)!=null;
	}
	
	
	/**
	 * Méthode qui retourne le premier noeud de l'ABR.
	 * @return le premier noeud de l'ABR.
	 */
	public Noeud<V> premierNoeud()
	{
		return arbreVide()?null:_racine.premierNoeud();
			
	}
	
	
	/**
	 * Méthode qui retourne le dernier noeud de l'ABR.
	 * @return le dernier noeud de l'ABR.
	 */
	public Noeud<V> dernierNoeud()
	{
		return arbreVide()?null:_racine.dernierNoeud();

	}
	
	
	/**
	 * Méthode récursive qui retourne le père du noeud considéré, dans l'ABR.
	 * @param noeud : le noeud considéré.
	 * @return le noeud père du noeud considéré, dans l'ABR.
	 */
	public Noeud<V> noeudPere(Noeud<V> noeud)
	{
		return arbreVide()?null:_racine.noeudPere(noeud,null);

	}
	
	
	/**
	 * Méthode récursive qui retourne le noeud suivant du noeud courant, dans l'ABR.
	 * @param noeud : le noeud considéré.
	 * @return le noeud suivant du noeud considéré, dans l'ABR.
	 */
	public Noeud<V> noeudSuivant(Noeud<V> noeud)
	{
		return arbreVide()?null:_racine.noeudSuivant(noeud,null);


	}
	
	

	
	
	

}

