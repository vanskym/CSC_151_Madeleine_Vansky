package labs.example.mammal;

public class Mammal{
    /*only this class may call these protected attributes*/
    protected String hairColor;
    protected String eyeColor;
    protected String bodyTemp;
    protected String skinType;
    protected String eyeType;
    protected String name;
    protected String hairType;
   

    public void mammal(String name){
        
    }
        public void setName(String name){
            /*this will call a way to set and assign to this.name*/
            this.name = name;
            
        }
        
        public void eat(){
            /*it is passing an argument into the string*/
                System.out.println("The " + this.name +  " is now eating!");
            }

         public void run(){
                System.out.println("The " + this.name + " is now running!");
            }
            public void sleep(){
                System.out.println("The " + this.name + " is now sleeping!");
            }
            public void scratch(){
                System.out.println("The " + this.name + " is now scratching!");
            }
            public void play(){
                System.out.println("The " + this.name + " is now playing!");
            }
            public void hunt(){
                System.out.println("The " + this.name + " is now hunting!");
            }
            public void hide(){
                System.out.println("The " + this.name + " is now hiding!");
            }
            public void fight(){
                System.out.println("The " + this.name + " is now fighting!");
            }
            public void relax(){
                System.out.println("The " + this.name + " is now relaxing!");
            }
            public void sit() throws Exception{
                /* add fifteen seconds between sit*/ 
                System.out.println("The " + this.name + " is now sitting!...");
                Thread.sleep(15000); 
            }
            public void stand(){        
                System.out.println("The " + this.name + " is now standing and barking!...");
                
            }
            public void walk(){  
                /* this will be to calculate the distance from one point to the other */      
                System.out.println("The " + this.name + " is walking South for three miles!...");
                System.out.println("The " + this.name + " has turned right and is now walking East for four miles!..");

                
            }

                

            
        /* this will be the method that will get the details of each mammel*/
        
        public void getMammalDetails(String hairColor, String eyeColor, String bodyTemp, String skinType,String eyeType, String hairType){
            this.eyeColor = eyeColor;
            this.bodyTemp = bodyTemp;
            this.skinType = skinType;
            this.eyeType = eyeType;
            this.hairType = hairType;
            System.out.println("The " + this.name + " has " + this.hairType + " hair.");
            System.out.println("The " + this.name + " has a " + this.bodyTemp + " body temperature.");
            System.out.println("The " + this.name + " has a " + this.skinType + " skin type.");
            System.out.println("The " + this.name + " has a " + this.eyeType + " eye type.");
            System.out.println("The " + this.name + " has " + this.eyeColor + " eyes.");
        }
    }
