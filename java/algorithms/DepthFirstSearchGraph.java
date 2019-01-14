package snippet;

import java.util.LinkedList;
import java.util.Queue;

public class DepthFirstSearchGraph {

	public static void main(String[] args) {

	}

	public static void depthFirstSearch(Node node) {
		if (null == node) {
			return;
		}

		node.visisted = true;
		for (Node child : node.children) {
			if (!child.visisted) {
				node.visisted = true;
				depthFirstSearch(child);
			}
		}
	}

}

class Node {
	boolean visisted;
	Node[] children;
}
