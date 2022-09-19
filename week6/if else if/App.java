public class App {
    public static void main(String[] args) throws Exception {

        // Conditional Structure
        boolean suspended = false;
        boolean itsHoliday = false;

        if (suspended) {
            System.out.println("stay at home");
        } else if(itsHoliday)
           {System.out.println("celebrate with family");

           
    } else {
            // Step 1
            rideJeep();

            // Step 2
            rideSecondJeep();

            // Step 3
            walk();

        
        }

    }

    static void rideJeep() {
        System.out.println("Ride jeep from bacood to pureza");
        System.out.println("Exit jeep after arriving to pureza");
    }

    static void rideSecondJeep() {
        System.out.println("Ride second jeep to Legarda");
        System.out.println("Exit second jeep after arriving to Legarda");
    }

    static void walk() {
        System.out.println("Walk to NU");
        System.out.println("Enter NU");
    }

    
}
