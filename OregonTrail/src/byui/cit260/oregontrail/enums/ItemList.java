/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.oregontrail.enums;

import java.io.Serializable;
/**
 *
 * @author ralphb
 */
public enum ItemList implements Serializable {

        AloeVera("1", "8-oz jar of aloe vera"),
        Alum("1", "8-oz bottle of alum"),
        Bacon("308", "Bacon"),
        Bullets("3 boxes", "20 bullets"),
        Cheese("16 lbs", "cheese"),
        CoffeeBeans("20 lbs", "coffee beans"),
        CoffeeMill("1", "coffee mill"),
        CoffeePot("1", "coffee pot"),
        CornMeal("8", "10-lb. sacks of cornmeal"),
        Crackers("8", "5-lb. tin of crackers"),
        DriedBeans("16", "10-lb. sacks of dried beans"),
        DriedBread("8", "5-lb. tins of dried bread"),
        DriedFruit("24", "5-lb. sacks of dried fruit"),
        DriedVegtables("20", "5-lb. sacks of dried vegetables"),
        Flour("16", "10-lb. sacks of flour"),
        Gunpowder("2", "25-lb kegs of gunpowder"),
        Hammer("1", "6-oz. hammer"),
        Kettle("1", "kettle"),
        Lard("3", "5-lb. slabs of lard"),
        Laudanum("1", "4-oz. bottle of laudanum"),
        Matches("5", "boxes matches"),
	Nails("1", "Box of Nails"),
        Pemmican("152 lbs", "pemmican"),
        Pepper("2", "8-oz. bottles of pepper"),
        Peppermint("1", "4-oz. bottle of peppermint"),
        Pickles("1", "25-lb. keg of pickles"),
        Potatoes("16", "5-lb. tins of preserved potatoes"),
        Rice("8", "20-lb. sacks of rice"),
        Rifle("1", "rifle"),
        Rope("1", "30-ft. length of rope"),
        Saleratus("2", "3-lb. boxes of saleratus"),
	Shovel("1", "Long handled shovel"),
        Clothing("12 sets", "clothing"),
        CookingUtensils("1 set", "cooking utensils"),
        EatingUtensils("1 set", "eating utensils"),
	Saw("1", "Large toothed hand saw"),
        Shoes("4 pairs", "shoes"),
        Soap("1", "10-lb. boxes of soap"),
        Socks("12 pairs", "socks"),
        Yoke("1", "spare ox yoke"),
        WagonTonge("1", "spare wagon tongue"),
        WagonAxel("1", "spare wagon axle"),
        WagonWheel("1", "spare wagon wheel"),
        Sugar("12", "10-lb. sacks of sugar"),
        Sulfur("1", "6-oz. bottle of sulfur"),
        Tea("12 lbs", "tea"),
        TinCups("4", "tin cups"),
        TinPlates("4", "tin plates"),
        YeastCake("1", " 5-lb. box of yeast cake");

        private final String recomQty;
        private final String itemName;
        
        private ItemList(String qty, String itemName) {
            this.recomQty = qty;
            this.itemName = itemName;
        }
        
        public String getQty() {
            return this.recomQty;
        }

        public String getItemName() {
            return this.itemName;
        }

        public String getValue(){
            return this.itemName;
        }
        

 }