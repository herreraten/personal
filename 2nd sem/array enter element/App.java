package machineproblem4_herrera;
import static java.lang.Double.sum;
import static java.lang.Integer.sum;
import java.util.Scanner;
/**
 *
 * @author herreracc
 */
public class MachineProblem4_Herrera {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int sum = 0;
    int ave = 0;
        
    
         
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
        for(int i = 0; i < n; i++){
            System.out.println(i + "\t==>\t" + num[i]);
        }
         System.out.println();
        for(int i = 0; i < n; i++){
            sum = num[i] + sum;
        System.out.println("sum of all elements are: " + sum);
        }
         System.out.println();
       
       ave = sum / n;
                System.out.println("Average: " + ave);
                
        
        
    }
    
    
}
