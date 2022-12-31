import java.util.*;
public class storeStringIntoArray {
    //First we check if the user has enterd in a binary number and to do this 
    //This code splits an integer one by one and stores in an array. This will help us convert the binary values into decimal by myultiplying the binary with it's power using the index
    Scanner scanner = new Scanner(System.in);
    int lenOfBinary;

    public static void main(String[] args){
        storeStringIntoArray function = new storeStringIntoArray();
        function.binaryToDecimal();
        
    }

    public void binaryToDecimal(){
        System.out.println("Enter in a binary value: ");
        int binaryInput = scanner.nextInt();
        int result = 0;
    

        while(binaryInput > 0){
            //Result splits the integer values one by one
            result = binaryInput%10;
            System.out.println(result);
            //once we split the value divide by 10 so we can get the next value (from right to left)
            binaryInput/=10;
            //If the user HAS NOT entered numbers between 0-1 we must give a warning
            if(result > 1){
                System.out.println(binaryInput + " Not a binary value! Please enter a Binary Digit that is 0 or 1 ");
            }
            else{
                System.out.println("Binary");
            }
        }
    }

}
