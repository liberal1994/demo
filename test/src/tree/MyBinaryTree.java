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
        System.out.print(root.getData() + "\t");
        preOrderTraverse(root.getLeft());
        preOrderTraverse(root.getRight());
    }

    @Override
    public void inOrderTraverse(Node root) {
        if (root == null) {
            return;
        }
        inOrderByStack(root.getLeft());
        System.out.print(root.getData() + "\t");
        inOrderByStack(root.getRight());

    }

    @Override
    public void postOrderTraverse(Node root) {
        if (root == null) {
            return;
        }
        postOrderTraverse(root.getLeft());
        postOrderTraverse(root.getRight());
        System.out.print(root.getData() + "\t");
    }

    /**
     * 栈实现中序遍历
     *
     * @param root
     */
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
                System.out.print(curr.getData() + "\t");
                temp = curr.getRight();
            }
        }
    }

    /**
     * 队列实现层序遍历
     *
     * @param root
     */
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
                System.out.print(temp.getData() + "\t");
                if (temp.getLeft() != null) {
                    queue.offer(temp.getLeft());
                }
                if (temp.getRight() != null) {
                    queue.offer(temp.getRight());
                }

            }
        }


    }

    /**
     * 层序遍历并按层次输出
     * 通过加入两个零时变量实现
     *
     * @param root
     * @count：一次while循环需要poll的节点个数
     * @num：统计poll出节点的所有子节点，并在while循环后赋值给count，自身重置
     */
    @Override
    public void hierarchicalLayerTraverse(Node root) {
        if (root == null) {
            return;
        }
        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);
        int count = 1;
        int num = 0;
        while (!queue.isEmpty()) {

            while (count > 0) {
                Node temp = queue.poll();
                System.out.print(temp.getData() + "\t");
                if (temp.getLeft() != null) {
                    queue.offer(temp.getLeft());
                    num++;
                }
                if (temp.getRight() != null) {
                    queue.offer(temp.getRight());
                    num++;
                }
                count--;
            }
            System.out.println();
            count = num;
            num = 0;
        }
    }

    /**
     * 获取中序后继节点
     *
     * @param p
     * @return
     */
    @Override
    public Node successor(Node p) {
        if (null == p) {
            return null;
        }
        if (null != p.getRight()) {
            Node temp = p.getRight();
            while (null != temp.getLeft()) {
                temp = temp.getLeft();
            }
            return temp;
        }

        return null;
    }

    /**
     * 获取中序前驱节点，与上一个方法对称
     *
     * @param root
     * @return
     */
    @Override
    public Node getLast(Node root) {
        if (null == root || null == root.getLeft()) {
            return null;
        }
        Node temp = root.getLeft();
        while (null != temp.getRight()) {
            temp = temp.getRight();
        }
        return temp;
    }

    /**
     * 只在类BST（AVL，RBT）中实现，普通二叉树没有实现排序（中序遍历结果是有序数组）
     */
//    @Override
//    public <T extends Comparable<T>> Node getNode(T key, Node root) {
//        if (null == root) {
//            return null;
//        }
//        if (key.compareTo((T) root.getData()) == 0) {
//            return root;
//        } else if (key.compareTo((T) root.getData()) < 0) {
//            return getNode(key, root.getLeft());
//        } else {
//            return getNode(key, root.getRight());
//        }
//    }

}
