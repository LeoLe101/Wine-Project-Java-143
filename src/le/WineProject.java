package le;

import java.util.ArrayList;

/**
 *
 * @author Phuc Hong Le
 */
public class WineProject {

    private static ArrayList<Wine> wineList = new ArrayList<>();
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Wine wine1 = new Wine("Merlot", "Talley Vineyards", 1998);
        Wine wine2 = new Wine("Riesling,", "Brotherhood Winery", 1967);
        Wine wine3 = new Wine("Chardonnay,", "Disney", 1936);
        Wine wine4 = new Wine("Middle,", "Cuba", 1927);
        Wine wineDuplicate = new Wine("Middle,", "Cuba", 1927);
        //add the normal list
        wineList.add(wine1);
        wineList.add(wine2);
        wineList.add(wine3);
        System.out.println("First List: ");
        display(wineList);
        //add the wine to the middle 
        wineList.add(2, wine4);
        System.out.println("\nSecond List: ");
        display(wineList);
        //remove the wine in a specific index
        wineList.remove(wineList.indexOf(wine3));
        System.out.println("\nThird List: ");
        display(wineList);
        //adding the duplicate wine
        add(wineList, wineDuplicate);
        System.out.println("\nDuplicate List: ");
        display(wineList);
    }
    
    //display the list of wine
    public static void display(ArrayList<Wine> wineList){
        //for-each loop
        for (Wine wine: wineList) {
            System.out.println(wine.toString());   
        }
    }
    
    //add method that check the wine if it is in the list or not
    public static void add(ArrayList<Wine> wineList, Wine newWine){
        if (wineList.contains(newWine)) {
            System.out.println("This wine has already in the list!");
            wineList.get(wineList.indexOf(newWine)).incrementCount();
        } else {
            wineList.add(newWine);
            System.out.println("New Wine has been added!");
        }
    }
}
