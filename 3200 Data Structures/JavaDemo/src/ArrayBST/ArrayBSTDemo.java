package ArrayBST;

public class ArrayBSTDemo {
    public static void main(String[] args) {
        //Create ArrayBST object. Size of 1D array is seven(7)
        ArrayBST bst = new ArrayBST(7);

        //Insert {2, 3, 4, 5, 6, 7, 8} into binary search tree.
        int[] values = {2, 3, 4, 5, 6, 7, 8};
        for (int v : values) {
            bst.insert(v);
        }

        //Draw binary tree using approriate method.
        bst.drawTree();

        //Call appropriate method to find and display parent index of node with value 6.
        System.out.println("\nParent index of 6: " + bst.parentIndex(6));

        //Call appropriate methods to find and display left and right child indices for the value 4.
        System.out.println("Left child index of 4: " + bst.leftChildIndex(4));
        System.out.println("Right child index of 4: " + bst.rightChildIndex(4));
    }
}
