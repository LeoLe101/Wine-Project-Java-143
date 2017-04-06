package le;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author Phuc Hong Le
 */
public class UniqueList<E extends Comparable<E>>{ //nesting "<>" bracket

    //fields
    private ArrayList<E> list;
    
    //default constructor
    public UniqueList(){
        list = new ArrayList<>();
    }
    
    public int add(E item){
        if (!list.contains(item)) {
            list.add(item);
            return -1;
        } else {
            return find(item);
        }
    }
    
    public int find(E item){
        return list.indexOf(item);
    }
    
    public E get(int index){
        return list.get(index);
    }
    
    public int size(){
        return list.size();
    }
    
    @Override
    public String toString(){
        return list.toString();
    }
    
    public void removeAllGreater(E item){ 
        Iterator<E> itr = list.iterator();
        while(itr.hasNext()){
            E element = itr.next();
            //if any object is greater then the current object. 
            //Like: current(1); next is number 1, 5, 6. It will delete 5 and 6
            if (element.compareTo(item) > 0) {
                itr.remove();
            }
        }
    }
}
