# Sorting-And-Searching-Algorithms

## Search algorithms
There are two types of search algorithms:
* Linear search
* Binary search

### Linear search
> **Algorithm for linear search** 

    for (each item in list) {
      compare search term to current item
      if match,
      save index of matching item
      break
    }

return index of matching item, or -1 if item not found

> **Performance of linear search**
* Best case: The best case occurs when the search term is in the first slot in the array.
* Worst case: The worst case occurs when the search term is in the last slot in the array, or is not in
the array.

### Binary search
> **Algorithm for binary search**

    set first = 1, last = N, mid = N/2
    while (item not found and first < last) {
      compare search term to item at mid
      if match
      save index
      break
      else if search term is less than item at mid,
      set last = mid-1
      else
      set first = mid+1
      set mid = (first+last)/2
    }
    
return index of matching item, or -1 if not found


## Sorting algorithms
How do we put the items in a list in order? There are many different mechanisms that we can use. There are four such algorithms to sorting list:
* Selection sort
* Bubble sort
* Quicksort
* Merge sort

### Selection sort
> **Algorithm for selection sort**

    for i=0 to N-2 {
        set smallest = i
        for j=i+1 to N-1 {
            compare list[smallest] to list[j]
            if list[smallest] == list[j]
            smallest = j
        }
        swap list[i] and list[smallest]
    } 
 
### Bubble sort
> **Algorithm for bubble sort**
   
    for i=N-1 to 2 {
        set swap flag to false
        for j=1 to i {
            if list[j-1] > list[j]
            swap list[j-1] and list[j]
            set swap flag to true
        }
        if swap flag is false, break. The list is sorted.
    }
    
### Quicksort
> **How to implemente it**

    public void quicksort(int[] list, int low, int high) {
        if (low < high) {
            int mid = partition(list,low,high);
            quicksort(list,low,mid-1);
            quicksort(list,mid+1,high);
        }
    }
    
### Merge sort
> **How to implemente it**

    public void mergeSort(int[] list, int low, int high) {
        if (low < high) {
            // find the midpoint of the current array
            int mid = (low + high)/2;
            // sort the first half
            mergeSort(list,low,mid);
            // sort the second half
            mergeSort(list,mid+1,high);
            // merge the halves
            merge(list,low,high);
        }
    }
