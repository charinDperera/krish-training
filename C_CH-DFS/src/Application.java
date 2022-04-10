import java.util.Stack;

public class Application {

	public static void main(String[] args) {
		Node root = new Node(0);

		root.left = new Node(3);

		root.left.left = new Node(7);
		root.left.left.right = new Node(4);

		root.left.right = new Node(5);
		root.left.right.right = new Node(6);
		root.left.right.right.right = new Node(2);
		root.left.right.right.right.left = new Node(1);

		Stack<Node> stack = new Stack<>();

		stack.add(root);
		traverse(stack);
	}

	public static void traverse(Stack<Node> stack) {
		Node current = stack.peek();

		if ((current == null) || (current.visited))
			return;

		System.out.println(current.value);
		
		current.visited = true;
		if ((current.left == null) && (current.right == null)) {
			stack.pop();
		}

		if (current.right != null) {
			stack.push(current.right);
			traverse(stack);
		}
		if (current.left != null) {
			stack.push(current.left);
			traverse(stack);
		}
	}

}
