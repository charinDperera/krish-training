import java.lang.System.Logger;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Application {

	private static List<Node> spanningTree = new ArrayList<>();

	public static void main(String[] args) {

		// Hard-coding the node data with connections for easy debugging
		Node nodeA = new Node('A');
		Node nodeB = new Node('B');
		Node nodeC = new Node('C');
		Node nodeD = new Node('D');
		Node nodeE = new Node('E');
		Node nodeF = new Node('F');
		Node nodeG = new Node('G');
		Node nodeH = new Node('H');
		Node nodeI = new Node('I');

		nodeA.left = (nodeD);
		nodeA.right = (nodeB);

		nodeD.right = (nodeC);

		nodeB.left = (nodeC);

		nodeC.left = (nodeE);
		nodeC.right = (nodeF);

		nodeE.right = (nodeF);

		nodeF.right = (nodeG);

		nodeG.right = (nodeI);
		nodeG.left = (nodeH);

		nodeH.right = (nodeI);

		Stack<Node> stack = new Stack<>();
		stack.add(nodeA);

		traverse(stack);

//		test();

		findArticulationPoints();
	}

	private static void setLowIndex() {
		for (Node current : spanningTree) {
			if (current.depthIndex == 1)
				current.lowestIndex = 1;
			else {
				
			}
		}

	}

	private static void findArticulationPoints() {
		for (Node current : spanningTree) {
			if (current.depthIndex != 1)
				if (current.lowestIndex >= current.previous.depthIndex)
					System.out.println("[" + current.value + "] is ana articulation point");
		}
	}

	static int depth = 1;

	private static void traverse(Stack<Node> stack) {
		Node current = stack.peek();

		if ((current == null) || (current.visited)) {
			return;
		}

		current.depthIndex = depth++;
		current.visited = true;
		spanningTree.add(current);

		if (current.left != null) {
			current.left.previous = current;
			stack.push(current.left);
			traverse(stack);
		} else if (current.right != null) {
			current.right.previous = current;
			stack.push(current.right);
			traverse(stack);
		}

		try {
			if ((!current.previous.previous.right.visited)) {
				current.previous.previous.right.previous = current;
				stack.push(current.previous.previous.right);
				traverse(stack);
			}
		} catch (NullPointerException e) {}

		System.out.println("Balls "+ current.value);
		if ((current.right != null) && (current.right.previous != current))
			current.right.backEdge = current;

		if ((current.left != null) && (current.left.previous != current))
			current.left.backEdge = current;

		
		stack.pop();
	}

//	private static void test() {
//		for (Node current : spanningTree) {
//			System.out.print(current.value + "[" + current.depthIndex + "]");
//			if (current.previous != null)
//				System.out.print(" Previous = " + current.previous.value);
//			if (current.backEdge != null)
//				System.out.print(" Backedge = " + current.backEdge.value);
//			System.out.println("");
//		}
//
//	}

}
