/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package collection_1;

/**
 *
 * @author mo0o
 */

import java.util.Scanner;

public class Collection_1 {

    /**
     * @param args the command line arguments
     */
    
    
    
    public static void main(String[] args) {
        String expression, again;
        int result;
        
        Scanner in = new Scanner(System.in);
        
        do
        {
            PostfixEvaluator evaluator = new PostfixEvaluator();
            System.out.println(" Enter a valid post-fix expression one token " +
                    "at a time with a space between each token " +
                    "(e.g. 5 4 + 3 2 1 - + *)");
            
            System.out.println("Each token must be an integer or an " +
                    "operator (+, -, *, /)");
            expression = in.nextLine();
            result = evaluator.evaluate(expression);
            System.out.println();
            System.out.println(" That expression equals " + result);
            System.out.println(" Evaluate another expression [Y/N] ?");
            again = in.nextLine();
            System.out.println();            
        }
        while (again.equalsIgnoreCase("y"));
        // TODO code application logic here
    }
}
