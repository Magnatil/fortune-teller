package se.nackademin;
//Random comment, just for first commit.46346346
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import se.nackademin.gui.FortuneTellerGui;

public class FortuneTeller {
    MagicNumbers magicNumbers;
    FortuneTellerGui fortuneTellerGui;
    Translator translator;

    /*
     * Returns a fortune based on name, income, location, age and height
     *
     * Calculates the magical numbers A-E, and then feeds these numbers to the Translator. The translator class returns
     * individual words which are fed into the magical template. The result of this operation is a scientifically
     * proven fortune.
     *
     * @return A scientifically proven fortune
     *
     */
    public String calculate() {
        int A = this.magicNumbers.calculateA();
        int B = this.magicNumbers.calculateB();
        int C = this.magicNumbers.calculateC();
        int D = this.magicNumbers.calculateD();
        int E = this.magicNumbers.calculateE();
        
        this.translator.setAdjektivA(A);
        this.translator.setVerbB(B);
        this.translator.setSubstantivC(C);
        this.translator.setVerbD(D);
        this.translator.setAdjektivE(E);
        
        String[] words;
        words = new String[5];
        
        try {
            words = this.translator.getWords();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(FortuneTeller.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
        
        
        return "Din framtid är "+ words[0] +". Du borde sluta "+ words[1] +". Vi ser att du snart kommer att skaffa "+ words[2] +". Snart kommer du vilja "+ words[3] +", men då är det viktigt att du är "+ words[4] +".";
    }

    public static void main(String[] args) {
        new FortuneTeller();
    }

    FortuneTeller() {
        fortuneTellerGui = new FortuneTellerGui(this);
        magicNumbers = new MagicNumbers();
        translator = new Translator();
        
       
          
        
     

    }

    public boolean setName(String name) {

        magicNumbers.setName(name);
        return name != null;
    }

    Integer convertToInteger(String input) {
        Integer output = null;
        try {
            output = Integer.valueOf(input);
        } catch (NumberFormatException numberFormatException) {
            //if an exception is caught we'll return null
        }
        return output;
    }

    public boolean setIncome(String income) {
        Integer incomeValue = convertToInteger(income);
        if (incomeValue == null) {
            return false;
        } else {
            magicNumbers.setIncome(incomeValue);
            return incomeValue<=10_000_000;
        }
    }

    public boolean setLocation(String location) {
        magicNumbers.setLocation(location);
        return location != null;
    }

    public boolean setAge(String age) {
        Integer ageValue = convertToInteger(age);
        if (ageValue == null) {
            return false;
        } else {
            magicNumbers.setAge(ageValue);
            return true;
        }
    }

    public boolean setHeight(String height) {
        Integer heightValue = convertToInteger(height);
        if (heightValue == null) {
            return false;
        } else {
            magicNumbers.setHeight(heightValue);
            return true;
        }
    }
}
