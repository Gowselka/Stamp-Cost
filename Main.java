/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2.pkg1stamps;

import java.util.Scanner;
/**	
 *
 * @author gowse
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
       int customerCash = 0;
       int stampNumber = 0;
       int pennyNumber = 0;
       final int STAMP_COST = 47;
       Scanner in = new Scanner(System.in);
       double remainder = 0;
        
       // Prompt the user to input the amount of money 
        System.out.print("Please enter the amount of money you are inserting: ");
       
        customerCash = in.nextInt();
       //convert the amount of money into pennies 
       pennyNumber = customerCash * 100;
       
       //convert pennies into number of stamps 
       stampNumber = pennyNumber / STAMP_COST;
       remainder = pennyNumber - stampNumber * STAMP_COST;
       //return change in penny stamps 
       System.out.printf("First Class Stamps: %6d%n", stampNumber);
       System.out.printf("Penny stamps:       %6d%n", remainder);
    }
    
}
