package projetalgo;

import java.io.BufferedReader;
import java.io.FileInputStream;

import java.io.InputStreamReader;
import java.util.ArrayList;

public class TABR {
	private caseTABR[] tableauABR;
	
	public TABR() {
		
	}
	
	
	public ArrayList<String> readFile(String fichier) {
		ArrayList<String> tab = new ArrayList<String>();
	try {
		FileInputStream fstream = new FileInputStream(fichier);
		BufferedReader br = new BufferedReader(new InputStreamReader(fstream));
		
	    
	    String line = br.readLine();
	    
	    
	    while (line != null) {
	        
	        
	        tab.add(line);
	        
	        line = br.readLine();
	        
	    }
	    br.close();
	} catch(Exception e) {
		e.printStackTrace();
		e.getMessage();
	    
	}
	return tab;
	
	}


	public caseTABR[] getTableauABR() {
		return tableauABR;
	}


	public void setTableauABR(caseTABR[] tableauABR) {
		this.tableauABR = tableauABR;
	}
	
}

