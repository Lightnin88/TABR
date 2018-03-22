package projetalgo;

public class caseTABR {
	private int borneInferieure;
	private int borneSuperieure;
	private ABR<Integer> arbreBinaire;
	
	
	
	public caseTABR(int borneInf, int borneSup, ABR<Integer> arbre) {
		this.borneSuperieure = borneSup;
		this.borneInferieure = borneInf;
		this.arbreBinaire = arbre;
		
		
	}
	
	public caseTABR() {
		this.borneSuperieure = 0;
		this.borneInferieure = 0;
		this.arbreBinaire = null;
		
		
	}
	
	public int getBorneSup() {
		return this.borneSuperieure;
	}
	
	public int getBorneInf() {
		return this.borneInferieure;
	}
	
	public ABR<Integer> getABR() {
		return this.arbreBinaire;
	}
	
	public void setBorneSup(int bornesup) {
		this.borneSuperieure = bornesup;
	}
	
	public void setBorneInf(int borneinf) {
		this.borneInferieure = borneinf;
	}
	
	public void setABR(ABR<Integer> abr) {
		this.arbreBinaire = abr;
	}
	
}
