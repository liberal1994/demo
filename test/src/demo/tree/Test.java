package demo.tree;

public class Test {
    public static void main(String[] args) {
        Node n7=new Node(7,null,null);
        Node n9=new Node(9,null,null);
        Node n1=new Node(1,null,null);
        Node n2=new Node(2,n7,null);
        Node n6=new Node(6,null,n2);
        Node n4=new Node(4,n9,n1);
        Node n3=new Node(3,n6,n4);
        LinkedListTree demo=new LinkedListTree();
//        demo.preOrderTraverse(n3);
//        System.out.println();
//        demo.inOrderTraverse(n3);
//        System.out.println();
//        demo.postOrderTraverse(n3);
//        System.out.println();
//        demo.levelOrderByStack(n3);
//        System.out.println();
        demo.inOrderByStack(n3);

    }

}
