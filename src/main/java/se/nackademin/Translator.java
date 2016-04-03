/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package se.nackademin;

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
     */
    
    // On the top row, 0 is Adjektiv, 1 is Substantiv, and 2 is a Verb.
    //Filling the Ordlista now.
    
    
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
    
    public void setOrdlista() {
        //This method sets ordlista, which is hardcoded. It will not have any parameters.
    }
    
    
    //Committing.
}
