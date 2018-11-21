package demo.tree;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class LinkedListTree implements BinaryTree {

    private Node root;

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public int getHeight() {
        return 0;
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public void preOrderTraverse(Node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.getData() + "\t");
        preOrderTraverse(root.getLeftChild());
        preOrderTraverse(root.getRightChild());
    }

    @Override
    public void inOrderTraverse(Node root) {
        if (root == null) {
            return;
        }
        inOrderTraverse(root.getLeftChild());
        System.out.print(root.getData() + "\t");
        inOrderTraverse(root.getRightChild());

    }

    @Override
    public void postOrderTraverse(Node root) {
        if (root == null) {
            return;
        }
        postOrderTraverse(root.getLeftChild());
        postOrderTraverse(root.getRightChild());
        System.out.print(root.getData() + "\t");

    }


    /**
     * 二叉树的层次遍历
     * @param root
     */
    @Override
    public void levelOrderByStack(Node root) {
        if (root==null) {
            return;
        }
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        while(queue.size()!=0){
            int size=queue.size();
            for(int i=0;i<size;i++){
                Node temp=queue.poll();
                System.out.print(temp.getData()+"\t");
                if(temp.getLeftChild()!=null){
                    queue.add(temp.getLeftChild());
                }
                if(temp.getRightChild()!=null){
                    queue.add(temp.getRightChild());
                }

            }
        }

    }

    /**
     * 利用栈实现中序遍历
     * @param root
     */
    @Override
    public void inOrderByStack(Node root) {
        if(root==null){return;}
        Deque<Node> stack=new LinkedList<>();
        Node temp=root;
        while(temp!=null||!stack.isEmpty()){
            while(temp!=null){
                stack.push(temp);
                temp=temp.getLeftChild();
            }
            if(!stack.isEmpty()){
                temp=stack.pop();
                System.out.print(temp.getData()+"\t");
                temp=temp.getRightChild();
            }
        }
    }


}
