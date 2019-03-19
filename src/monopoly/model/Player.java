/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package monopoly.model;

import java.util.ArrayList;
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
    ArrayList<String> propertyUserList;

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
    
    public void buy(String property, int type, int amountUser, 
            int amountProperty) {
        if(type == 1) {
            if(amountUser > amountProperty) {
                propertyUserList = new ArrayList<>();
                propertyUserList.add(property);
            } else {
                System.out.println("You can't buy this property");
            }
        } else {
            System.out.println("You can't buy this space");
        }
    }
    
    public ArrayList<String> getListUserProperties() {
        return propertyUserList;
    }
    
    public int setLastAmount(int amoutUser, int amountProperty) {
        int resultAmount = amoutUser - amountProperty;
        return resultAmount;
    }
}
