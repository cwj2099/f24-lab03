package edu.cmu.cs.cs214.rec04;

/**
 * InheritanceSortedIntList -- a variant of a SortedIntList that keeps
 * count of the number of attempted element insertions (not to be confused
 * with the current size, which goes down when an element is removed)
 * and exports an accessor (totalAdded) for this count.
 *
 * @author Nora Shoemaker
 *
 */

public class InheritanceSortedIntList extends SortedIntList{
    // Write your implementation below with API documentation

    //records the add numbers
    int totalAdded = 0;

    /**
     * Add once if result is success 
     */
    @Override
    public boolean add(int num){
        boolean result = super.add(num);
        if(result) totalAdded ++;
        return result;
    }


    /**
     * Return the total added
     * @return
     */
    public int getTotalAdded() {
        return totalAdded;
    }

}