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
        getDaysAndMonths();

        /*ArrayOperations bubble = new ArrayOperations();
        int number3[] = {1, 2, 3, 4, 5};
        bubble.sortArrays(number3);*/
       

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
    public static void getDaysAndMonths(){
        System.out.println("\n"); 
        int[] days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String[] months = {"January", "February", "March", "April", "May", "June", "July", 
    "August", "September", "October", "November", "December"};
    for ( int i = 0; i < 12; i++){
        System.out.println("There are " + days[i] + " days in " + months[i]);
    }
    }

        void sortArrays(int numberLarge[])
        {
            int sorting = numberLarge.length;
          /* get length of large array */
            for (int i = 0; i < sorting - 1; i++)
            /* this is a nested for loop, the second index or i2 will be compared with the first */
                for (int i2 = 0; i2 < sorting - i - 1; i2++)

                    if (numberLarge[i2] > numberLarge[i2 + 1]) {
                      /* this will change the numbers, putting the smaller one first */
                        int numberChange = numberLarge[i2];
                        numberLarge[i2] = numberLarge[i2 + 1];
                        numberLarge[i2 + 1] = numberChange;
                    }
        }
}
