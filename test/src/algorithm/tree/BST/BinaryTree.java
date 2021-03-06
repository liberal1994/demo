package algorithm.tree.BST;

public interface BinaryTree {

    void preOrderTraverse(Node root);

    void inOrderTraverse(Node root);

    void postOrderTraverse(Node root);

    void inOrderByStack(Node root);

    void layerTraverseByQueue(Node root);

    void hierarchicalLayerTraverse(Node root);

    Node successor(Node root);

    Node getLast(Node root);

//    <T extends Comparable<T>> Node getNode(T key, Node root);
}
