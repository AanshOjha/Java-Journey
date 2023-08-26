package LeetCode.DailyStreak;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class UnionFind {
    private int[] parent;

    public UnionFind(int n) {
        parent = new int[n];
        for (int i = 0; i < n; i++)
            parent[i] = i;
    }

    public int findParent(int p) {
        // Find the parent of a node while performing path compression
        return parent[p] == p ? p : (parent[p] = findParent(parent[p]));
    }

    public void union(int u, int v) {
        // Union operation by setting the parent of one node to the other's parent
        int pu = findParent(u), pv = findParent(v);
        parent[pu] = pv;
    }
}

public class FindCriticalAndPseudoCriticalEdges {
    public static List<List<Integer>> findCriticalAndPseudoCriticalEdges(int n, int[][] edges) {
        List<Integer> critical = new ArrayList<>();
        List<Integer> pseudoCritical = new ArrayList<>();

        // Adding edge indices to the edge array
        for (int i = 0; i < edges.length; i++) {
            int[] edge = edges[i];
            edge = Arrays.copyOf(edge, edge.length + 1);
            edge[3] = i;
            edges[i] = edge;
        }

        // Sorting edges based on their weights
        Arrays.sort(edges, (a, b) -> Integer.compare(a[2], b[2]));

        // Calculate the weight of the MST without any edges
        int mstwt = findMST(n, edges, -1, -1);

        // Iterate through the sorted edges to identify critical and pseudo-critical edges
        for (int i = 0; i < edges.length; i++) {
            if (mstwt < findMST(n, edges, i, -1))
                critical.add(edges[i][3]); // The index of the edge is critical
            else if (mstwt == findMST(n, edges, -1, i))
                pseudoCritical.add(edges[i][3]); // The index of the edge is pseudo-critical
        }

        List<List<Integer>> result = new ArrayList<>();
        result.add(critical);
        result.add(pseudoCritical);
        return result;
    }

    private static int findMST(int n, int[][] edges, int block, int e) {
        UnionFind uf = new UnionFind(n);
        int weight = 0;

        if (e != -1) {
            weight += edges[e][2];
            uf.union(edges[e][0], edges[e][1]);
        }

        // Build the MST while avoiding the 'block' edge and including the 'e' edge
        for (int i = 0; i < edges.length; i++) {
            if (i == block)
                continue;

            if (uf.findParent(edges[i][0]) == uf.findParent(edges[i][1]))
                continue;

            uf.union(edges[i][0], edges[i][1]);
            weight += edges[i][2];
        }

        // Check if the MST covers all nodes (connected graph)
        for (int i = 0; i < n; i++) {
            if (uf.findParent(i) != uf.findParent(0))
                return Integer.MAX_VALUE; // Return a large value if not connected
        }

        return weight;
        
    }

    public static void main(String[] args) {
        int [][] edges = {
            {0,1,1},
            {1,2,1},
            {2,3,1},
            {0,3,1}
        };
        System.out.println(findCriticalAndPseudoCriticalEdges(4, edges));
    }
}
