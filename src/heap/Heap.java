/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package heap;

/**
 *
 * @author Kyle
 */
public class Heap {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        int[] a = new int[]{5, 9, 4, 12, 22, 13, 6, 1};
        MaxHeap maxHeap = new MaxHeap(a);
        maxHeap.printHeap();
        maxHeap.buildMaxHeap();
        maxHeap.printHeap();
        maxHeap.extractMax();
        maxHeap.printHeap();
        maxHeap.insert(7);
        maxHeap.printHeap();
        
        int[] b = new int[]{2, 4, 5, 1, 6, 7, 8};
        Example maxHeap2 = new Example(b);
        maxHeap2.printHeap();
        maxHeap2.buildMaxHeap();
        maxHeap2.printHeap();
        maxHeap2.extractMax();
        maxHeap2.printHeap();
        maxHeap2.insert(12);
        maxHeap2.printHeap();
    }
}
