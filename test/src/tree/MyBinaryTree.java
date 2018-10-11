package tree;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class MyBinaryTree implements BinaryTree {

    private Node root;

    @Override
    public void preOrderTraverse(Node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.getData()+"\t");
        preOrderTraverse(root.getLeft());
        preOrderTraverse(root.getRight());
    }

    @Override
    public void inOrderTraverse(Node root) {
        if (root == null) {
            return;
        }
        inOrderByStack(root.getLeft());
        System.out.print(root.getData()+"\t");
        inOrderByStack(root.getRight());

    }

    @Override
    public void postOrderTraverse(Node root) {
        if (root == null) {
            return;
        }
        postOrderTraverse(root.getLeft());
        postOrderTraverse(root.getRight());
        System.out.print(root.getData()+"\t");
    }

    @Override
    public void inOrderByStack(Node root) {
        if (root == null) {
            return;
        }
        Deque<Node> stack = new LinkedList<>();
        Node temp = root;
        while (temp != null || !stack.isEmpty()) {
            while (temp != null) {
                stack.push(temp);
                temp = temp.getLeft();
            }
            if (!stack.isEmpty()) {
                Node curr = stack.pop();
                System.out.print(curr.getData()+"\t");
                temp = curr.getRight();
            }
        }
    }

    @Override
    public void layerTraverseByQueue(Node root) {
        if (root == null) {
            return;
        }
        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                Node temp = queue.poll();
                System.out.print(temp.getData()+"\t");
                if (temp.getLeft() != null) {
                    queue.offer(temp.getLeft());
                }
                if (temp.getRight() != null) {
                    queue.offer(temp.getRight());
                }

            }
        }


    }
}
