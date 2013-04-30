package Monopoly;

import java.util.Scanner;


/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mario Tsakiris
 */

public class MonopolyGame {

    /**
     * @param args the command line arguments
     *Here is the starting point of the code
     */
    
    
    
    public static void main(String[] args) {
        
        Scanner scan=new Scanner(System.in);

        int plots = 24;
        int rounds;
        int players;
        
        
        System.out.println("'Welcome to Monopoly Board Game'");
        System.out.println();
        System.out.print("Please enter number of rounds: ");  
        
        for(;;) //an endless loop...
        {
            if(!scan.hasNextInt() )// hasNextInt() checks if the input is an integer
            { 
                System.out.println("only integers!: "); 
                scan.next(); 
                continue;
            } 
        rounds=scan.nextInt();
   
        break;
        }
         System.out.print("PLease enter number of players (2-6): ");
         for(;;)
         {
             if(!scan.hasNextInt() )
             {
                 System.out.print("Please type an number!! Try again! : ");
                 scan.next();
                 continue;
             }
            players= scan.nextInt();
             if (players<2 || players>6)
             {
                 System.out.print("Number of players can be 2 to 6: ");
                 continue;
             }
         break;
         }
        
        
        System.out.println();
        //Generate a new instance of the board and start the game
        Board_Game Game= new  Board_Game(rounds, players, plots);
        
        
        
    }
}
