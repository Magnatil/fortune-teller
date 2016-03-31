package se.nackademin;

public class MagicNumbers {

    private String name;
    private int income;
    private String location;
    private int age;
    private int height;

    //Calculate the number of spaces in the given name.
    //As no direction regarding if a accidental space at the beginning or the end
    //of a string was mentioned, we shall include these too.
    //Then we add 1 to the result of the space count. And then
    //We add the age of the customer, finally a while loop will subtract 7
    //from the sum until it is below 10.
    
    public int calculateA() {
        //"A" is the variable containing the number that will represent 
        //Adjective(<A>). this method wil return the variable "A".
        int A = 1; //Set to 1 at initilization so we do not need to add during the space calculation.
        String nameA = this.name;
        
        
        //Length of name - name string with no spaces, the difference
        //in Length between the original string and modified string is the number
        //of spaces encountered.
        A += nameA.length() - nameA.replaceAll(" ", "").length();
        
        //Add age to the A variable.
        A = A + this.age;
        
        //Subtract 7 in a while loop from A until it reaches below 10. Do not use "Do While"
        //As that would subtract once even if it already is below 10 for some reason.
        
        while (A < 10) {
        A = A - 7;    
        }
        //Check if A landed below 0, then select the closest adjective, which is 0.
        //Otherwise there would be errors.
        if (A < 0) {A = 0;} 
        
        return A;
    }

    public int calculateB() {
        //TODO: calculate B
        return 0;
    }

    public int calculateC() {
        //TODO: calculate C
        return 0;
    }

    public int calculateD() {
        //TODO: calculate D
        return 0;
    }

    public int calculateE() {
        //TODO: calculate E
        return 0;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setIncome(int income) {
        this.income = income;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}
