import java.util.Scanner;
public class Physics {
    final static double gravity = 9.81;
          double getDistance(){
                /* equation = x = v * t */
                
                double x;
                double v;
                double t;

                Scanner keyboard = new Scanner(System.in);
                System.out.println("Please enter the number for the velocity: ");
                v = keyboard.nextDouble();
                System.out.println("Please enter the number for the time: ");
                t = keyboard.nextDouble();
                x = v * t;
                System.out.println("The distance is " + x +  " miles.");
                return x;
                


            }
            double getLightSpeedInMPH(){
                /* get speed of light in mph and return, this will need to be in hours rather than seconds
                 * which will end up being 186282 * 3600 = 670,615,200 */
                
                double speedOfLight;
                speedOfLight = 670615200.0;
                return speedOfLight;

            }
            double getTimeFromSunToEarthInHours(){
                /* it takes approx. 8 mins 30 secs for sunlight to reach the earth */
                /*  8.5 / 60  = .14 */
                double sunLightNum;
                sunLightNum = .14;
                return sunLightNum;
                
            }
        double getVelocity(){
            /* v = x/t */
            double v;
            double x; 
            double t;
            
            Scanner keyboard = new Scanner(System.in);

            System.out.println("Please enter the number for distance: ");  
            x = keyboard.nextDouble();
            System.out.println("Please enter the number for time: ");
            t = keyboard.nextDouble();
            v = (x / t);
            System.out.println("The velocity is " + v +  " mph.");
            return v;
            
        }
        double getMomentum(){
            /* p = m * v */
            double p;
            double m;
            double v;
            Scanner keyboard = new Scanner(System.in);
            System.out.println("Please enter the mass of the object: ");
            m = keyboard.nextDouble();
            System.out.println("Please enter the velocity of the object: ");
            v = keyboard.nextDouble();
            p = (m * v);
            System.out.println("The momentum of the object is " + p + " kg m/s.");
            return p;

        }
        double getForce(){
            /* f = m * a */
            double f;
            double m;
            double a;
            Scanner keyboard = new Scanner(System.in);
            System.out.println("Please enter the mass of the object: ");
            m = keyboard.nextDouble();
            System.out.println("Please enter the acceleration of the object: ");
            a = keyboard.nextDouble();
            f = (m * a);
            System.out.println("The force of the object is " + f + " kg m/s^2.");
            return f;
        }
        double getWork(){
            /* w = f * d */
            double w;
            double f;
            double d;
            Scanner keyboard = new Scanner(System.in);
            System.out.println("Please enter the force of the object: ");
            f = keyboard.nextDouble();
            System.out.println("Please enter the distance of the object: ");
            d = keyboard.nextDouble();
            w = (f * d);
            System.out.println("The work of the object is " + w + " NM/Joules.");
            return w;   
        }
        double getKineticEnergy(){
            /* ke = 1/2 * m * (v * v) */
            double ke;
            double m;
            double v;
            Scanner keyboard = new Scanner(System.in);
            System.out.println("Please enter the mass: ");
            m = keyboard.nextDouble();
            System.out.println("Please enter the velocity: ");
            v = keyboard.nextDouble();
            v = (v * v);
            m = (m / 2);
            ke = (m * v);
            System.out.println("The kinetic energy of the object is " + ke + " NM/Joules.");
            return ke;

        }
        double getPotentialEnergy(){
            /* pe = m * gravity * h */
            double pe;
            double m;
            double h;
            Scanner keyboard = new Scanner(System.in);
            System.out.println("Please enter the mass of the object: ");
            m = keyboard.nextDouble();
            System.out.println("Please enter the height of the object: ");
            h = keyboard.nextDouble();
            pe = ((m * gravity) * h);
            System.out.println("The potential energy of the object is " + pe + " NM/Joules.");
            return pe;





        }
         

    }

