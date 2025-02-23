package labs.example.physics;



public class Main extends Physics{
    public static void main(String[] args) {
        Physics physics = new Physics();

        double angleInDegrees = getTheta();
        if (angleInDegrees > 37 || angleInDegrees < 35.87){;
            physics.logInvalidAngleInfo(angleInDegrees);
        }
    else {
        physics.logValidAngleInfo(angleInDegrees);
    }

        double speedOfLightInMPH = physics.getLightSpeedInMPH();
        double timeToEarth = physics.getTimeFromSunToEarthInHours();
        double knownDistance = physics.getKnownDistanceToEarth();
        double distance = physics.getDistance(speedOfLightInMPH, timeToEarth);
        if (distance != knownDistance);
            physics.logEarthToSunInvalidDistance();

        physics.getVelocity();
        physics.getMomentum();
        physics.getForce();
        physics.getWork();
        physics.getKineticEnergy();
        physics.getPotentialEnergy();
    }
}