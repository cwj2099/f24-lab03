import { SortedIntList } from './h/SortedIntListLibrary.js'

/**
 * InheritanceSortedIntList -- a variant of a SortedIntList that keeps
 * count of the number of attempted element insertions (not to be confused
 * with the current size, which goes down when an element is removed)
 * and exports an accessor (totalAdded) for this count.
 *
 * @author Nora Shoemaker
 *
 */

class InheritanceSortedIntList extends SortedIntList {
  // Write your implementation below with API documentation

  //Record the total add
  totalAdded: number = 0

  add(num: number): boolean {
      let result:boolean = super.add(num);
      if(result) this.totalAdded ++;
      return result;
  }

  getTotalAdded(): number{
    return this.totalAdded;
  }
}

export { InheritanceSortedIntList }
