
package arraysdemo;
import java.util.Scanner;
/**
 *
 * @author Alvin Che
 */
public class ArraysDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Enter a word:");
        Scanner input = new Scanner(System.in);
        String myWord = input.nextLine();
        char[] myLetters = new char[myWord.length()];
        
        for(int i =0; i< myLetters.length;i++){
            myLetters[i] = myWord.charAt(i);
            System.out.print(myLetters[i]);
        }
        System.out.println();
        System.out.println("printing in reverse");
        for(int i = myLetters.length -1; i>=0;i--){
            System.out.print(myLetters[i]);
        }
        
        
        

    
    
    }
    
}
