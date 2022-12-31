//This program will convert binary, octal and hexadecimal values
import java.util.*;

public class Converter {
    //Instance Variables
    int octal[] = {0,1,2,3,4,5,6,7};
    String hex[] = {"0","1","2","3","4","5","6","7","8","9","A","B","C","D","E","F"};
    // I added an empty item in idx 0 because I have options which the user must select from 1-3 not 0-3. So if option 1 then the program prints binary and so on
    String bases[] = {"","binary", "octal", "hex", "decimal"};
    int result;
    String StrUserInput;
    int intUserInput1, intUserInput2, decimalInput;
    Scanner scanner = new Scanner(System.in);

    //Local Variables for out decimal to binary functions
    int quotient = intUserInput1;
    int remainder = 0;

    //Creating an ArrayList to make storing the binary numbers alot more easy
    ArrayList<Integer> binary = new ArrayList<Integer>();

    //THE MAIN CLASS!!!!!!!!!
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
                        if(intUserInput1 == 4 && intUserInput2 == 1){
                            decimalToBinary();
                        }
                        if(intUserInput1 == 4 && intUserInput2 == 1){
                            binaryToDecimal();
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
