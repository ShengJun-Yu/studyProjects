package Algorithm.BTree;

import java.util.LinkedList;
import java.util.Stack;

public class BinaryTree {

    static final int MAX = 1000;
    BtreeNode root;

    public BinaryTree(BtreeNode root) {
        this.root = root;
    }

    /**
     * 二叉数前序遍历（递归）根左右
     *
     * @param node
     */
    private void preOrderTraverse(BtreeNode node) {
        if (node == null)
            return;
        System.out.println(node.data + " ");
        preOrderTraverse(node.left);
        preOrderTraverse(node.right);

    }
    public void preOrder() {
        System.out.println("前后遍历的结果为：");
        preOrderTraverse(root);
        System.out.println();
    }

    /**
     * 二叉数中序遍历（递归）左根右
     *
     * @param node
     */
    private void InOrderTraverse(BtreeNode node) {

        if (node == null)
            return;
        InOrderTraverse(node.left);
        System.out.println(node.data + " ");
        InOrderTraverse(node.right);
    }

    public void InOrder() {
        System.out.println("中序遍历的结果为：");
        InOrderTraverse(root);
        System.out.println();
    }

    /**
     * 二叉数后序遍历（递归）左右根
     *
     * @param node
     */
    private void PostOrderTraverse(BtreeNode node) {

        if (node == null)
            return;
        PostOrderTraverse(node.left);
        PostOrderTraverse(node.right);
        System.out.println(node.data + " ");
    }

    public void PostOrder() {
        System.out.println("后序遍历的结果为：");
        PostOrderTraverse(root);
        System.out.println();
    }

    /**
     * 二叉树层序遍历
     */
    public void IeveIOrder() {
        System.out.println("层序遍历结果为：");
        BtreeNode node = root;
        LinkedList<BtreeNode> list = new LinkedList<>();
        list.add(node);
        while (!list.isEmpty()) {
            node = list.poll();
            System.out.println(node.data + "");
            if (node.left != null)
                list.offer(node.left);
            if (node.right != null)
                list.offer(node.right);
        }
    }

    /**
     * 二叉树前序遍历非递归
     */
    private void preOrderIterator(BtreeNode t) {
        Stack<BtreeNode> stack = new Stack<>();
        while (t != null || !stack.isEmpty()) {
            while (t != null) {
                System.out.println(t.data + " ");
                stack.push(t);
                t = t.left;
            }
            t = stack.pop().right;
        }
    }

    /**
     * 二叉树前序遍历非递归
     */
    private void inOrderIterator(BtreeNode node) {
        Stack<BtreeNode> stack = new Stack<>();
        while (node != null || !stack.isEmpty()) {
            while (node != null) {
                stack.push(node);
                node = node.left;
            }
            node = stack.pop();
            System.out.println(node.data + " ");
            node = node.right;
        }
    }

    /**
     * 层序遍历非递归算法
     */
    public void levelOrder() {
        System.out.println("层序遍历结果为：");
        BtreeNode node = root;
        LinkedList<BtreeNode> list = new LinkedList<>();
        list.add(node);
        while (!list.isEmpty()) {
            node = list.poll();
            System.out.print(node.data + " ");
            if (node.left != null)
                list.offer(node.left);
            if (node.right != null)
                list.offer(node.right);
        }
    }
    /**
     *二叉树后序遍历非递归
     */


    /**
     * 二叉树深度的递归算法
     */
}
