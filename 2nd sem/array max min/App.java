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
     int max = num[0];
       for(int i = 1; i < n; i+=1){
           if(num[i]>max){
               max =num[i];
           }
       }
       int min = num[0];
       for(int i = 1; i <num.length; i+=1){
           if(num[i]<min){
               min=num[i];
           }
       }
       System.out.println("MAX: "+ max);
              System.out.println("min: "+ min);

                      
           }
           
                
       }
        
    
    

