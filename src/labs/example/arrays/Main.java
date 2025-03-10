package labs.example.arrays;



public class Main extends ArrayOperations{
    public static void main(String[] args) {
        ArrayOperations ob = new ArrayOperations();
        int numberLarge[] = {3, 2, 45, 6, 32, 6, 8, /* began adding more nums at this point */ 10, 12, 11, 90, 60, 45,
            81, 5, 24, 44, 42, 8, 41, 18, 49, 27, 57, 96, 93, 61, 70, 40, 22, 20, 92, 93, 95, 25, 2, 97, 7, 96, 31,
            37, 45, 70, 89, 64, 21, 34, 17, 64, 3, 73, 47, 30};
      
        ob.sortArrays(numberLarge);
      
          int sorted = numberLarge.length;
      
        for (int i = 0; i < sorted; ++i)
            System.out.print(numberLarge[i] + " ");
        System.out.println();

/* for number 2 of our lab we will be doing something called a bubble sort
 * this is not modern but it is important to understand the way array works
 * 
 * this will be done by a for loop. we will loop through each of the ints in the array, and each time it goes through the for loop counter
 * it will see whether or not the number is higher than the previous one. the number will be placed in the front accordingly. 
 */


    }
}