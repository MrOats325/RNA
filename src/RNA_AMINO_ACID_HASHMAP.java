

import java.util.ArrayList;
import java.util.HashMap;

class RNA_AMINO_ACID_HASHMAP {

    protected static String aminos(String strain) {

        // Ser
        HashMap<String, ArrayList<String>> serMap = new HashMap<>();
        ArrayList<String> serAmino = new ArrayList<String>();
        serAmino.add("UCU");
        serAmino.add("UCC");
        serAmino.add("UCA");
        serAmino.add("UCG");
        serAmino.add("AGU");
        serAmino.add("AGC");
        serMap.put("Ser", serAmino);

        // Phe
        HashMap<String, ArrayList<String>> pheMap = new HashMap<>();
        ArrayList<String> pheAmino = new ArrayList<String>();
        pheAmino.add("UUU");
        pheAmino.add("UUC");
        pheMap.put("Phe", pheAmino);

        // Leu
        HashMap<String, ArrayList<String>> leuMap = new HashMap<>();
        ArrayList<String> leuAmino = new ArrayList<String>();
        leuAmino.add("UUA");
        leuAmino.add("UUG");
        leuAmino.add("CUU");
        leuAmino.add("CUC");
        leuAmino.add("CUA");
        leuAmino.add("CUG");
        leuMap.put("Leu", leuAmino);

        // TYR
        HashMap<String, ArrayList<String>> tyrMap = new HashMap<>();
        ArrayList<String> tyrAmino = new ArrayList<String>();
        tyrAmino.add("UAU");
        tyrAmino.add("UAC");
        tyrMap.put("Tyr", tyrAmino);
        
        //Cys
        HashMap<String, ArrayList<String>> cysMap = new HashMap<>();
        ArrayList<String> cysAmino = new ArrayList<String>();
        cysAmino.add("UGU");
        cysAmino.add("UGC");
        cysMap.put("Cys", cysAmino);
        
        //Trp
        HashMap<String, ArrayList<String>> trpMap = new HashMap<>();
        ArrayList<String> trpAmino = new ArrayList<String>();
        trpAmino.add("UGG");
        trpMap.put("Trp", trpAmino);
        
        
        //Pro
        HashMap<String, ArrayList<String>> proMap = new HashMap<>();
        ArrayList<String> proAmino = new ArrayList<String>();
        proAmino.add("CCC");
        proAmino.add("CCU");
        proAmino.add("CCA");
        proAmino.add("CCG");
        proMap.put("Pro", proAmino);
        
        //His
        HashMap<String, ArrayList<String>> hisMap = new HashMap<>();
        ArrayList<String> hisAmino = new ArrayList<String>();
        hisAmino.add("CAU");
        hisAmino.add("CAC");
        hisMap.put("His", hisAmino);
        
        //Gln
        HashMap<String, ArrayList<String>> glnMap = new HashMap<>();
        ArrayList<String> glnAmino = new ArrayList<String>();
        glnAmino.add("CAG");
        glnAmino.add("CAA");
        glnMap.put("Gln", glnAmino);
        
        //Arg
        HashMap<String, ArrayList<String>> argMap = new HashMap<>();
        ArrayList<String> argAmino = new ArrayList<String>();
        argAmino.add("AGG");
        argAmino.add("AGA");
        argAmino.add("CGU");
        argAmino.add("CGC");
        argAmino.add("CGA");
        argAmino.add("CGG");
        argMap.put("Arg", argAmino);
        
        //IlE
        HashMap<String, ArrayList<String>> ileMap = new HashMap<>();
        ArrayList<String> ileAmino = new ArrayList<String>();
        ileAmino.add("AUA");
        ileAmino.add("AUC");
        ileAmino.add("AUU");
        ileMap.put("Ile", ileAmino);
        
        //Met
        HashMap<String, ArrayList<String>> metMap = new HashMap<>();
        ArrayList<String> metAmino = new ArrayList<String>();
        metAmino.add("AUG");
        metMap.put("Met", metAmino);
        
        //Thr
        HashMap<String, ArrayList<String>> thrMap = new HashMap<>();
        ArrayList<String> thrAmino = new ArrayList<String>();
        thrAmino.add("ACG");
        thrAmino.add("ACA");
        thrAmino.add("ACC");
        thrAmino.add("ACU");
        thrMap.put("Thr", thrAmino);
        
        //Asn
        HashMap<String, ArrayList<String>> asnMap = new HashMap<>();
        ArrayList<String> asnAmino = new ArrayList<String>();
        asnAmino.add("AAC");
        asnAmino.add("AAU");
        asnMap.put("Asn", asnAmino);
        
        //Lys
        HashMap<String, ArrayList<String>> lysMap = new HashMap<>();
        ArrayList<String> lysAmino = new ArrayList<String>();
        lysAmino.add("AAA");
        lysAmino.add("AAG");
        lysMap.put("Lys", lysAmino);
        
        //Val
        HashMap<String, ArrayList<String>> valMap = new HashMap<>();
        ArrayList<String> valAmino = new ArrayList<String>();
        valAmino.add("GUU");
        valAmino.add("GUC");
        valAmino.add("GUA");
        valAmino.add("GUG");
        valMap.put("Val", valAmino);
        
        //Ala
        HashMap<String, ArrayList<String>> alaMap = new HashMap<>();
        ArrayList<String> alaAmino = new ArrayList<String>();
        alaAmino.add("GCU");
        alaAmino.add("GCC");
        alaAmino.add("GCA");
        alaAmino.add("GCG");
        alaMap.put("Ala", alaAmino);
        
        //Asp
        HashMap<String, ArrayList<String>> aspMap = new HashMap<>();
        ArrayList<String> aspAmino = new ArrayList<String>();
        aspAmino.add("GAU");
        aspAmino.add("GAC");
        aspMap.put("Asp", aspAmino);
        
        //GLU
        HashMap<String, ArrayList<String>> gluMap = new HashMap<>();
        ArrayList<String> gluAmino = new ArrayList<String>();
        gluAmino.add("GAG");
        gluAmino.add("GAA");
        gluMap.put("Glu", gluAmino);
        
        //Gly 
        HashMap<String, ArrayList<String>> glyMap = new HashMap<>();
        ArrayList<String> glyAmino = new ArrayList<String>();
        glyAmino.add("GGG");
        glyAmino.add("GGA");
        glyAmino.add("GGC");
        glyAmino.add("GGU");
        glyMap.put("Gly", glyAmino);
        
        
        //Random Thoughts 
        // reading theserMap
        // System.out.println(serMap);
        // System.out.println(serMap.get("Ser").size());
        
        // for(int i = 0; i <serMap.get("Ser").size(); i++ ) {
        // if(serMap.get("Ser").contains(strain))
        // return "Ser";
        // }

        
        //Returning the right string 
        if (serMap.get("Ser").contains(strain)) {
            return "Ser";
        }
        
        if (pheMap.get("Phe").contains(strain)) {
            return "Phe";
        }
        
        if (leuMap.get("Leu").contains(strain)) {
            return "Leu";
        }
        
        if (tyrMap.get("Tyr").contains(strain)) {
            return "Tyr";
        }
        
        if (cysMap.get("Cys").contains(strain)) {
            return "Cys";
        }
        
        if (trpMap.get("Trp").contains(strain)) {
            return "Trp";
        }

        if (proMap.get("Pro").contains(strain)) {
            return "Pro";
        }
        
        if (hisMap.get("His").contains(strain)) {
            return "His";
        }
        
        if (glnMap.get("Gln").contains(strain)) {
            return "Gln";
        }

        if (argMap.get("Arg").contains(strain)) {
            return "Arg";
        }
        
        if (ileMap.get("Ile").contains(strain)) {
            return "Ile";
        }
        
        if (metMap.get("Met").contains(strain)) {
            return "Met";
        }
        
        if (thrMap.get("Thr").contains(strain)) {
            return "Thr";
        }
        
        if (asnMap.get("Asn").contains(strain)) {
            return "Asn";
        }
        
        if (lysMap.get("Lys").contains(strain)) {
            return "Lys";
        }
        
        if (valMap.get("Val").contains(strain)) {
            return "Val";
        }
        
        if (alaMap.get("Ala").contains(strain)) {
            return "Ala";
        }
        
        if (aspMap.get("Asp").contains(strain)) {
            return "Asp";
        }
        
        if (gluMap.get("Glu").contains(strain)) {
            return "Glu";
        }
        
        if (glyMap.get("Gly").contains(strain)) {
            return "Gly";
        }
        
        
        
        return "";

    }

}
