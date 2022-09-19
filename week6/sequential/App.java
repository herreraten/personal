public class App {
    public static void main(String[] args) throws Exception {

        // Sequential Structure
        // Methods are called in order.

        // Step 1
        rideJeep();

        // Step 2
        rideSecondJeep();

        // Step 3
        walk();

        
    }

    static void rideJeep() {
        System.out.println("Ride jeep from bacood to pureza");
        System.out.println("Exit jeep after arriving to pureza");
    }

    static void rideSecondJeep() {
        System.out.println("Ride second jeepney to Legarda");
        System.out.println("Exit second jeepney after arriving to Legarda");
    }

    static void walk() {
        System.out.println("Walk to NU");
        System.out.println("Enter NU");
    }

    
}
