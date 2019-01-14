/**
 * 
 */
package snippet;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author alokkavidayal
 *
 */
public class BreadthFirstSearch {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static void breadthFirstSearch(GraphNode node) {

		if (null == node) {
			return;
		}

		Queue<GraphNode> queue = new LinkedList<GraphNode>();
		queue.add(node);

		while (!queue.isEmpty()) {
			GraphNode currentNode = queue.poll();
			currentNode.visited = true;
			for (GraphNode neighbour : currentNode.children) {
				if (!neighbour.visited) {
					queue.add(neighbour);
				}
			}
		}
	}

}

class GraphNode {
	public boolean visited;
	public GraphNode[] children;
}
