/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.oregontrail.view;

/**
 *
 * @author Br33h3rr3ra
 */
public class HelpMenu extends View{
    
    String filename = "tips.txt";
    String line = null;
    private char choice;
    private String tips;
    private String returnPrevious;

    
    public HelpMenu() {
        super("\n********************************************************"
            + "\n*                                                      *"
            + "\n***********************HELP MENU************************"
	    + "\n*                                                      *"
            + "\n*                      'T' for Tips                    *"
            + "\n*                      'Q' to Exit                     *"
	    + "\n*                                                      *"
	    + "\n*                                                      *"
            + "\n*     The goal of the game is to make it to Oregon     *"
            + "\n*                                                      *"
            + "\n*                                                      *"
            + "\n*                                                      *"
            + "\n*                                                      *"
            + "\n********************************************************"
            + "\n"
        );
    }
    

    @Override
    public boolean doAction(String menuOption) {

        String choice = menuOption.toUpperCase();
        switch (choice) {
//           Ra                
            case "T":
                this.console.println("\n"
                    + "\nDon't die!"
		    + "\nMake sure you have enough food!"
		    + "\nSlow pace speeds recovery time"
		    + "\nKeep track of the calendar");
                break;
            default:
                this.console.println("\n*** Invalid selection *** Try again");
                break;
        }
        return false;
         

    }

//    public void getTips() {
//        try {
//            FileReader fileReader = new FileReader(filename);
//        }
//        //For some reason this is not getting the file.
//        catch(FileNotFoundException fileReader) {
//            this.console.println(
//                "Unable to open file '" + 
//                filename + "'");                
//        }
//        catch(IOException fileReader) {
//            this.console.println(
//                "Error reading file '" 
//                + filename + "'");  
//    }
//    }
        
    public void setTips(String tips) {
        this.tips = tips;
    }
//
//    public boolean getReturnPrevious() {
//        return true;
//
//    }
//
//    public void setReturnPrevious(String returnPrevious) {
//        this.returnPrevious = returnPrevious;
//    }
}
 