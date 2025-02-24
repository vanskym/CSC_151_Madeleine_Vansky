package labs.example.loops;
import java.util.Scanner;

public class ForLoop {
    private void executeForLoop(){

        for (int number = 1; number <= 20; number += 1)
        {
            System.out.println("This for loop has iterated " + number + " of 20 times.");
    
        }

    }

    private int sumTwoNumbers(){
        int number1;
        int number2; 
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please enter the first integer: "); 
        
            number1 = keyboard.nextInt();
            System.out.println("Please enter the second integer: ");

            number2 = keyboard.nextInt();
            int number3 = number1 + number2;

            return number3;
            

    }

    private int sumLoopCounter(){
        int number4;
        int sum;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please enter the integer for a loop to be made: "); 
        
        number4 = keyboard.nextInt();
        for (sum = 0; sum < number4; sum += 1)
        {
            
        }
        return sum;
    }

    private void printMultiplicationTable(){
        int number5;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please enter an integer and I will make the multiplication table from 0-12: "); 
        
        number5 = keyboard.nextInt();
        for(int number6 = 0; number6 <= 12; number6 += 1){
            int val = 0;
            val = number5 * number6;
            System.out.println(val);


        }



    }

    public static void main(String[] args) {
        ForLoop forloop = new ForLoop();
        forloop.executeForLoop();

        int number3 = forloop.sumTwoNumbers();
        System.out.println("The sum of your two numbers is " + number3);
        /* from our slides, this will take a number of value away from the int. increment will be 'number3++;' */
        number3--;
        System.out.println("I have decremented the number, and it is now: " + number3 + " ... I have taken one away from it!");
        
        int sum = forloop.sumLoopCounter();
        System.out.println("The sum of the loop counter is: " + sum);

        forloop.printMultiplicationTable();



                
}

}