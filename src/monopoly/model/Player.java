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
public class Player {
    String name;
    String position;
    String property;
    int amount;

    public Player(String name, String position, String property, int amount) {
        this.name = name;
        this.position = position;
        this.property = property;
        this.amount = amount;
    }

    public String getName() {
        return name;
    }

    public String getPosition() {
        return position;
    }

    public String getProperty() {
        return property;
    }

    public int getAmount() {
        return amount;
    }
}
