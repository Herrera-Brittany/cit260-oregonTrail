/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.oregontrail.view;

/**
 *
 * @author ralphb
 */
public class RiverCrossingView extends View {
    
    public RiverCrossingView() {
        super("\n"
            + "\n-----------------------------------------"
            + "\n| River Crossing                         |"
            + "\n-----------------------------------------"
            + "\nW - Wade across river"
            + "\nG - Get details about river"
            + "\nF - Use a Ferry to cross the river"
            + "\nH - Display Help Menu"
            + "\nS - Save game"
            + "\nQ - Quit"
            + "\n-----------------------------------------");
    }
    
   
    @Override
    public boolean doAction(String menuOption) {

       String choice = menuOption.toUpperCase();
       switch (choice) {
           case "W":
               this.wadeAcrossRiver();
               break;
           case "G":
               this.getRiverDetails();
               break;
           case "F":
               this.ferryAccrossRiver();
               break;
           case "H":
               this.displayHelpMenu();
               break;
           case "S":
               this.saveGame();
               break;
           case "Q":
               this.quitGame();
               break;
           default:
               this.console.println("\n*** Invalid selection *** Try again");
               break;
       }

       return false;
    }

    private void wadeAcrossRiver() {
        this.console.println("*** startExistingGame function called ***");
    }

    private void saveGame() {
        this.console.println("*** startExistingGame or startSaveGame function called ***");
    }
    private void getRiverDetails() {
        this.console.println("*** Get River Details function called ***");
    }
    private void ferryAccrossRiver() {
        FerryCrossingView ferry = new FerryCrossingView();
        ferry.display();

    }

    private void displayHelpMenu() {
        HelpMenu helpmenu = new HelpMenu();
        helpmenu.display();
    }


    void quitGame() {
        this.console.println("\n*** Invalid selection *** Try again");
    }
    
}
