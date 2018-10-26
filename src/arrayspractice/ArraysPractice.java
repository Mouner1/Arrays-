/*
Mouner Dabjan
October 25 2018
Practicing Arrays 
 */

package arrayspractice;
import java.util.Scanner; 
/**
 *
 * @author modab5310
 */
public class ArraysPractice {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
  Scanner keyedInput = new Scanner (System.in);
        
        int [ ] numbers = new int [10];
        int total = 0;
        
        System.out.println("Enter ten integers and they will be added together:");
        for (int i = 0; i <= 9; i = i + 1)
        {
           numbers[i] = keyedInput.nextInt();
        }
        

        for (int i = 0; i <= 9; i = i + 1)
        {
             total = total + numbers[i];
        }
        
        System.out.println("The sum of those numbers is:");
        System.out.println(total);
    }
    
}
