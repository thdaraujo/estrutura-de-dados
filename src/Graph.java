import java.security.InvalidParameterException;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;

import com.sun.tools.internal.ws.wsdl.document.jaxws.Exception;

import graph.Edge;
import graph.GraphClassification;
import graph.IGraph;
import graph.Node;
import helpers.In;

/**
 * 
 */

/**
 * @author thiagoaraujo
 * Based on Algorithms, 4th Edition by Robert Sedgewick and Kevin Wayne.
 *
 */
public class Graph implements IGraph {

	private GraphClassification graphClassification;
	
	private int V; //vertexCount
    private int E; //edgeCount
    private HashMap<Node, LinkedList<Node>> adj;
    private LinkedList<Node> nodes;
    private HashMap<Edge, Edge> edges;
	
	public Graph(){
		this.setGraphClassification(GraphClassification.NONE);
		this.V = 0;
        this.E = 0;
        
        adj = new HashMap<Node, LinkedList<Node>>();
        nodes = new LinkedList<Node>();
        edges = new HashMap<Edge, Edge>();
	}
	
	/**  
     * Initializes a graph from an input stream.
     * The format is the number of vertices <em>V</em>,
     * followed by the number of edges <em>E</em>,
     * followed by <em>E</em> pairs of vertices, with each entry separated by whitespace.
     * @param in the input stream
     * @throws java.lang.IndexOutOfBoundsException if the endpoints of any edge are not in prescribed range
     * @throws java.lang.IllegalArgumentException if the number of vertices or edges is negative
     */
    public Graph(In in) {
        this();
        int E = in.readInt();
        if (E < 0) throw new IllegalArgumentException("Number of edges must be nonnegative");
        for (int i = 0; i < E; i++) {
        	int vLabel = in.readInt();
        	int wLabel = in.readInt();
        	
            Node v = new Node(String.valueOf(vLabel));
            Node w = new Node(String.valueOf(wLabel));
            Edge e = new Edge(v, w);
            addEdge(e);
        }
    }
	
	public int V() {
        return V;
    }

    public int E() {
        return E;
    }
	
	/*
	 * Add vertex
	 */
	public void addNode(Node node){
		this.V++;
		this.nodes.add(node);
		this.adj.put(node, new LinkedList<Node>());
	}
	
	/*
	 * Add edge.
	 */
	public void addEdge(Edge edge){
		if(edge == null) throw new IllegalArgumentException();
		
		Node u = edge.getU(), 
		     v = edge.getV();
		
		if (u == null) throw new IllegalArgumentException();
        if (v == null) throw new IllegalArgumentException();
        
        this.E++;
        
        this.adj.get(u).add(v);
        this.adj.get(v).add(u);
        this.edges.put(edge, edge);
	}
	
	/* (non-Javadoc)
	 * @see graph.IGraph#containsEdge(graph.Edge)
	 * Verifies whether the graph contains the edge or not.
	 */
	@Override
	public boolean containsEdge(Edge arg0) {
		return this.edges.containsKey(arg0);
	}

	/* (non-Javadoc)
	 * @see graph.IGraph#getAdjacentNodes(graph.Node)
	 * Vertices that are adjacent to node.
	 */
	@Override
	public Set<Node> getAdjacentNodes(Node arg0) {
		if(arg0 == null) throw new InvalidParameterException();
		return (Set<Node>) adj.get(arg0);
	}

	/* (non-Javadoc)
	 * @see graph.IGraph#getNodes()
	 * Get all the vertices.
	 */
	@Override
	public Set<Node> getNodes() {
		return (Set<Node>) this.nodes;
	}

	/**
	 * @return the graphClassification
	 */
	public GraphClassification getGraphClassification() {
		return graphClassification;
	}

	/**
	 * @param graphClassification the graphClassification to set
	 */
	public void setGraphClassification(GraphClassification graphClassification) {
		this.graphClassification = graphClassification;
	}
	
	/**
     * Returns a string representation of the graph.
     */
    public String toString() {
        StringBuilder s = new StringBuilder();
        String NEWLINE = System.getProperty("line.separator");
        s.append(this.V + " vertices, " + this.E + " edges " + NEWLINE);
        
        for (Map.Entry<Node, LinkedList<Node>> entry : this.adj.entrySet()) {
            Node key = entry.getKey();
            LinkedList<Node> adjacentList = entry.getValue();
            
            s.append(key.getLabel() + ": ");
            for (Node w : adjacentList) {
                s.append(w.getLabel() + " ");
            }
            s.append(NEWLINE);
        }
        return s.toString();
    }
}
