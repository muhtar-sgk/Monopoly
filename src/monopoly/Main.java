/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package monopoly;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import monopoly.model.Player;
import monopoly.model.Tile;

/**
 *
 * @author muhtar
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //ListProperty listProperty = new ListProperty();
        //0 space 1 property 3 dll
        ArrayList<Tile> tiles = new ArrayList<>();
        tiles.add(new Tile("Mulai", 0, 3));
        tiles.add(new Tile("Monas", 1000, 1));
        tiles.add(new Tile("Dana Umum", 500, 0));
        tiles.add(new Tile("Taman Mini", 1000, 1));
        tiles.add(new Tile("Pajak Jalan", 1000, 0));
        tiles.add(new Tile("Bandara Kemayoran", 500000, 0));
        tiles.add(new Tile("Ragunan Pasar Minggu", 20000, 1));
        tiles.add(new Tile("Kesempatan", 1000, 0));
        tiles.add(new Tile("Binaria", 500, 1));
        tiles.add(new Tile("Taman Pluit", 500, 1));
        tiles.add(new Tile("Penjara", 1000, 0));
        tiles.add(new Tile("Kebun Raya Bogor", 5000, 1));
        tiles.add(new Tile("Perusahaan Listrik", 500, 0));
        tiles.add(new Tile("Pelabuhan Ratu", 50000, 1));
        tiles.add(new Tile("Tangkuban Perahu", 50000, 1));
        tiles.add(new Tile("Terminal Bis Semarang", 5000, 0));
        tiles.add(new Tile("Gedung Batu", 5000, 1));
        tiles.add(new Tile("Dana Umum", 500, 0));
        tiles.add(new Tile("Kopeng", 5000, 1));
        tiles.add(new Tile("Borobudur", 50000, 1));
        tiles.add(new Tile("Parkir Bebas", 500, 0));
        tiles.add(new Tile("Prambanan", 50000, 1));
        tiles.add(new Tile("Kesempatan", 500, 0));
        tiles.add(new Tile("Kraton Yogya", 5000, 1));
        tiles.add(new Tile("Bengawan Solo", 50000, 1));
        tiles.add(new Tile("Stasiun Pasar Turi", 5000, 0));
        tiles.add(new Tile("Sarangan", 5000, 1));
        tiles.add(new Tile("Selecta", 5000, 1));
        tiles.add(new Tile("Perusahaan Air", 5000, 0));
        tiles.add(new Tile("Gunung Kawi", 5000, 1));
        tiles.add(new Tile("Pergi Ke Penjara", 50000, 0));
        tiles.add(new Tile("Pantai Sanur", 5000, 1));
        tiles.add(new Tile("Tampak Siring", 5000, 1));
        tiles.add(new Tile("Dana Umum", 500, 0));
        tiles.add(new Tile("Taman Laut Banda", 50000, 1));
        tiles.add(new Tile("Pelabuhan Belawan", 5000, 0));
        tiles.add(new Tile("Kesempatan", 500, 0));
        tiles.add(new Tile("Danau Toba", 50000, 1));
        tiles.add(new Tile("Pajak Istimewa", 5000, 0));
        tiles.add(new Tile("Brastagi", 5000, 1));
                
        Scanner sc = new Scanner(System.in);
        String command = sc.next();
                
        if(command.equals("Throw")) {
           Random random = new Random();
           int randomInt = random.nextInt((6-1)+1);
           int randomInt2 = random.nextInt((6-1)+1);
           int resultRandom = (randomInt) + (randomInt2);
           System.out.println(randomInt + " " + randomInt2);
           System.out.println(resultRandom);
          
           Player player = new Player("Player 1", 
                   tiles.get(resultRandom).getName(),
                   tiles.get(resultRandom).getName(), 
                   30000);
           System.out.println(player.getName()+": " + player.getAmount() 
                   + " ("+resultRandom+")");
           System.out.println("Position: " + player.getPosition());
           
           String buy = sc.next();
           
           if(buy.equals("Buy")) {
               player.buy(player.getPosition(), tiles.get(resultRandom).getType(),
                       player.getAmount(), tiles.get(resultRandom).getPrice());
                              if(player.getListUserProperties() != null) {

               System.out.println(player.getName()+": " + player
                       .setLastAmount(player.getAmount(), 
                               tiles.get(resultRandom).getPrice())
                   + " ("+resultRandom+")");
               System.out.println("Position: " + player.getPosition());
               System.out.println("Property:");
                   for(int i = 0; i < player.getListUserProperties().size(); i++) {
                       System.out.println("-    "+player.getListUserProperties().get(i));
                   }
               }
           }           
        } else {
            System.out.println("Command wrong");
        }
    }
    
}
