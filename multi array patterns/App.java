public class App {
    public static void main(String[] args) throws Exception {

        char [][] array_3x3 = {{'A','B','C'},{'D','E','F'},{'G','H','I'}};
    
        // // A TO L
        for (int rows = 0; rows < array_3x3.length; rows++) {
            
            System.out.println("");
            for (int columns = 0; columns < array_3x3.length; columns++) {
                System.out.print(array_3x3[rows][columns]);
            }
        }
}
}
