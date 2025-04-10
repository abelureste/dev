package ArrayBST;

public class ArrayBST {
    private int[] arrayTree; //Tree stored as array
    private int nodes;           //Number of nodes

    public ArrayBST(int size) {
        //Create an array based on size parameter.
        arrayTree = new int[size];
        nodes = 0;
    }

    public boolean isFull() {
        //Array is full if the number of nodes equal to the size of the array.
        return nodes == arrayTree.length;
    }

    public int inTree(int value) {
        //Checks if the value is in the tree by looking at all the elements in the array.
        for (int i = 0; i < arrayTree.length; i++) {
            if (arrayTree[i] == value) {
                return i;
            }
        }
        //Returns false if value is not in binary search tree.
        return -1;
    }

    public void insert(int value) {
        //Checks if tree is full before inserting a new node.
        if (isFull() == true) {
            System.out.println("Tree is full.");
            return;
        }
        //Checks if the value is already in the tree.
        if (inTree(value) != -1) {
            System.out.println("Value is already in the tree.");
            return;
        }
        //Inserts value into tree
        arrayTree[nodes] = value;
        nodes++;
    }


    public void drawTree() {
        //Check if there are no nodes in tree.
        if (nodes == 0) {
            System.out.println("Tree is empty.");
            return;
        }

        //Draws tree
        int level = 0;
        int index = 0;

        while (index < nodes) {
            int nodesAtLevel = (int) Math.pow(2, level);
            System.out.print("Level " + level + " = ");
            for (int i = 0; i < nodesAtLevel && index < nodes; i++) {
                System.out.print(arrayTree[index] + " ");
                index++;
            }
            System.out.println();
            level++;
        }
    }

    public int getIndex(int value) {
        //Return the index of the value in the ArrayTree 
        for(int i = 0; i < nodes; i++){
            if(arrayTree[i] == value){
                return i;
            }
        }
        return -1;
    }

    public int leftChildIndex(int value) {
        //Check if the value is in the tree. If the value is in the tree find its index.
        //Return the index of the left child using the index of the value in the equation
        //2*(k)+1
        int index = getIndex(value);
        if (index == -1) {
            return -1; //Value not found
        }
        int leftIndex = 2 * index + 1;
        if (leftIndex >= nodes) {
            return -2; //No left child
        }
        return leftIndex;
    }

    public int rightChildIndex(int value) {
        //Check if the value is in the tree. If the value is in the tree find its index.
        //Return the index of the right child using the index of the value in the equation
        //2*(k)+2
        int index = getIndex(value);
        if (index == -1) {
            return -1; //Value not found
        }
        int rightIndex = 2 * index + 2;
        if (rightIndex >= nodes) {
            return -3; //No right child
        }
        return rightIndex;
    }

    public int parentIndex(int value) {
        //Check if the value is in the tree and if the value is the parent node.
        //Return the index of the parent using the index of the value in the equation
        //(k-1)/2
        int index = getIndex(value);
        if (index == -1) {
            return -1; //Value not found
        }
        if (index == 0) {
            return -4; //Root node has no parent
        }
        return (index - 1) / 2;
    }
}

