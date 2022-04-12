import java.util.ArrayList;
import java.util.List;

public class Node {
	char value;
	Node left;
	Node right;
	Node previous;
	Node backEdge;
	boolean visited;
	int lowestIndex;
	int depthIndex;

	public Node(char value) {
		this.value = value;
		left = null;
		right = null;
		previous = null;
		backEdge = null;
		visited = false;
	}
}
