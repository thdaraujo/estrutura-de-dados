import java.util.HashMap;
import java.util.Set;

import graph.Edge;
import graph.GraphClassification;
import graph.IGraph;
import graph.Node;

/**
 * 
 */

/**
 * @author thiagoaraujo
 *
 */
public class Graph implements IGraph {

	private GraphClassification graphClassification;
	private HashMap<Node, Node> nodes;
	private HashMap<Edge, Edge> edges;
	
	public Graph(){
		this.setGraphClassification(GraphClassification.NONE);
		this.nodes = new HashMap<Node, Node>();
		this.edges = new HashMap<Edge, Edge>();
	}
	
	/*
	 * Adiciona vértice.
	 */
	public void addNode(Node node){
		this.nodes.put(node, node);
	}
	
	/*
	 * Adiciona aresta ao grafo.
	 */
	public void addEdge(Edge edge){
		//TODO preciso que u e v sejam referencias de itens em this.nodes?
		this.edges.put(edge, edge);
	}
	
	/* (non-Javadoc)
	 * @see graph.IGraph#containsEdge(graph.Edge)
	 * Verifica se o grafo contém a aresta.
	 */
	@Override
	public boolean containsEdge(Edge arg0) {
		return edges.containsKey(arg0);
	}

	/* (non-Javadoc)
	 * @see graph.IGraph#getAdjacentNodes(graph.Node)
	 * Retorna os vértices adjacentes ao vértice passado.
	 */
	@Override
	public Set<Node> getAdjacentNodes(Node arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see graph.IGraph#getNodes()
	 * Retorna todos os vértices do grafo
	 */
	@Override
	public Set<Node> getNodes() {
		return nodes.keySet();
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

}
