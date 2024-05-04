import java.util.Scanner;

public class Main {
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        GraphPanel.showGraph();
        Edge[] graph = {
                new Edge(1, 4),
                new Edge(1, 8),
                new Edge(1, 9),
                new Edge(2, 3),
                new Edge(2, 7),
                new Edge(2, 9),
                new Edge(3, 4),
                new Edge(3, 6),
                new Edge(4, 5),
                new Edge(5, 7),
                new Edge(5, 10),
                new Edge(6, 8),
                new Edge(6, 10),
                new Edge(7, 8),
                new Edge(9, 10)
        };
        System.out.print("Масив ребер містить:");
        for (Edge edge : graph) System.out.print(" " + edge);
        System.out.print("\nВведіть початкову вершину: ");
        int v0 = promptVertex();
        System.out.println("Проходження у ширину:");
        breadthFirstTraversal(graph, v0);
    }

    private static int promptVertex() {
        int v0 = -1; do {
            if (sc.hasNextInt()) v0 = sc.nextInt();
            sc.nextLine();
        } while (v0 < 1 || v0 > 10);
        return v0;
    }

    static void breadthFirstTraversal(Edge[] graph, int v0) {
        boolean[] visited = new boolean[graph.length];
        Queue front, pending = new Queue(v0);
        visited[v0-1] = true;
        while (!pending.isEmpty()) {
            front = pending;
            pending = new Queue();
            while (!front.isEmpty()) {
                int v = front.dequeue();
                System.out.print(v + " ");
                for (Edge edge : graph) if (edge.isIncidental(v)) {
                    int next = edge.traverse(v);
                    if (!visited[next-1]){
                        pending.enqueue(next);
                        visited[next-1] = true;
                    }
                }
            }
            System.out.println();
        }
    }
}
