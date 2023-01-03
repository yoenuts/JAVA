class GravityCalculator {
    public static void main(String[] args){
        double gravity = -9.81;
        double initialVelocity = 0.0;
        double fallingTime = 10.0;
        double intialPosition = 0.0;
        double finalPosition = 0.5 * gravity * Math.pow(fallingTime, 2) + initialVelocity * fallingTime + intialPosition;
        
        System.out.println("The object's postion after " + fallingTime + " seconds is " + finalPosition + " m.");
    }

}

/**formula: x(t) = 0.5 × at^2 + vit + xi  */

/**Answer to question no.1:  The object's postion after 10.0 seconds is 0.0 m.*/

/**Output:  The object's postion after 10.0 seconds is -490.5 m.*/

