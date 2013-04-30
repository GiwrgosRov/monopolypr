package Monopoly;

import java.util.ArrayList;
import java.util.List;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mario Tsakiris
 */
public class Board_Game {
    
     private int plots;
     private int playerNum;
     private int roundsNum;
     private Die die;
     private List<Player> players;
     //here we create  a list containing all the available names of players
     //in order for the game to assign
     private static List<String> pawnNames = new ArrayList<String>()
     {{
         add("dog");
         add("iron");
         add("ship");
         add("cannon");
         add("horse");
         add("boot");
         add("car");
         
     }};
     
     
     
     
             
            
     
     //constructor
     //As the game is initialised we have the rounds, number of players and plot number
     //additionally a die is initialized and each player as well
     
     Board_Game(int roundsNum, int PlayerNum, int plots){
         
     this.roundsNum = roundsNum;
     this.playerNum = PlayerNum;
     this.plots= plots;
     die = new Die();
     players = new ArrayList<>();
         for (int i = 0; i < PlayerNum; i++) 
         {//check num of players and assign a name for each one
            String name = pawnNames.get(i);
            players.add( new Player (name));
         }
    InitializeBoard();
    System.out.print(this.roundsNum);
         
     GiveTurn();
     
     
     }
     

     private void GiveTurn(){
         for (int i = 0; i < roundsNum; i++) {
             for (int j = 0; j < playerNum; j++) {
                 
                 die.roll();
                 System.out.println("Die rolled " + die.getfacevalue());
                 Player id= (Player)players.get(j);
                 id.MyMove(die.getfacevalue());//Sends the facevalue to the Players MyMove function
                 
                  
             }
         }
     }

    private void InitializeBoard() {//not implemented wet.. First we need to make the classes first design
        
    }
     
     
   
}