package projetalgo;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		ABR<Integer> arbre = new ABR<Integer>();
		
		
		TABR tabr= new TABR();
		ArrayList<String> tableau = tabr.readFile("test.txt");
		Iterator<String> iterator = tableau.iterator();
		
		caseTABR[] tableauCases = new caseTABR[10];
		while (iterator.hasNext()) {
		    String line = iterator.next();
		    String tab[] = line.split(":|;");
		    caseTABR ca = new caseTABR();
		    ABR<Integer> arb = new ABR<Integer>();
		   for(int i=0;i<tab.length;i++) {
			   
			   if(i==0) {
				   
			   ca.setBorneInf(Integer.parseInt(tab[i]));
			   
			   }
			   else if(i==1) {
				   ca.setBorneSup(Integer.parseInt(tab[i]));
				   
				   }
			   else {
				   arb.ajoutValeur(Integer.parseInt(tab[i]));
				   
			   }
		   }
		   ca.setABR(arb);
		   System.out.println(ca.getBorneInf() + " " + ca.getBorneSup() + " " +  ca.getABR().toString());
		   
		   
		   
		   
		    
		}
		
		
		
		

	}

}
