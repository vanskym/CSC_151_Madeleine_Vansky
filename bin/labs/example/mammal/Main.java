public class Main extends Mammal{
    /* the name of your public class MUST be your file name, therefore it will be 'Main' for this file */

    public static void main(String[] args) throws Exception{
        
        Mammal mammal = new Mammal();

        int sleepTime;
        sleepTime = 15000;
        
        /* from right to left, this will be creating a new Mammal class. 'new' means give me a new mammal, a copy and a new object.*/
        /* the lower case 'mammal' on the left hand side is a variable */
        /* the uppercase Mammal() will be referencing the things that are in the other 'mammal' folder*/

        mammal.setName("Mammal");
        /* this will be passing the string value 'Dog' into the mammal set name */

        /* the next will be setting the dogs different details with the getMammalDetails() method*/
        /* list hairColor, String eyeColor, String bodyTemp, String skinType,String eyeType, String hairType */
       mammal.getMammalDetails("Brown", "Golden", "Warm", "Bumpy", "Large", "Coarse");
       
        mammal.eat();
        mammal.run();
        mammal.sleep();
        mammal.scratch();
        mammal.play();
        mammal.hunt();
        mammal.hide();
        mammal.fight();
        mammal.relax();

        mammal.sit();
        mammal.stand();


        


    }
}