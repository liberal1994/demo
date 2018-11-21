package demo.tree;

public interface BinaryTree {

    boolean isEmpty();

    int getHeight();

    int size();

    void preOrderTraverse(Node root);

    void inOrderTraverse(Node root);

    void postOrderTraverse(Node root);

    void levelOrderByStack(Node root);

    void inOrderByStack(Node root);

}
