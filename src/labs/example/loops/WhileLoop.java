package labs.example.loops;


public class WhileLoop{

    private void executeWhileLoop(){

        int number = 1; 
        
        while (number != 10)
        {
            System.out.println("This loop has iterated " + number + " of 10 times.");
            number = number + 1;
        }

        System.out.println("This loop has iterated " + number + " of 10 times. That's all!");
    }

    public static void main(String[] args) {
        WhileLoop whileloop = new WhileLoop();
        whileloop.executeWhileLoop();
        
        
        
}
}
