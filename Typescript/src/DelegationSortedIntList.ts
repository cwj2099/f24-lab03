/**
 * DelegationSortedIntList -- a variant of a SortedIntList that keeps
 * count of the number of attempted element insertions (not to be confused
 * with the current size, which goes down when an element is removed)
 * and exports an accessor (totalAdded) for this count.
 *
 * @author Nora Shoemaker
 *
 */

import { IntegerList } from "./IntegerList.js"
import { SortedIntList } from "./h/SortedIntListLibrary.js"


class DelegationSortedIntList implements IntegerList{

  myList: SortedIntList = new SortedIntList();
  totalAdded: number = 0;

  add(num: number): boolean{
    let result:boolean = this.myList.add(num)
    if(result) this.totalAdded ++;
    return result;
  }

  addAll(list: IntegerList): boolean{
    let result:boolean = this.myList.addAll(list)
    if(result) this.totalAdded += list.size()
    return result;
  }

  get(index: number): number{
    return this.myList.get(index)
  }

  remove(num: number): boolean{
    return this.myList.remove(num)
  }

  removeAll(list: IntegerList): boolean{
    return this.myList.removeAll(list)
  }

  size(): number{
    return this.myList.size()
  }

  getTotalAdded(): number{
    return this.totalAdded;
  }
  // Write your implementation below with API documentatioin

}

export { DelegationSortedIntList }
