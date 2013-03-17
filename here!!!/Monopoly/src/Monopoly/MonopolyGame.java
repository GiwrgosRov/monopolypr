package Monopoly;


import Monopoly.Board_Game;

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
    
    public static void main(String[] args) throws java.io.IOException{
        
        char rounds= 20;
        char players = 2;
        
        System.out.println("'Welcome to Monopoly Board Game'");
        System.out.println();
        //Generate a new instance of the board
        Board_Game Me= new  Board_Game(rounds, players);
        

        
    }
}
