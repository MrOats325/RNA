
import java.util.ArrayList;

public class RNA  extends RNA_AMINO_ACID_HASHMAP{
    public static String process(String rna) {
        
        if(rna == null) {
            throw new IllegalArgumentException("Invalid Error"); 
        }
        if (rna.length()<1) {
        	return "";
        	}
        if (rna.length()<3) {
        	throw new RNA_Exception("Illegal string length must be longer than three characters");
        }
        
        
        //Seperate each element the 
        String temp = rna; 
        ArrayList<String> strands = new ArrayList<String>();
        for(int i = 0; i < rna.length(); i++) {
            strands.add(temp.substring(i, i+3)); 
            i = i+2; 
        }    
        
        //MATCH ONE ELEMENT TO THE MAP 
        String finalTemp = ""; 
        for(int j = 0; j < strands.size(); j++) {
        	
        	///for (int k=0;k<strands.get(j).length();k++) {
        		//char a = strands.get(j).charAt(k);
//        		if (a!='U'|| a!='T' || a!='A'|| a!='G') {
//        			throw new RNA_Exception("Illegal character");
//        			
//        		}
        	//}
        	
            finalTemp += aminos(strands.get(j)); 
            
            //Stop Codon
            if(strands.get(j).contains("UAA") ||strands.get(j).contains("UAG") || strands.get(j).contains("UGA")) {
                break; 
            }
        }
        
        return finalTemp;
        }
     
    
}


