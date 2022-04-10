import java.util.LinkedList;
import java.util.Queue;

public class Application {

	public static void main(String[] args) {

		// Hard-coded values for a tree (So need to get the hassle of getting input)
		Node root = new Node('A');
		root.left = new Node('C');

		root.left.right = new Node('E');
		root.left.left = new Node('G');

		root.left.right.right = new Node('F');
		root.left.right.right.left = root.left.left;

		root.right = new Node('B');
		root.right.right = new Node('D');

		Queue<Node> queue = new LinkedList<>();

		queue.add(root);
		
		traverse(queue);
	}
	
	public static void traverse(Queue<Node> queue) {
		Node current = queue.poll();
		
		if (current == null)
			return;
		
		if(!current.visited)
			System.out.println(current.value);
		
		current.visited = true;
		
		if (current.right != null)
			queue.add(current.right);
		if (current.left != null)
			queue.add(current.left);
		
		traverse(queue);
	}

}
