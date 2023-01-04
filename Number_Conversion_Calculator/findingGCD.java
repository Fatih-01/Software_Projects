import java.util.*;

public class findingGCD {
    //Instance Variables
    int inputX, inputY;

    //12/4=3 --> 12 = Dividend, 4 = Divisor and 3 = quotient
    int dividend, divisor, quotient, remainder;
    //12 = 4x3+0 --> dividend = divisor x quotient  +remainder
    
    //Scanner objects
    Scanner scanner = new Scanner(System.in);
    public static void main(String[] args){
        findingGCD run = new findingGCD();

        run.getGCD();
    }

    public void getGCD(){
        System.out.println("Enter two values you want to find the GCD of ");
        int gcd = 1;
        inputX = scanner.nextInt();
        inputY = scanner.nextInt();
        //If x is smaller than y than if I divide I will get a fraction so I always want x to be greater than y
        if(inputX < inputY){
            inputX = inputY;
            inputY = inputX;
        }
        else{
            dividend = inputX;
            divisor = inputY;
            remainder = dividend % divisor;
            System.out.println("");
            System.out.println("Working out of the solution");
            while(remainder != 0){
                dividend = divisor;
                divisor = remainder;
                quotient = dividend / divisor;
                remainder = dividend % divisor;
                if(remainder == 0){
                    gcd = divisor;
                }
                System.out.println(dividend + " = " + divisor + " x " + quotient + " + " + remainder);
            }
            System.out.println("When getting the gcd of two numbers the remainder that's above 0 which is " + gcd + " is the gcd of the two given values");
            System.out.println("gcd of (" + inputX + ","  + inputY + ") = " + gcd);  
        }
    }
}
