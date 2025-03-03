package labs.example.arrays;

import labs.example.arrays.ArrayOperations;

public class ArrayOperations {
    int number1 = 6;

    public void createNewArray(int number1){
        
        int arrayNum[] = new int[number1];
        /* i will be making the current count of the loop (index) into the corresponding element of the array
         * example, on the second loop, array will begin to look like = [1, 2, null, null... etc]
         * to pass an argument of an array into a method, this is talked about on page 465
         */
        for (int index = 0; index < arrayNum.length; index++)
        {
            arrayNum[index] = index;
        }
        
    }


    private void displayArray(){

        ArrayOperations array1 = new ArrayOperations();
        array1.createNewArray();
        System.out.println("I created a new array and it now has " + array1+ " items in it.");  
    }


    public static void main(String[] args) {
        ArrayOperations array2 = new ArrayOperations();
        array2.displayArray();




}
}
