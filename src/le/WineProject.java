package le;

import java.util.ArrayList;

/**
 *
 * @author Phuc Hong Le
 */
public class WineProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        UniqueList<Wine> wineList = new UniqueList<>();
        Wine wine1 = new Wine("Merlot", "Talley Vineyards", 1998);
        Wine wine2 = new Wine("Riesling,", "Brotherhood Winery", 1967);
        Wine wine3 = new Wine("Chardonnay,", "Disney", 1936);
        Wine wine4 = new Wine("Middle,", "Cuba", 1927);
        Wine wineDuplicate = new Wine("Middle,", "Cuba", 1927);
        //add the normal list
        int found = 0;
        found = wineList.add(wine1);
        if (found == -1) {
            wineList.get(found).incrementCount();
        }
        found = wineList.add(wine2);
        if (found == -1) {
            wineList.get(found).incrementCount();
        }
        found = wineList.add(wine3);
        if (found > -1) {
            wineList.get(found).incrementCount();
        }
        System.out.println("First List: ");
        display(wineList);
        //add the wine to the middle 
        wineList.add(wine4);
        if (found > -1) {
            wineList.get(found).incrementCount();
        }
        System.out.println("\nSecond List: ");
        display(wineList);
        //remove the wine in a specific index
        wineList.removeAllGreater(wine3);
        System.out.println("\nThird List: ");
        display(wineList);
        //adding the duplicate wine
        add(wineList, wineDuplicate);
        System.out.println("\nDuplicate List: ");
        display(wineList);
    }

    //display the list of wine
    public static void display(UniqueList<Wine> wineList) {
        //for-each loop
        for (int i = 0; i < wineList.size(); i++) {
            System.out.println(wineList.toString());
        }
    }

    //add method that check the wine if it is in the list or not
    public static void add(UniqueList<Wine> wineList, Wine newWine) {
        if (wineList.find(newWine)) {
            System.out.println("This wine has already in the list!");
            wineList.get(wineList.find(newWine)).incrementCount();
        } else {
            wineList.add(newWine);
            System.out.println("New Wine has been added!");
        }
    }
}
