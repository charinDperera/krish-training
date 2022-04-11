import java.util.ArrayList;
import java.util.List;

public class Node {
	char value;
	List<Node> connections;
	boolean visited;
	int lowestIndex;
	int depthIndex;
	
	public Node(char value) {
		this.value = value;
		connections = new ArrayList<>();
	}
	
	public void addConnection(Node node) {
		connections.add(node);
	}
}
