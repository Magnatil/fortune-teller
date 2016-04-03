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
        //Adjective(<A>). this method will return the variable "A".
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
        //"B" is the variable containing the number that will represent 
        //Verb(<B>). this method will return the variable "B".
        int B = 0;
        
        B = B + this.income + this.location.length();
        
        //Subtract 7 in a while loop from B until it reaches below 10. Do not use "Do While"
        //As that would subtract once even if it already is below 10 for some reason.
        
        while (B < 10) {
        B = B - 7;    
        }
        //Check if B landed below 0, then select the closest verb, which is 0.
        //Otherwise there would be errors.
        if (B < 0) {B = 0;} 
        
        return B;
    }

    public int calculateC() {
        //Get our "Sustantive" (<C>) for the fortune teller.
        
        //Call the methods for calculating A and B so we get the values.
        int A = this.calculateA();
        int B = this.calculateB();
        //Initiliazise the C variable, no point in assigning it a value yet.
        int C;
        //Grab the customer height.
        int customerheight = this.height;
        
        //Add A and B together to C.
        C = A + B;
        //Subtract customer height from C.
        C = C - customerheight;
        
        //If C is below 0.
        if (C < 0) {
            
            while (C < 0) {
                C = C + 10;
            }
            
        }
        //If C goes above 9, select 9. This will prevent the software dfrom being unable to display anything.
        //Should the while loop end up with C being above 9.
        if (C > 9) {C = 9;}
        
        return C;
    }

    public int calculateD() {
        int A = this.calculateA();
        int D = 0;
        
        if (A > 5) {
            D = A + this.calculateB();
        }
        
        if (A < 5 || A == 5) {
            D = A + this.calculateC();
        }
        
        D = D - this.income;
        
        //If C is below 0.
        if (D < 0) {
            
            while (D < 0) {
                D = D + 10;
            }
            
        }
        //If C goes above 9, select 9. This will prevent the software dfrom being unable to display anything.
        //Should the while loop end up with C being above 9.
        if (D > 9) {D = 9;}
        
        return D;
    }

    public int calculateE() {
       double sum = 0;
       
       sum = this.age;
       sum = sum * this.income;
       sum = sum * this.income;
       sum = sum * this.height;
       
       sum = Math.sqrt(sum);
       
       if (sum > 10) {
           
           while (sum > 10) {
               sum = sum / 2;
           }
       }
       
       sum = Math.round(sum);
       
       int E = (int) sum;
       
        return E;
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
