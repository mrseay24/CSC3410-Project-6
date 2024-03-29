/*        CSC3410 ‐Spring 2015
 *        Sidney Seay ‐sseay5@student.gsu.edu
 *        DateDue: 04‐27‐2015
 *        Assignment: 6, Dictionary ADT Code
 *        File(s): BinaryTree.java, Dictionary.java, Entry.java, Node.java, TestDict.java, TreeDictionary.java
 /*
  * 
  */
// The nodes of the dictionary tree are <key, value> pairs
class Node<K extends Comparable<K>, V> {

    // The necessary class members
    // The parent reference points to the parent of each node
    // and it's null for root of the dictionary tree
    Entry<K, V> entry;
    Node<K, V> parent;
    Node<K, V> leftChild;
    Node<K, V> rightChild;

    Node(Entry<K, V> entry) {
        this(entry, null, null, null);
    }

    Node(Entry<K, V> entry, Node<K, V> parent) {
        this(entry, parent, null, null);
    }

    Node(Entry<K, V> entry, Node<K, V> parent,
            Node<K, V> left, Node<K, V> right) {
        this.entry = entry;
        this.parent = parent;
        leftChild = left;
        rightChild = right;
    }
    
    // returns true if this node is a leaf
    public boolean isLeaf() {
        throw new UnsupportedOperationException("Not implemented yet");
    }
}
