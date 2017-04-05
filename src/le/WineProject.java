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
        wineList.add(wine1);
        wineList.add(wine2);
        wineList.add(wine3);
        System.out.println("First List: ");
        display(wineList);
        wineList.add(2, wine4);
        System.out.println("\nSecond List: ");
        display(wineList);
        wineList.remove(wineList.indexOf(wine3));
        System.out.println("\nThird List: ");
        display(wineList);
        wineList.add(wineDuplicate);
        display(wineList);
    }
    
    //display the list of wine
    public static void display(ArrayList<Wine> wineList){
        //for-each loop
        for (Wine wine: wineList) {
            System.out.println(wine.toString());   
        }
    }
    
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
