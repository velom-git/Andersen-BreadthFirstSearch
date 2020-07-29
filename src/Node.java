import java.util.ArrayList;
import java.util.List;

public class Node {
    boolean checked = false;
    List<Node> neighbours;
    int numNode;

    Node(int numNode) {
        this.numNode = numNode;
        this.neighbours = new ArrayList<>();
    }

    public void addNeighbours(Node neighbourNode) {
        this.neighbours.add(neighbourNode);
    }

    public List<Node> getNeighbours() {
        return neighbours;
    }

}
