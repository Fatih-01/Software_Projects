import java.util.Arrays;

public class storingValuesInNewArray {
    public static void main(String[] args){
        System.out.println("Heloo");
        int counter=0;
        int[] arr = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};

        //Lets store even values in our array

        for(int i=0; i<arr.length; i++){
            if(arr[i] % 2 == 0){
                counter++;
            }
        }

        int[] evenArray = new int[counter];
        
        for(int i=0, idx=0; i<arr.length; i++){
            if(arr[i] %2 == 0){
                evenArray[idx++] = arr[i];
            }
        }
        System.out.println(Arrays.toString(evenArray));
    }
}
