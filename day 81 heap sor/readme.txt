/*


Left child of 1 (index 0)
= element in (2*0+1) index 
= element in 1 index 
= 12


Right child of 1
= element in (2*0+2) index
= element in 2 index 
= 9

Similarly,
Left child of 12 (index 1)
= element in (2*1+1) index
= element in 3 index
= 5

Right child of 12
= element in (2*1+2) index
= element in 4 index
= 6
Let us also confirm that the rules hold for finding parent of any node

Parent of 9 (position 2) 
= (2-1)/2 
= ½ 
= 0.5
~ 0 index 
= 1

Parent of 12 (position 1) 
= (1-1)/2 
= 0 index 
= 1
Understanding this mapping of array indexes to tree positions is critical to understanding how the Heap
Data Structure works and how it is used to implement Heap Sort.

What is Heap Data Structure?
Heap is a special tree-based data structure. A binary tree is said to follow a heap data structure if

it is a complete binary tree
All nodes in the tree follow the property that they are greater than their children i.e. 
the largest element is at the root and both its children and smaller than the root and so on.
Such a heap is called a max-heap. If instead, all nodes are smaller than their children, it is called a min-heap
The following example diagram shows Max-Heap and Min-Heap.

max heap min heap comparison
Max Heap and Min Heap
To learn more about it, please visit Heap Data Structure.

How to "heapify" a tree
Starting from a complete binary tree, we can modify 
it to become a Max-Heap by running a function called heapify on all the non-leaf elements of the heap.

Since heapify uses recursion, it can be difficult to grasp
. So let's first think about how you would heapify a tree with just three elements.

heapify(array)
    Root = array[0]
    Largest = largest( array[0] , array [2*0 + 1]. array[2*0+2])
    if(Root != Largest)
          Swap(Root, Largest)
graph shows how base case of heapify works
Heapify base cases
The example above shows two scenarios - one in which the root is the largest
element and we don't need to do anything. And another in which the root had a larger 
element as a child and we needed to swap to maintain max-heap property.

If you're worked with recursive algorithms before, you've probably identified that this must be the base case.

Now let's think of another scenario in which there is more than one level.

image showing tree data with root element containing two max-heap subtrees
How to heapify root element when its subtrees are already max heaps
The top element isn't a max-heap but all the sub-trees are max-heaps.

To maintain the max-heap property for the entire tree, we will have to keep pushing 2 downwards until it reaches its correct position.

steps to heapify root element when both of its subtrees are already max-heaps
How to heapify root element when its subtrees are max-heaps
Thus, to maintain the max-heap property in a tree where both sub-trees are max-heaps,
we need to run heapify on the root element repeatedly until it is larger than its children or it becomes a leaf node.


We can combine both these conditions in one heapify function as

void heapify(int arr[], int n, int i) {
  // Find largest among root, left child and right child
  int largest = i;
  int left = 2 * i + 1;
  int right = 2 * i + 2;

  if (left < n && arr[left] > arr[largest])
    largest = left;

  if (right < n && arr[right] > arr[largest])
    largest = right;

    // Swap and continue heapifying if root is not largest
    if (largest != i) {
      swap(&arr[i], &arr[largest]);
      heapify(arr, n, largest);
  }
}
This function works for both the base case and for a tree of any size.
We can thus move the root element to the correct position to maintain the
max-heap status for any tree size as long as the sub-trees are max-heaps.

Build max-heap
To build a max-heap from any tree, we can thus start heapifying each sub-tree 
from the bottom up and end up with a max-heap after the function is applied to all the elements including the root element.

In the case of a complete tree, the first index of a non-leaf node is given by n/2 -

1. All other nodes after that are leaf-nodes and thus don't need to be heapified.

So, we can build a maximum heap as

    // Build heap (rearrange array)
    for (int i = n / 2 - 1; i >= 0; i--)
      heapify(arr, n, i);
steps to build max heap for heap sort
Create array and calculate i
steps to build max heap for heap sort
Steps to build max heap for heap sort
steps to build max heap for heap sort
Steps to build max heap for heap sort
steps to build max heap for heap sort
Steps to build max heap for heap sort
As shown in the above diagram, we start by heapifying the lowest smallest
trees and gradually move up until we reach the root element.

If you've understood everything till here, congratulations, you are on your way to mastering the Heap sort.

Working of Heap Sort
Since the tree satisfies Max-Heap property, then the largest item is stored at the root node.
Swap: Remove the root element and put at the end of the array (nth position)
Put the last item of the tree (heap) at the vacant place.
Remove: Reduce the size of the heap by 1.
Heapify: Heapify the root element again so that we have the highest element at root.
The process is repeated until all the items of the list are sorted.
procedures for implementing heap sort
Swap, Remove, and Heapify




Sorted array is
1 5 6 9 10 12 




*/
