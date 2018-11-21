package algorithm.tree.BST;

public class TestBinaryTree {
    public static void main(String[] args) {
        Node<Integer> n7=new Node<>(null,null,7);
        Node<Integer> n2=new Node<>(n7,null,2);
        Node<Integer> n6=new Node<>(null,n2,6);
        Node<Integer> n9=new Node<>(null,null,9);
        Node<Integer> n1=new Node<>(null,null,1);
        Node<Integer> n4=new Node<>(n9,n1,4);
        Node<Integer> n3=new Node<>(n6,n4,3);
        Node<Integer> root=n3;

        BinaryTree demo=new MyBinaryTree();
//        demo.preOrderTraverse(root);
//        System.out.println();
//        demo.inOrderTraverse(root);
//        System.out.println();
//        demo.inOrderByStack(root);
//        System.out.println();
//        demo.postOrderTraverse(root);
//        System.out.println();
//        demo.layerTraverseByQueue(root);

//        demo.hierarchicalLayerTraverse(root);

//        Node<Integer> temp=demo.getNode(9,root);
//        System.out.println(temp.getData());

    }

}
