package le;

import java.util.Objects;

/**
 *
 * @author Phuc Hong Le
 */
public class Wine implements Comparable<Wine>{
    
    //fields
    private String name;
    private String brand;
    private int year;
    private int count;
    
    //default constructor
    public Wine(String name, String brand, int year){
        this.name = name;
        this.brand = brand;
        this.year = year;
        count = 1;
    }
    
    //getter method
    public String getName() {
        return name;
    }

    public String getBrand() {
        return brand;
    }

    public int getYear() {
        return year;
    }

    public int getCount() {
        return count;
    }

    //incrementing count whenever the same wine is there inside the list
    public void incrementCount(){
        count++;
    }
    
    //toString method
    @Override
    public String toString() {
        return name + " " + brand + " (" + year + ")";
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 97 * hash + Objects.hashCode(this.name);
        hash = 97 * hash + Objects.hashCode(this.brand);
        hash = 97 * hash + this.year;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (! (obj instanceof Wine)) {
            return false;
        }
        //take this object and use the toString to compare 
        //the toString with the other wine object
        Wine other = (Wine) obj; 
        return this.toString().equals(other.toString());
    }

    @Override
    public int compareTo(Wine wine) {
        return wine.year - this.year;
    }
}
