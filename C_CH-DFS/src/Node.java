
public class Node {
	int value;
	Node left;
	Node right;
	boolean visited;
	Node previous;

	public Node(int value) {
		this.value = value;
		this.left = null;
		this.right = null;
		this.visited = false;
		this.previous = null;
	}

}
