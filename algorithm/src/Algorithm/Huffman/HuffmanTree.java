package Algorithm.Huffman;

import java.util.*;

public class HuffmanTree<T> {

    /**
     * 构造哈夫曼树
     *
     * @param nodes
     * @param <T>
     * @return
     */
    public static <T> HuffmanNode<T> createHuffmanTree(List<HuffmanNode<T>> nodes) {
        while (nodes.size() > 1) {
            Collections.sort(nodes);
            HuffmanNode<T> left = nodes.get(0);
            HuffmanNode<T> right = nodes.get(1);
            HuffmanNode<T> parent = new HuffmanNode<T>(null, left.getWeight()
                    + right.getWeight());
            parent.setLeft(left);
            parent.setRight(right);
            nodes.remove(left);
            nodes.remove(right);
            nodes.add(parent);
        }
        return nodes.get(0);
    }

    public static <T> List<HuffmanNode<T>> levelOrderTraverse(HuffmanNode<T> root) {
        List<HuffmanNode<T>> list = new ArrayList<HuffmanNode<T>>();
        Queue<HuffmanNode<T>> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            HuffmanNode<T> pHuffmanNode = queue.poll();
            list.add(pHuffmanNode);
            if (pHuffmanNode.getLeft() != null) {
                queue.add(pHuffmanNode.getLeft());
            }
            if (pHuffmanNode.getRight() != null) {
                queue.add(pHuffmanNode.getRight());
            }
        }
        return list;
    }

}