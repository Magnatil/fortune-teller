/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package se.nackademin;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;

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
    
    public String[] getWords() throws FileNotFoundException {
        String[] word;
        word = new String[5];
        
        int i = 0;
      
        String[][] Ordlista = new String[11][3];
      
      
      FileInputStream fis = new FileInputStream("data/adjektiv");
 
	//Construct BufferedReader from InputStreamReader
	BufferedReader br = new BufferedReader(new InputStreamReader(fis));
 
	String line = null;
        try {
            while ((line = br.readLine()) != null) {
                
                Ordlista[i][0] = line;
                i++;
            }
        } catch (IOException ex) {
            Logger.getLogger(Translator.class.getName()).log(Level.SEVERE, null, ex);
        }
 
        try {
            br.close();
        } catch (IOException ex) {
            Logger.getLogger(Translator.class.getName()).log(Level.SEVERE, null, ex);
        }
        i = 0;
        //============================================================================
        FileInputStream fis2 = new FileInputStream("data/substantiv");
 
	//Construct BufferedReader from InputStreamReader
	BufferedReader br2 = new BufferedReader(new InputStreamReader(fis2));
 
	String line2 = null;
        try {
            while ((line2 = br2.readLine()) != null) {
                
                Ordlista[i][1] = line2;
                i++;
            }
        } catch (IOException ex) {
            Logger.getLogger(Translator.class.getName()).log(Level.SEVERE, null, ex);
        }
 
        try {
            br2.close();
        } catch (IOException ex) {
            Logger.getLogger(Translator.class.getName()).log(Level.SEVERE, null, ex);
        }
        i = 0;
        //==============================================================================
        FileInputStream fis3 = new FileInputStream("data/verb");
 
	//Construct BufferedReader from InputStreamReader
	BufferedReader br3 = new BufferedReader(new InputStreamReader(fis3));
 
	String line3 = null;
        try {
            while ((line3 = br3.readLine()) != null) {
                
                Ordlista[i][2] = line3;
                i++;
            }
        } catch (IOException ex) {
            Logger.getLogger(Translator.class.getName()).log(Level.SEVERE, null, ex);
        }
 
        try {
            br3.close();
        } catch (IOException ex) {
            Logger.getLogger(Translator.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        //============================================================================
        word[0] = Ordlista[this.adjektivA][0];
        word[1] = Ordlista[this.verbB][2];
        word[2] = Ordlista[this.substantivC][1];
        word[3] = Ordlista[this.verbD][2];
        word[4] = Ordlista[this.adjektivE][0];
        
        
        return word;
   }
    
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
    

      
                
    
    
    
    //Committing.
}
