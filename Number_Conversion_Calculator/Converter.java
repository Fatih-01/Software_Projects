//This program will convert binary, octal and hexadecimal values

//NOTES TO FOLLOW
/*
 * BINARY NOT CONVERTING DECIMAL PROPERLY
 */
import java.util.*;
import java.lang.*;

public class Converter {
    //Instance Variables
    int octal[] = {0,1,2,3,4,5,6,7};
    String hex[] = {"0","1","2","3","4","5","6","7","8","9","A","B","C","D","E","F"};
    // I added an empty item in idx 0 because I have options which the user must select from 1-3 not 0-3. So if option 1 then the program prints binary and so on
    String bases[] = {"","binary", "octal", "hex", "decimal"};
    int result;
    String StrUserInput;
    //variables names with inout are what the user types and the ones with "output" is what the program shows when converting
    int intUserInput1, intUserInput2, decimalInput, binaryInput, binaryOutput, octalInput ;
    double decimalOutput, octalOutput;
    Scanner scanner = new Scanner(System.in);

    //Local Variables for out decimal to binary functions
    int quotient = intUserInput1;
    int remainder = 0;

    //Creating an ArrayList to make storing the binary numbers alot more easy
    ArrayList<Integer> binary = new ArrayList<Integer>();
    ArrayList<Integer> storeIntegerVals = new ArrayList<Integer>();

    //THE MAIN METHOD!!!!!!!!!
    public static void main(String[] args){
        Converter converter = new Converter();
        converter.displayMessage(); 
        
    }
    //The Menu
    public void conversionOptions(){
        System.out.println("1: Binary, 2: Octal, 3: Hexadecimal, 4: Decimal");
        intUserInput1 = scanner.nextInt();
        intUserInput2 = scanner.nextInt();
    }
    //Message to user providing informations
    public void displayMessage(){
        System.out.println("Welcome to the Converter v.1972");
        System.out.println("Choose from the following two options you want to convert from. E.g: Binary to Hex");
        System.out.println("");
        conversionOptions();

        //This code is just to let the user know what they will be converting in case they enter in something wrong
        for(int i=0; i<bases.length; i++){
            for(int j=0; j<bases.length; j++){
                if(intUserInput1 == i && intUserInput2 == j){
                    System.out.println("Convert from: " + bases[i] + " to " + bases[j] +"?  Yes/No or Exit?");
                    //Getting user input to type "yes" or "no"
                    StrUserInput = scanner.next();
                    //If the user wants to continue with the conversion continue
                    if(StrUserInput.equalsIgnoreCase("yes")){
                        //If user said yes we take the two values and call the functions binaryToHex or BinaryToOctal, etc.....
                        if(intUserInput1 == 1 && intUserInput2 == 2){
                            binaryToOctal();
                        }
                        if(intUserInput1 == 2 && intUserInput2 == 1){
                            OctalToBinary();
                        }
                        if(intUserInput1 == 1 && intUserInput2 == 4){
                            binaryToDecimal();
                        }
                        if(intUserInput1 == 4 && intUserInput2 == 1){
                            decimalToBinary();
                        }
                    }
                    //If the user says "no" Return back to the options
                    if(StrUserInput.equalsIgnoreCase("no")){
                        conversionOptions();
                    }
                }
            }
        }
    }

    //Converting FROM BINARY to Base2,8 or 16
    public void decimalToBinary(){
        //Here I'm trying to convert int numbers to binary and to do this I divide the number by 2 and the remainders I store them in reverse order.
        //E.g(result = 10010011) must be (11001001) as we need to reverse the order to get the correct binary result

        //Asks user to enter the number they want to convert into binary
        System.out.println("Enter a Integer digit you want to convert into binary ");
        decimalInput = scanner.nextInt();
        //Local Variables for out decimal to binary functions
        int quotient = decimalInput;
        int remainder = 0;

        while(quotient >= 1){
            System.out.println("Quotient: " + quotient);
            remainder = quotient%2;
            quotient/=2;
            System.out.println("Remainder: " + remainder);
            // setting the binary array size
            binary.add(remainder);
            }
            //Reversing our ArrayList so we can output the binary result. We use this outside the while loop
            Collections.reverse(binary);
            System.out.println("");
            System.out.println(decimalInput + " as Binary is: "  + binary);
    }


    public void binaryToDecimal(){
        //Asking the user to enter in a binary number
        System.out.println("Enter in a binary value: ");
        binaryInput = scanner.nextInt();
        result = 0;

        while(binaryInput > 0){
            //Result splits the integer values one by one
            result = binaryInput%10;
            //once we split the value divide by 10 so we can get the next value (from right to left)
            binaryInput/=10;
            //If the user HAS NOT entered numbers between 0-1 we must give a warning
            if(result > 1){
                System.out.println("");
                System.out.println(result + " Is not a binary value! Please enter a Binary Digit that is 0 or 1 ");
                System.out.println("");
                binaryToDecimal();
                break;
            }
            else{
                //Storing the split numbers one by one at each indexS
                storeIntegerVals.add(result);

                //Index counting statrts from left to right 
               
                //Viewing our binary ArrayList
                System.out.println(storeIntegerVals);
                
                //Now we have the binary seprated inside an aray we can now convert them into Decimal
                for(int i=0; i<storeIntegerVals.size(); i++){
                    decimalOutput += storeIntegerVals.get(i) * Math.pow(2, i);
                    System.out.println(decimalOutput);
                }
                //Just checks the1 Terminal output
                // System.out.println("Binary");
            }
        }
        System.out.print(decimalOutput);
    }

    public void binaryToOctal(){

        System.out.println("binary to Octal");
        displayMessage();
    }

    public void  OctalToBinary(){

        System.out.println("Octal to Binary");
        displayMessage();
    }

    public int binaryToHex(){
        return result;
    }
}
