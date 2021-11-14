package Algorithm.Huffman;

import java.util.ArrayList;
import java.util.List;


public class HuffmanTreeTest {

    public static void main(String[] args) {
        List<HuffmanNode<String>> nodes = new ArrayList<HuffmanNode<String>>();
        nodes.add(new HuffmanNode<String>("b", 5));
        nodes.add(new HuffmanNode<String>("a", 7));
        nodes.add(new HuffmanNode<String>("d", 2));
        nodes.add(new HuffmanNode<String>("c", 4));
        HuffmanNode<String> root = HuffmanTree.createHuffmanTree(nodes);
        System.out.println(HuffmanTree.levelOrderTraverse(root));
    }

}
