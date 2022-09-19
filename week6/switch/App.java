public class App {
    public static void main(String[] args) throws Exception {

        String today = "monday";

        switch (today) {
            case "monday":
                System.out.println("I have f2f classes today");
                break;
            case "tuesday":
                System.out.println("I have classes in the afternoon");
                break;
            case "wednesday":
                System.out.println("I don't have classes today");
                break;
            case "thursday":
                System.out.println("I have a morning online class");
                break;
            case "friday":
                System.out.println("I have an afternoon online class");
                break;
            case "Saturday":
                System.out.println("I go to the gym every saturday!");
                break;
            case "Sunday":
                System.out.println("I do my assignments every sunday!");
                break;
            default:
                break;
        }

    }
}
