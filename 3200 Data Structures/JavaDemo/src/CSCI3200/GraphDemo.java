package CSCI3200;

public class GraphDemo {
    static int[][] adjacencyMatrix = {{0, 7, 9, 0, 0, 1},
                                     {7, 0, 6, 0, 4, 2},
                                     {9, 6, 0, 4, 2, 0},
                                     {0, 0, 4, 0, 3, 4},
                                     {0, 4, 2, 3, 0, 5},
                                     {1, 2, 0, 4, 5, 0}};

    static char[] arrayVertices = {'A', 'B', 'C', 'D', 'E', 'F'};

    public static void degree (int[][] adjacencyMatrix){
        //display the degree of each vertex. Example, vertex A = 3
        for(int i = 0; i < adjacencyMatrix.length; i++){
            int degree = 0;
            for(int j = 0; j < adjacencyMatrix[i].length; j++){
                if(adjacencyMatrix[i][j] > 0){
                    degree++;
                }
            }
            System.out.println("Vertex " + arrayVertices[i] + " = " + degree);
        }
    }

    public static void edgesList (int[][] adjacencyMatrix){
        //display the edges list for this graph using the
        //adjacency matrix values. Ex, A-B, A-C, A-F
        for(int i = 0; i < adjacencyMatrix.length; i++){
            char homeVertex = arrayVertices[i];
            System.out.print("Vertex '" + homeVertex + "' Adjacency = ");
            for(int j = 0; j < adjacencyMatrix[i].length; j++){
                if(adjacencyMatrix[i][j] > 0){
                    System.out.print(homeVertex + "-" + arrayVertices[j] + " ");
                }
            }
            System.out.println("");
        }
    }

    public static void adjacencyList (int[][] adjacencyMatrix){
        //display the adjacency list for each vertex in the graph
        //using the adjacency matrix values. Ex, A --> B(7)-->C(9)-->F(1)
        //where the values in the parentheses is the weight of the edges.
        for(int i = 0; i < adjacencyMatrix.length; i++){
            char homeVertex = arrayVertices[i];
            System.out.print("Vertex = " + homeVertex);
            for(int j = 0; j < adjacencyMatrix[i].length; j++){
                if(adjacencyMatrix[i][j] > 0){
                    System.out.print(" --> " + arrayVertices[j] + "(" + adjacencyMatrix[i][j] + ")");
                }
            }
            System.out.println("");
        }
    }

    public static void main(String[] args){
        degree(adjacencyMatrix);
        edgesList(adjacencyMatrix);
        adjacencyList(adjacencyMatrix);
    }
}
