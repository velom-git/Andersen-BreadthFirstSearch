public class Main {
    public static void main(String arg[]) {

        BreadthFirstSearch bfs = new BreadthFirstSearch();

        Node node4 = new Node(4);
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node6 = new Node(6);
        Node node5 = new Node(5);
        Node node7 = new Node(7);

        node1.addNeighbours(node2);
        node1.addNeighbours(node4);
        node2.addNeighbours(node3);
        node2.addNeighbours(node4);
        node2.addNeighbours(node6);
        node3.addNeighbours(node4);
        node3.addNeighbours(node5);
        node4.addNeighbours(node7);
        node5.addNeighbours(node4);
        node6.addNeighbours(node4);

        bfs.compute(node1);

    }
}
