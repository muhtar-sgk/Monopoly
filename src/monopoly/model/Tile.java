/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package monopoly.model;

/**
 *
 * @author muhtar
 */
public class Tile {
    String name;
    int price;
    int type;

    public Tile(String name, int price, int type) {
        this.name = name;
        this.price = price;
        this.type = type;
    }
  
    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(int Price) {
        this.price = price;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }
}
