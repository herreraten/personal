package machineproblem3_herrera;

import java.util.Scanner;

/**
 *
 * @author herreracc
 */
public class MachineProblem3_Herrera {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
         
         System.out.print("Enter the size of the storage: ");
        int n = sc.nextInt();
                
        System.out.print("\n");
        //size
        int[] num = new int[n];
        //input
        for(int i = 0; i < n; i++){
            System.out.print("Enter an element for index[" + (i+1) + "]: ");
            num[i] = sc.nextInt();
        }
        //output
        System.out.println("\nIndex\t==>\tElement");
        for(int i = n-1; i >= 0; i--){
            System.out.println(i + "\t==>\t" + num[i]);
        }
    }
    
}
