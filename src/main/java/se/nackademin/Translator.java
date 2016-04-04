/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package se.nackademin;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author cbg-fynrir
 */
public class Translator {
    private int adjektivA;
    private int verbB;
    private int substantivC;
    private int verbD;
    private int adjektivE;
    
    private String[][] Ordlista;
    
    //Ordlistan is a two dimensional array that contains the words we want to use, and which type.
    /**
     * Like so:
     * ()0 1 2
     * 0  
     * 1
     * 2
     * ..
     * 9
     * 
     */
    
    // On the top row, 0 is Adjektiv, 1 is Substantiv, and 2 is a Verb.
    //Filling the Ordlista now.
    
    //Getters for this class:
    
    /**
     * 
     * @return String
     */
    
//    public String[] getWords() {
//        String[] word;
//        
//        
//        
//        return "Nothing";
//    }
    
    //Setters for this class:

    /**
     * @param number
     */
    
    public void setAdjektivA(int number) {
        this.adjektivA = number;
    }
    
    public void setVerbB(int number) {
        this.verbB = number;
    }
    
    public void setSubstantivC(int number) {
        this.substantivC = number;
    }
    
    public void setVerbD(int number) {
        this.verbD = number;
    }
    
    public void setAdjektivE(int number) {
        this.adjektivE = number;
    }
    
    //Fill the Ordlista:
    
    public void setOrdlista() throws IOException {
        
        FileReader fileReader = new FileReader("data/adjektiv");  
        int i = 0;
        try (BufferedReader bufferedReader = new BufferedReader(fileReader)) {
            String line = null;
            
            while ((line = bufferedReader.readLine()) != null)
            {
                this.Ordlista[i][0] = line;
                i++;
            }
            
            bufferedReader.close();
        }
        
        
        
        FileReader fileReader2 = new FileReader("data/substantiv");  
        i = 0;
        try (BufferedReader bufferedReader2 = new BufferedReader(fileReader2)) {
            String line = null;
            
            while ((line = bufferedReader2.readLine()) != null)
            {
                this.Ordlista[i][1] = line;
                i++;
            }
            bufferedReader2.close();
        }
        
         FileReader fileReader3 = new FileReader("data/verb");  
        i = 0;
        try (BufferedReader bufferedReader3 = new BufferedReader(fileReader3)) {
            String line = null;
            
            while ((line = bufferedReader3.readLine()) != null)
            {
                this.Ordlista[i][2] = line;
                i++;
            }
            bufferedReader3.close();
        }
        
    }
    
    
    //Committing.
}
