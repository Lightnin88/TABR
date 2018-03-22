package projetalgo;




/**
 * Classe NoeudABR<V> : classe générique qui représente un noeud d'un arbre binaire de recherche.
 * 
 * @author HABIB Clément - GODET Thibaut
 *
 */
public class Noeud<V extends Comparable<V>> {
	protected V _valeur;
	protected Noeud<V> _filsG;
	protected Noeud<V> _filsD;
	
	
	/**
	 * Constructeur de NoeudABR.
	 * @param v : la valeur du noeud.
	 * @param fg : le noeud racine du sous-arbre gauche du noeud.
	 * @param fd : le noeud racine du sous-arbre droit du noeud.
	 */
	public Noeud(V v, Noeud<V> fg, Noeud<V> fd){
		_valeur = v;
		_filsG = fg;
		_filsD = fd;		
	}
	
	/**
	 * Constructeur de NoeudABR.
	 * @param v : la valeur du noeud.
	 */
	public Noeud(V v){
		this(v, null, null);
	}
	
	
	/**
	 * Getter de la valeur du noeud. 
	 * @return la valeur du noeud.
	 */
	public V getValeur(){
		return _valeur;
	}
	
	/**
	 * Getter du fils gauche du noeud.
	 * @return le fils gauche du noeud.
	 */
	public Noeud<V> getFilsGauche(){
		return _filsG;
	}
	
	/**
	 * Getter du fils droit du noeud.
	 * @return le fils droit du noeud.
	 */
	public Noeud<V> getFilsDroit(){
		return _filsD;
	}
	
	
	/**
	 * Setter de la valeur du noeud.
	 * @param v : la nouvelle valeur du noeud.
	 */
	public void setValeur(V v){
		_valeur = v;
	}
	
	/**
	 * Setter du fils gauche du noeud.
	 * @param fg : le nouveau fils gauche du noeud.
	 */
	public void setFilsGauche(Noeud<V> fg){
		_filsG = fg;
	}
	
	/**
	 * Setter du fils droit du noeud.
	 * @param fd : le nouveau fils droit du noeud.
	 */
	public void setFilsDroit(Noeud<V> fd){
		_filsD = fd;
	}
	
	

	
	/**
	 * Méthode toString() de NoeudDico.
	 * @return une chaîne de caractères correspondant aux valeursv du sous-arbre 
	 * 		   dont le noeud courant est la racine.
	 */
	public String toString(){
		String valeurs = "";
		
		if(_filsG != null)
			valeurs += _filsG.toString() + " ; ";
		
		valeurs += _valeur;
		
		if(_filsD != null)
			valeurs += " ; " + _filsD.toString();
		
		return valeurs;
	}

	
	
	/* Méthodes à compléter */
	
	
	/**
	 * Méthode récursive qui ajoute une valeur dans le sous-arbre dont le noeud courant est la racine, 
	 * s'il n'est pas déjà présent.
	 * @param valeur : la valeur à ajouter à l'arbre.
	 * @return le noeud correspondant soit à la valeur ajoutée, soit à la valeur déjà présente.
	 */
	public Noeud<V> ajoutValeur(V valeur)
	{
		if(this._valeur.compareTo(valeur)>0)
		{
			if(this._filsG!=null)
			{
				return _filsG.ajoutValeur(valeur);
			}else
			{
				_filsG=new Noeud<V>(valeur);
				return _filsG;
			}
		}else if(this._valeur.compareTo(valeur)<0)
		{
			if(this._filsD!=null)
			{
				return _filsD.ajoutValeur(valeur);
			}else
			{
				_filsD=new Noeud<V>(valeur);
				return _filsD;

			}
		}else
			return this;
		
		
	}
	
	
	/**
	 * Méthode récursive qui retourne le nombre de noeuds du sous-arbre dont le noeud courant est la racine.
	 * @return le nombre de noeuds présents dans le sous-arbre courant.
	 */
	public int nbNoeuds()
	{
		
		if(this._filsD==null && _filsG==null)
		{
			return 1;
			
		}else if(_filsG!=null &&  _filsD==null)
		{
			return 1+_filsG.nbNoeuds();
		}else if(_filsD!=null  && _filsG==null)
		{
			return 1+_filsD.nbNoeuds();
		}else
			return 1+_filsG.nbNoeuds()+_filsD.nbNoeuds();
	}
	
	
	/**
	 * Méthode récursive qui recherche une valeur dans le sous-arbre 
	 * dont le noeud courant est la racine.
	 * @param valeur : la valeur à chercher.
	 * @return le noeud correspondant à la valeur recherchée si elle est présente  
	 * 		   dans le sous-arbre courant ; null, sinon.
	 */
	public Noeud<V> rechercheNoeud(V valeur)
	{
		if(this._valeur.compareTo(valeur)>0)
		{
			if(this._filsG!=null)
			{
				return _filsG.rechercheNoeud(valeur);
			}else
			{
				return null;
			}
		}else if(this._valeur.compareTo(valeur)<0)
		{
			if(this._filsD!=null)
			{
				return _filsD.rechercheNoeud(valeur);
			}else
			{
				return null;

			}
		}else
			return this;
	}
	
	
	/**
	 * Méthode qui teste si une valeur appartient au sous-arbre dont le noeud courant est la racine. 
	 * @param valeur : la valeur considérée.
	 * @return vrai si la valeur est présente dans le sous-arbre courant ; faux sinon.
	 */
	//ne sert a rien selon mon implentation
	public boolean appartient(V valeur)
	{
		return rechercheNoeud(valeur)!=null;
	}
	
	
	/**
	 * Méthode qui retourne le noeud correspondant à la première valeur du sous-arbre dont le noeud courant est la racine.
	 * @return le noeud correspondant à la première valeur du sous-arbre courant.
	 */
	public Noeud<V> premierNoeud()
	{
		if(this._filsG==null)
			return this;
		else
			return this._filsG.premierNoeud();	
	}
	
	
	/**
	 * Méthode qui retourne le noeud correspondant à la dernière valeur du sous-arbre dont le noeud courant est la racine.
	 * @return le noeud correspondant à la dernière valeur du sous-arbre courant.
	 */
	public Noeud<V> dernierNoeud()
	{
		if(this._filsD==null)
			return this;
		else
			return this._filsD.premierNoeud();	
	}
	
	
	/**
	 * Méthode récursive qui retourne le père du noeud considéré, 
	 * dans le sous-arbre dont le noeud courant est la racine.
	 * @param noeud : le noeud considéré.
	 * @return le noeud père du noeud considéré, dans le sous-arbre courant.
	 */
	public Noeud<V> noeudPere(Noeud<V> noeud, Noeud<V> pereCour)
	{
			if(this._valeur.compareTo(noeud.getValeur())>0)
			{
				if(this._filsG!=null)
				{
					return _filsG.noeudPere(noeud,this);
				}else
				{
					return null;
				}
			}else if(this._valeur.compareTo(noeud.getValeur())<0)
			{
				if(this._filsD!=null)
				{
					return _filsD.noeudPere(noeud,this);
				}else
				{
					return null;

				}
			}else
				return pereCour;
		
		
	}
	
	
	/**
	 * Méthode récursive qui retourne le noeud suivant du noeud considéré, 
	 * dans le sous-arbre dont le noeud courant est la racine.
	 * @param noeud : le noeud considéré.
	 * @return le noeud suivant du noeud considéré, dans le sous-arbre courant.
	 */
	public Noeud<V> noeudSuivant(Noeud<V> noeud, Noeud<V> suivantCour)//pas bon, ilfaudrait faire le bon algo.......
	{
		if(this._valeur.compareTo(noeud.getValeur())>0)
		{
			if(this._filsG!=null)
			{
				return _filsG.noeudSuivant(noeud,this);
			}else
			{
				return null;
			}
		}else if(this._valeur.compareTo(noeud.getValeur())<0)
		{
			if(this._filsD!=null)
			{
				return _filsD.noeudSuivant(noeud,suivantCour);
			}else
			{
				return null;

			}
		}else
			return suivantCour;

	
	}
	
	
	/**
	 * Méthode récursive qui retourne le noeud précédent du noeud considéré, 
	 * dans le sous-arbre dont le noeud courant est la racine.
	 * @param noeud : le noeud considéré.
	 * @return le noeud précédent du noeud considéré, dans le sous-arbre courant.
	 */
//	public NoeudABR<V> noeudPrecedent(NoeudABR<V> noeud, NoeudABR<V> precedentCour){
//
//	}
	
}
