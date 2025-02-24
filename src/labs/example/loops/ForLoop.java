package labs.example.loops;

public class ForLoop {
    private void executeForLoop(){

        for (int number = 1; number <= 20; number += 1)
        {
            System.out.println("This for loop has iterated " + number + " of 20 times.");
            /* this is another way - the one that will be preferred in the future:  */
            System.out.println(number + "\t\t" + number * number);
        }

    }

    public static void main(String[] args) {
        ForLoop forloop = new ForLoop();
        forloop.executeForLoop();
        
        
      
}
}