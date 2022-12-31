import java.util.*;
//THIS CODE COVERTS DECIMAL/INTEGER NUMBERS INTO BINARY
public class test {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int intUserInput1 = scanner.nextInt();
        int quotient = intUserInput1;
        int remainder = 0;
        
        ArrayList<Integer> binary = new ArrayList<Integer>();

        //Here I'm trying to convert int numbers to binary and to do this I divide the number by 2 and the remainders I store them in reverse order.
        //E.g(result = 10010011) must be (11001001) as we need to reverse the order to get the correct binary result
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
            System.out.println(binary);
        }
}

        //PRINT THE CODE AND SEE THE ERROR AS THE RESULT IS NOT STORING INSIDE THE ARRAY CORRECTLY. IT IS GETTING THE LEST REMAINDER AND DUPLICATIONG IT INSIDE THE ARRAY
        // GET THIS FIXED!! RUN THE CODE AND READ THE REMAINDERS AND THE ITEMS INSIDE THE ARRAY. THEY MUST MATCH!!
        // System.out.println(counter);
        // System.out.println(binary.length);

        //THIS WAS FIXED USING ARRAYLIST AS I CAN GROW THE LIST WITHOUT NEEDING TO CREATE A COUNTER AND ASSIGN TO AN ARRAY
        