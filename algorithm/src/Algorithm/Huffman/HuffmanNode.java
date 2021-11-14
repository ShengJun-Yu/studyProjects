package Algorithm.Huffman;

/**
 * 哈夫曼树节点
 *
 * @param <T>
 */
public class HuffmanNode<T> implements Comparable<HuffmanNode<T>> {
    private T data;
    private int weight;//权值
    private HuffmanNode<T> left;
    private HuffmanNode<T> right;

    public HuffmanNode(T data, int weight) {
        this.data = data;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "data:" + this.data + ",weight:" + this.weight + ";   ";
    }

    @Override
    public int compareTo(HuffmanNode<T> node) {
        if (node.weight > this.weight) {
            return -1;
        } else if (node.weight < this.weight) {
            return 1;
        }
        return 0;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public HuffmanNode<T> getLeft() {
        return left;
    }

    public void setLeft(HuffmanNode<T> left) {
        this.left = left;
    }

    public HuffmanNode<T> getRight() {
        return right;
    }

    public void setRight(HuffmanNode<T> right) {
        this.right = right;
    }

}
