package labs.example.arrays;

import labs.example.arrays.ArrayOperations;

public class ArrayOperations {
        
    public static void main(String[] args) {
        final int number1 = 6;
        int[] arrayNum = new int[6];
        createNewArray(arrayNum);
        displayArray(arrayNum, number1);
        for (int index = 0; index < arrayNum.length; index++)
        {
            System.out.print(arrayNum[index] + " ");     
        }   
}
    public static void createNewArray(int arrayNum[]){
        /* i will be making the current count of the loop (index) into the corresponding element of the array
         * example, on the SECOND for loop, array will begin to look like = [1, 2, null, null... etc]
         *
         */
        for (int index = 0; index < arrayNum.length; index++)
        {
            arrayNum[index] = index;   
        }     
    }

    private static void displayArray(int arrayNum[], int number1){

        System.out.println("I created a new array and it now has " + number1 + " items in it.");  
        System.out.println("The array items and their values are listed below: ");  
        

    }



}
