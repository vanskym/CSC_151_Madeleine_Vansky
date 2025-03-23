package labs.example.arrays;



public class ArrayOperationsNew {


/*1. Design and write a Java program that uses two integer arrays named: firstArray and secondArray.Your program should accomplish two things: 
a. are the arrays the same length b. are the arrays equal(e.g. do they contain the same values). You must determine these without using any of the built-in 
Java methods that do this for you. Once your program determines the result, you should print the following messages: 
"Yes/No these arrays do/do not contain the same values" and "Yes/No these arrays are/are not the same length" */


public static void main(String[] args) {
    compareArrays();
    threeArrays();
    sortArray();
    ccCheck();
}

public static void compareArrays(){

 
    int[] firstArray = {1, 2, 3, 4, 5, 6};
    int[] secondArray = {1, 2, 3, 8, 5, 6};
    boolean arraysEqual = true;
    int index = 0;
    
    System.out.print("Array 1 for assignment 1 is: ");
    for (int value: firstArray){
        System.out.print(value + " ");}
    System.out.print("\nArray 2 for assignment 1 is: ");
    for (int value: secondArray){
        System.out.print(value + " ");}

    /* and if they are not the same length, that means they are not containing the same value*/
    int compare = firstArray.length;
    int compare2 = secondArray.length;

    if (compare != compare2){
        System.out.println("\n No these arrays do not contain the same length");  
        System.out.println("\n No these arrays do not contain the same values");

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
        System.out.println("\n Yes these arrays do contain the same length");  
            while (arraysEqual && index < firstArray.length){
                if (firstArray[index] != secondArray[index]){
                    arraysEqual = false;
                    
                }
                index++;
            }
            if (arraysEqual)
                System.out.println("\n Yes these arrays do contain the same values"); 
            
            else
                System.out.println("\n No these arrays do not contain the same values");
            
    }
}

public static void threeArrays(){
    /*
     * 2. Design and write a Java program that uses three arrays named: arr1, arr2 and arr3 that contain at least 25 integer values each. 
     * Your program should sum each array respectively, print the sum of each to the console and determine which of the three arrays has 
     * the highest value and print the array and its value to the console.
     * 
     * 
     * i used this website to generate the numbers: 
     * https://numbergenerator.org/25randomnumbersbetween1and100
     */
    int[] array1 = {62, 20, 13, 22, 3, 10, 94, 44, 1, 34, 84, 80, 67, 92, 29, 27, 25, 54, 42, 73, 6, 1, 9, 83, 70};
    int[] array2 = {15, 79, 54, 55, 95, 65, 50, 1, 29, 52, 53, 44, 86, 100, 68, 97, 80, 45, 11, 77, 31, 89, 25, 90, 9};
    int[] array3 = {70, 8, 26, 29, 89, 38, 88, 57, 31, 25, 28, 3, 49, 62, 99, 56, 100, 83, 73, 95, 77, 58, 53, 44};
    int int1 = 0;
    int int2 = 0;
    int int3 = 0;
    System.out.print("Array 1 is: ");
    for (int value: array1){
        System.out.print(value + " ");}
    System.out.print("\nArray 2 is: ");
    for (int value: array2){
        System.out.print(value + " ");}
    System.out.print("\nArray 3 is: ");
    for (int value: array3){
        System.out.print(value + " ");}
    
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
            
            System.out.println("\n The sum of array 1 is: "+ int1);
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
        System.out.println("The very large array is: ");
        for (int index = 0; index < myArray.length; index++)
        {
            System.out.print(myArray[index] + " ");  
        }   
        System.out.println("\n The highest value in the myArray object is "+ bigNum);

}

public static void ccCheck(){
/*4. Using what you have learned with mathematical operators and during the lecture on the Mod-10 Check, 
you should design and write a program that implements a Mod-10-Credit Card Check- and determine if a given credit card is valid.
 You should use chatGPT to generate known-good test credit cards to test your program logic. After your program tests the validity 
 of the credit card, you should print to the console the following message: "Credit Card xxxxxxxxxxxxxxxx is/is not valid." */

 /* this is the code from python class, but changing it to fit in with java and using it as a guide:

  * ccNum = input("Please Enter a Credit Card Number: ")
even_list2 = []
ccNumReversed =  ccNum[::-1]
count = 0 
sum = 0
sum2 = 0
odd_list = []

for character in ccNumReversed:
    count = count + 1
    if count % 2 == 0:
        new_num = int(character) * 2
        if new_num >= 10:
            for num in str(new_num):
                even_list2.append(num)
        if new_num <= 10:
            for num in str(new_num):
                even_list2.append(num)
    if count % 2 != 0:
        odd_list.append(character)
        
for characters in even_list2:
    sum = sum + int(characters)
for characters in odd_list:
    sum2 = sum2 + int(characters)
total = sum + sum2

if total % 10 == 0:
    print("Credit card is valid!")
else:
    print("Credit card not valid.")
  */


    int[] ccNum = {4, 0, 1, 2, 8, 8, 8, 8, 8, 8, 8, 9, 1, 8, 8, 1};
    int[] ccNumReversed = new int[ccNum.length];

    /* will need to be reversed, and this i add to the new array , */
    for(int i = ccNum.length -1; i >= 0; i--){
        /* this is essentially an easy way to reverse.. i take the length, always minus one and then minus its current index, 
        new array now equals the index of original in oppsite */ 
          ccNumReversed[i] = ccNum[ccNum.length -1 - i];             
    }
        /* this is for me to splice the two elements into separate lists, will test with printlines */
      int[] oddList = new int[ccNumReversed.length];
      int[] evenList = new int[ccNumReversed.length];
    

      for (int i = 0; i <= ccNumReversed.length -1; i++){
        if((i / 2) * 2 != i){
            int num = ccNumReversed[i];
            if ((num * 2) <= 10){
            num = num * 2;
            oddList[i] =  num;
        }
            /*System.out.print(oddList[i] + " ");}*/
            /* here is odd list!, this will have to be doubled, then if it is over 10, changed to take the 1 and add to the number 10 is 
             * subtracted from ex: 17 = 8
             */
            
            else {
                num = ((num * 2) - 10) + 1;
                oddList[i] = num;
                /*System.out.print(oddList[i] + " ");*/
            }
            }
        }
    for (int i = 0; i <= ccNumReversed.length -1; i++){
        if((i / 2) * 2 == i){
            /*System.out.print(ccNumReversed[i] + " ");*/
            evenList[i] =  ccNumReversed[i];
            /* even list */
        }
    }

    /* now these two arrays, odd and even, will be added together and divided by zero.. if it is zero, it is a valid cc */

    int ccCheckNum = 0;
    for (int i = 0; i <= oddList.length -1 ; i++){
        ccCheckNum += oddList[i];
    }
    for (int i = 0; i <= evenList.length -1 ; i++){
        ccCheckNum += evenList[i];
    }
    if (ccCheckNum % 10 == 0){
        System.out.print( "Credit Card ");
        for (int value: ccNum){
            System.out.print(value + "");

        }
        System.out.print( " is valid.");

    }
    else{
        System.out.print( "Credit Card ");
        for (int value: ccNum){
            System.out.print(value + "");

        }
        System.out.print( " is not valid.");
    }
}
}

