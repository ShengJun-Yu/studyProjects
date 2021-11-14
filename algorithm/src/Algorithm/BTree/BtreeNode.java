package Algorithm.BTree;

public class BtreeNode {
    int data;
    BtreeNode left;
    BtreeNode right;

    public  BtreeNode(int value){
        this.data=value;
    }
    public BtreeNode(int value, BtreeNode left, BtreeNode right) {
        this.data = value;
        this.left = left;
        this.right = right;
    }
}


