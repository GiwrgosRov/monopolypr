package Monopoly;
import java.util.Random;
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mario
 */
public class Die {
    protected int facevalue;
    void roll()
    {
    
        Random randomgen = new Random();

        facevalue = (randomgen.nextInt(6))+1;

    }
    
   public int getfacevalue(){
       int face;
       face= facevalue;
       return face;
   }

}
