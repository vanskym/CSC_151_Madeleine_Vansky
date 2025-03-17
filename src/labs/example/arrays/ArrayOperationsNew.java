package labs.example.arrays;

public class ArrayOperationsNew {


/*1. Design and write a Java program that uses two integer arrays named: firstArray and secondArray.Your program should accomplish two things: 
a.) are the arrays the same length b.) are the arrays equal(e.g. do they contain the same values). You must determine these without using any of the built-in 
Java methods that do this for you. Once your program determines the result, you should print the following messages: 
"Yes/No these arrays do/do not contain the same values" and "Yes/No these arrays are/are not the same length" */


public static void main(String[] args) {
    compareArrays();
    sortArray();
    threeArrays();
}

public static void compareArrays(){

 
    int[] firstArray = {1, 2, 3, 4, 5, 6};
    int[] secondArray = {1, 2, 3, 8, 5, 6};
    boolean arraysEqual = true;
    int index = 0;
    
    /* and if they are not the same length, that means they are not containing the same value*/
    int compare = firstArray.length;
    int compare2 = secondArray.length;

    if (compare != compare2){
        System.out.println(" No these arrays do not contain the same length");  
        System.out.println(" No these arrays do not contain the same values");

    /*else if (compare == compare2){
        System.out.println(" Yes these arrays do/do not contain the same length"); 
        for (int i = 0; i < compare - 1; i++)
            for( int i2 = 0; i2 < compare2 -1; i2++)

            if (firstArray[i] != secondArray[i2]){
                System.out.println(" No these arrays do/do not contain the same values");
                break;
            }
}*/}
    else{
        System.out.println(" Yes these arrays do contain the same length");  
            while (arraysEqual && index < firstArray.length){
                if (firstArray[index] != secondArray[index]){
                    arraysEqual = false;
                    
                }
                index++;
            }
            if (arraysEqual)
                System.out.println(" Yes these arrays do contain the same values"); 
            
            else
                System.out.println(" No these arrays do not contain the same values");
            
    }
}

public static void threeArrays(){
    /*
     * 2. Design and write a Java program that uses three arrays named: arr1, arr2 and arr3 that contain at least 25 integer values each. 
     * Your program should sum each array respectively, print the sum of each to the console and determine which of the three arrays has 
     * the highest value and print the array and its value to the console.
     */
    int[] array1 = {1, 2, 3, 4, 5, 6};
    int[] array2 = {1, 2, 3, 8, 5, 6};
    int[] array3 = {1, 3, 4, 2};
    int int1 = 0;
    int int2 = 0;
    int int3 = 0;

    int sorting = array1.length;
            for (int i = 0; i < sorting; i++){
                int1 += array1[i];
            }
    int sorting2 = array2.length;
            for (int i = 0; i < sorting2; i++){
                int2 += array2[i];
            }
    int sorting3 = array3.length;
            for (int i = 0; i < sorting3; i++){
                int3 += array3[i];
            }
            
            System.out.println(" The sum of array 1 is: "+ int1);
            System.out.println(" The sum of array 2 is: "+ int2);
            System.out.println(" The sum of array 3 is: "+ int3);
}

public static void sortArray(){
 
    /*3. Design and write a Java program that uses one array named myArray that contains at least 50 integer values. 
    Your program should determine the highest value in the array and print the following message to the console: "The highest value in the myArray object is: xxxxx" */

      int myArray[] = {3, 2, 45, 6, 32, 6, 8, 10, 12, 11, 90, 60, 45,
            81, 5, 24, 44, 42, 8, 41, 18, 49, 27, 57, 96, 93, 61, 70, 40, 22, 20, 92, 93, 95, 25, 2, 97, 7, 96, 31,
            37, 45, 70, 89, 64, 21, 34, 17, 64, 3, 73, 47, 30};
            
            int sorting = myArray.length;
            for (int i = 0; i < sorting - 1; i++){
                for (int i2 = 0; i2 < sorting - i - 1; i2++)

                    if (myArray[i2] > myArray[i2 + 1]) {
                      /* this will change the numbers, putting the smaller one first */
                        int numberChange = myArray[i2];
                        myArray[i2] = myArray[i2 + 1];
                        myArray[i2 + 1] = numberChange;
            }
        }
        int bigNum = myArray[myArray.length - 1];
        System.out.println("The array is: ");
        for (int index = 0; index < myArray.length; index++)
        {
            System.out.print(myArray[index] + " ");  
        }   
        System.out.println("\n The highest value in the myArray object is "+ bigNum);

}



}