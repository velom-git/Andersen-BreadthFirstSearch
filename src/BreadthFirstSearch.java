import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BreadthFirstSearch {

    private Queue<Node> queue;

    public BreadthFirstSearch() {
        queue = new LinkedList<Node>();
    }

    public void compute(Node firstNode) {
        queue.add(firstNode);
        firstNode.checked = true;
        while (!queue.isEmpty()) {
            Node element = queue.remove();
            System.out.println(element.numNode);
            List<Node> neighbours = element.getNeighbours();
            for (Node n : neighbours) {
                if (n != null && !n.checked) {
                    queue.add(n);
                    n.checked = true;
                }
            }
        }
    }

}