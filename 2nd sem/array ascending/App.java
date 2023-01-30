package machineproblem5_herrera;
    import java.util.Scanner;

/**
 *
 * @author herreracc
 */
public class MachineProblem5_HERRERA {

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
        for(int i = 0; i < n; i++){
            System.out.println(i + "\t==>\t" + num[i]);
            
            
            
        }  
     int temp;
 for(int o = 0; o < num.length; o+=1){
 for(int i = 0; i < num.length-1; i++){
 if(num[i] > num[i+1]){
 temp = num[i+1];
 num[i+1] = num[i];
 num[i] = temp;                 }
 }
 }
          
       System.out.println("SORTED: ");
       for(int i=0; i<num.length; i++){
              System.out.print(num[i]+", ");

                      
           }
           
                
       }
        
    
