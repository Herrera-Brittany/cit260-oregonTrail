/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.oregontrail.model;

import byui.cit260.oregontrail.enums.Locationsenum;
import byui.cit260.oregontrail.model.Locations;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Objects;
/**
 *
 * @author Casey
 */
public class Locations extends Towns implements Serializable {

    public static int milesTraveled;
    public static String currentLocation;
    private ArrayList<Towns> towns;

    public Locations() {
    }

    public String getCurrentlocation() {
        return currentLocation;
    }

    public void setCurrentlocation(String currentlocation) {
        this.currentLocation = currentlocation;
    }
    
    
    public String getLocationName(String tagName) {
        Locationsenum name =  Locationsenum.valueOf(tagName);
     
        String itemName = name.getLocationName();
               
	return itemName;

    }
    
       public String getLocationType(String tagName) {
        Locationsenum type =  Locationsenum.valueOf(tagName);
     
        String itemName = type.getLocationTypeName();
               
	return itemName;

    }
    public int getLocationMilage(String tagName) {
        Locationsenum name =  Locationsenum.valueOf(tagName);
     
        int itemName = name.getLocationMilage();
               
	return itemName;

    }
    
    public ArrayList<Towns> getTowns() {
        return towns;
    }

    public void setTowns(ArrayList<Towns> towns) {
        this.towns = towns;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 47 * hash + Objects.hashCode(this.currentLocation);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
         if (super.equals(obj) == false) {
            return false;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Locations other = (Locations) obj;
        if (!Objects.equals(this.currentLocation, other.currentLocation)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Locationcurrentlocation=" + currentLocation + ", " + super.toString()  + '}';
    }
    
        
    
}
