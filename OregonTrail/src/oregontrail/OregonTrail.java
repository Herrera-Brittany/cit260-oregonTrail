/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oregontrail;

//classes created by Ralph Borcherds
import byui.cit260.oregontrail.model.DailyTrailStop;
import byui.cit260.oregontrail.model.Wagon;
import byui.cit260.oregontrail.model.Landmarks;
import byui.cit260.oregontrail.model.Player;
import byui.cit260.oregontrail.model.Rivers;
import byui.cit260.oregontrail.model.StartMenu;
import byui.cit260.oregontrail.model.Towns;


// Classes create by Brittany


// Classes created by Casey

/**
 *
 * @author ralphb
 */
public class OregonTrail {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // Test class Wagon
       Wagon wagon = new Wagon();   //  Calls contructor
       
       wagon.setName("Wagon Team 1");  // Set Name
       
       String playeronename = wagon.getName();  // Get players name and set to variable
       
       System.out.println("Wagon Name: " + playeronename);  // prints name to screen
       
       // Test class DailyTrailStop
       
       DailyTrailStop stop = new DailyTrailStop();
       
       stop.setClimate("Clear Skys");
       
       String weather = stop.getClimate();
       
       System.out.println("Weather at the stop is: " + weather);
       
       // Test class Landmarks
       Landmarks landmark = new Landmarks();
       
       landmark.setName("Salt Lake City");
       
       String landmarkName = landmark.getName();
       
       System.out.println("Landmark Name is: " + landmarkName);
       
       // Test class Player
       Player player = new Player();
       
       player.setName("Ralph");
       
       String playerName = player.getName();
       
       System.out.println("The players name is: " + playerName);
       
       
       // Test class Rivers
       Rivers river = new Rivers();
       
       river.setName("Ohio River");
       
       String riverName = river.getName();
       
       System.out.println("The River Name is: " + riverName);
       
       // Test Start Menu
       StartMenu start = new StartMenu();
       
       start.setWelcome("Welcome to the game.  Please select what you would like to do");
       
       String welcome = start.getWelcome();
       
       System.out.println("The welcome message is: " + welcome);
       
        // Test class Towns
       Towns town = new Towns();
       
       town.setName("Winter Quarters");
       
       String townName = town.getName();
       
       System.out.println("The name of the town is: " + townName);
    }
  
}
    

