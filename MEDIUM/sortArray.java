/*
**  Obviously, I can do Arrays.sort() which would be faster than my attempted from-scratch implementation of heapSort, 
**  but it's good experience.
**
**  Runtime: 8 ms, faster than 26.23% of Java online submissions for Sort an Array.
**  Memory Usage: 47.2 MB, less than 39.79% of Java online submissions for Sort an Array.
*/
class Solution {
    public void swap(int[] a, int i1, int i2) {
        int temp = a[i1];
        a[i1] = a[i2];
        a[i2] = temp;
    }
    public int left(int i) { return 2*i + 1; }
    public int right(int i) { return 2*i + 2; }
    
    public void maxHeapify(int[] a, int heapSize, int root) {
        int left = left(root);
        int right = right(root);
        int largerNode = root;
        
        if (left < heapSize && a[left] > a[largerNode])
            largerNode = left;
        if (right < heapSize && a[right] > a[largerNode])
            largerNode = right;
        if (largerNode != root) {
            swap(a, root, largerNode);
            maxHeapify(a, heapSize, largerNode);
        }
    }
    
    public void buildMaxHeap(int[] a) {
        for (int i = a.length/2-1; i > -1; i--) {
            maxHeapify(a, a.length, i);
        }
    }
    
    public void heapSort(int[] a) {
        buildMaxHeap(a);
        int heapSize = a.length;
        for (int i = heapSize-1; i > 0; i--) {
            swap(a, 0, i);
            heapSize--;
            maxHeapify(a, heapSize, 0);
        }
    }
    
    public int[] sortArray(int[] a) {
        heapSort(a);
        return a;
    }
}
