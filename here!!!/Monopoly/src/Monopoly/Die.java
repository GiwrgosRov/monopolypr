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
    int facevalue;
    int roll()
    {
    
        Random randomgen = new Random();

        int roll = (randomgen.nextInt(5))+1;

        return roll;
    };
    
    getFaceValue();
    setFaceValue();
}
