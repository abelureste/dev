package OptionalBST;

import java.util.LinkedList;

public class BinarySearchTree_LinkedList {
    protected Node<Integer> root;

    public BinarySearchTree_LinkedList(int element) {
    // create a node using the parameter “element”
        root = new Node<Integer>(element);
    }

    public boolean isRoot(int value) {
    // checks if the value is the root node
        if(root.element == value) return true;
        else return false;
    }

    public Node<Integer> insert(Node<Integer> rt, Node<Integer> add) {
    // insert a node in the left or right subtree.
    // use recursion to ensure the node is placed in the correct
    // position to maintain the characteristics of a binary search tree
        if (rt == null) return add;

        if(add.element < rt.element){
            rt.left = insert(rt.left, add);
        } else if (add.element > rt.element){
            rt.right = insert(rt.right, add);
        }

        return rt;
    }

    public Node<Integer> findmax(Node<Integer> node) {
    // searches the left subtree to
    // return the maximum node
        if(node == null) return null;

        while (node.right != null){
            node = node.right;
        }
        return node;
    }

    public Node<Integer> findmin(Node<Integer> node) {
    // searches the right subtree to return the minimum node
        if(node == null) return null;

        while (node.left != null){
            node = node.left;
        }
        return node;
    }

    public Node<Integer> remove(Node<Integer> temp, int value) {
    // remove a node from the tree. But it should maintain the
    // characteristics of a binary search tree. Use findmin or findmax method
        if(temp == null) return null;

        if(value < temp.element){
            temp.left = remove(temp.left, value);
        } else if (value > temp.element) {
            temp.right = remove(temp.right, value);
        } else {
            if(temp.left == null) return temp.right;
            else if(temp.right == null) return temp.left;

            Node<Integer> minNode = findmin(temp.right);
            temp.element = minNode.element;
            temp.right = remove(temp.right, minNode.element);
        }
        return temp;
    }

    public int parent(Node<Integer> rt, Node<Integer> add) {
    // search the left subtree and right subtree for the node
    // first starting from the root node n(rt). When found return the value of its
    // parent. //Return -1 if the value is not in the tree or the node is root.
        if(rt == null || rt == add) return -1;

        if(rt.left == add || rt.right == add){
            return rt.element;
        }

        if(add.element < rt.element) {
            return parent(rt.left, add);
        } else {
            return parent(rt.right, add);
        }
    }

    public boolean searchNode(Node<Integer> rt, int value) {
    // search the left subtree or right subtree for a value. Note search
    // always start from the root node and returns true if the value is found
    // or false if not found
        if (rt == null) return false;
        if(value == rt.element) return true;

        else if(value < rt.element) return searchNode(rt.left, value);
        else return searchNode(rt.right, value);
    }

    public LinkedList<Node<Integer>> children(Node<Integer> root, int value, LinkedList<Node<Integer>> myList) {
    // checks if the parent node is in the binary tree starting from the root
    // node. If true, then returns a LinkedList with the child nodes).
        if (root == null) return myList;

        if (root.element == value) {
            if (root.left != null) myList.add(root.left);
            if (root.right != null) myList.add(root.right);
        } else if (value < root.element) {
            return children(root.left, value, myList);
        } else {
            return children(root.right, value, myList);
        }

        return myList;
    }
}