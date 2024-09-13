package edu.cmu.cs.cs214.rec04;

/**
 * DelegationSortedIntList -- a variant of a SortedIntList that keeps
 * count of the number of attempted element insertions (not to be confused
 * with the current size, which goes down when an element is removed)
 * and exports an accessor (totalAdded) for this count.
 *
 * @author Nora Shoemaker
 *
 */

public class DelegationSortedIntList implements IntegerList{

    //Most of the codes is just using a sortedIntlist
    //However, add and add all is modified to record total added
    SortedIntList myIntList = new SortedIntList();
    int totalAdded = 0;

    @Override
    public boolean add(int num) {
        boolean result = myIntList.add(num);
        if(result) totalAdded ++;
        return result;
    }

    @Override
    public boolean addAll(IntegerList list) {
        boolean result = myIntList.addAll(list);
        if(result) totalAdded += list.size();
        return result;
    }

    @Override
    public int get(int index) {
        return myIntList.get(index);
    }

    @Override
    public boolean remove(int num) {
        return myIntList.remove(num);
    }

    @Override
    public boolean removeAll(IntegerList list) {
        return myIntList.removeAll(list);
    }

    @Override
    public int size() {
        return myIntList.size();
    }

    /**
     * Return the total added
     * @return
     */
    public int getTotalAdded() {
        return totalAdded;
    }


}