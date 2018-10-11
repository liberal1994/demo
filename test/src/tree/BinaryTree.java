package tree;

public interface BinaryTree {

    void preOrderTraverse(Node root);

    void inOrderTraverse(Node root);

    void postOrderTraverse(Node root);

    void inOrderByStack(Node root);

    void layerTraverseByQueue(Node root);


}
