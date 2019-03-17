/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package monopoly.model;

import java.util.Random;

/**
 *
 * @author muhtar
 */
public class Dice {
    public Dice() {}
    
    public int randomDice() {
        Random random = new Random();
        int randomInt = random.nextInt(6);
        return randomInt;
    }
}
