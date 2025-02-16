
/* !!for me tom compile please use: javac -d bin src.labs/example/mammal/*.java  --- this will compile everything in the directory */
/* !!for me to compile please use: java -cp bin labs/example/mammal.Main */

/* java uses the dot notation and this is just directing to the path in the file*/

public class Dog extends Mammal{
    /* the name of your public class MUST be your file name, therefore it will be 'Main' for this file */
    /* the extend allows you to access the Mammal class in inheritance */
   
    public static void main(String[] args) throws Exception{
        

        Mammal dog_mammal = new Mammal();

        int sleepTime;
        sleepTime = 15000;
        
        /* from right to left, this will be creating a new Mammal class. 'new' means give me a new mammal, a copy and a new object.*/
        /* the lower case 'mammal' on the left hand side is a variable */
        /* the uppercase Mammal() will be referencing the things that are in the other 'mammal' folder*/

        dog_mammal.setName("Dog");
        
        /* this will be passing the string value 'Dog' into the mammal set name */

        /* the next will be setting the dogs different details with the getMammalDetails() method*/
        /* list hairColor, String eyeColor, String bodyTemp, String skinType,String eyeType, String hairType */
        dog_mammal.getMammalDetails("Brown", "Golden", "Warm", "Bumpy", "Large", "Coarse");
       
        dog_mammal.eat();
        dog_mammal.run();
        dog_mammal.sleep();
        /* removed the scratch method from Dog.java because that would be more for a cat */
        dog_mammal.play();
        dog_mammal.hunt();
        dog_mammal.hide();
        dog_mammal.fight();
        dog_mammal.relax();

        dog_mammal.sit();
        dog_mammal.stand();
        dog_mammal.bark();

    

        


    }


}