import java.util.Stack;

public class Application {

	public static void main(String[] args) {
		
		//Hard-coding the node data with connections for easy debugging
		Node nodeA = new Node('A');
		Node nodeB = new Node('B');
		Node nodeC = new Node('C');
		Node nodeD = new Node('D');
		Node nodeE = new Node('E');
		Node nodeF = new Node('F');
		Node nodeG = new Node('G');
		Node nodeH = new Node('H');
		Node nodeI = new Node('I');
		
		nodeA.addConnection(nodeD);
		nodeA.addConnection(nodeB);
		
		nodeD.addConnection(nodeC);
		nodeD.addConnection(nodeA);
		
		nodeB.addConnection(nodeA);
		nodeB.addConnection(nodeC);
		
		nodeC.addConnection(nodeD);
		nodeC.addConnection(nodeB);
		nodeC.addConnection(nodeE);
		nodeC.addConnection(nodeF);
		
		nodeE.addConnection(nodeC);
		nodeE.addConnection(nodeF);
		
		nodeF.addConnection(nodeC);
		nodeF.addConnection(nodeE);
		nodeF.addConnection(nodeG);
		
		nodeG.addConnection(nodeF);
		nodeG.addConnection(nodeH);
		nodeG.addConnection(nodeI);
		
		nodeH.addConnection(nodeG);
		nodeH.addConnection(nodeI);
		
		nodeI.addConnection(nodeG);
		nodeI.addConnection(nodeH);
		
		Stack<Node> stack = new Stack<>();
		stack.add(nodeA);
		
		traverse(stack, 1);
	}

	private static void traverse(Stack<Node> stack, int depth) {
		Node current = stack.peek();
		
		System.out.println(current.value+""+depth);
		if ((current == null) || (current.visited))
			return;
		
		current.depthIndex = depth;
		current.visited = true;
		
		if (current.connections.isEmpty()) {
			stack.pop();
		}

		for(Node connection:current.connections) {
			stack.push(connection);
			traverse(stack,depth++);
		}
		
		
	}

	private static void setLowIndex(Stack<Node> stack) {
		
		
	}

}
