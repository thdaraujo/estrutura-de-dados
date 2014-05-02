import generator.IGraphGenerator;
import graph.Edge;
import graph.GraphClassification;
import graph.IGraph;
import graph.Node;

import java.util.Set;

import output.IGraphAnalizer;
import controller.GraphController;


public class GraphControllerImplementation extends GraphController {

	public GraphControllerImplementation(IGraphGenerator generator,
			IGraphAnalizer graphAnalizer) {
		super(generator, graphAnalizer);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected IGraph addEdge(IGraph arg0, Edge arg1) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected GraphClassification classify(IGraph arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected IGraph createGraph(Set<Node> arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected GraphClassification getExpectedNextclassification(IGraph arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected int getSizeOfLargestComponent(IGraph arg0) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	protected int numberOfComplexComponents(IGraph arg0) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	protected float percentSingleComplexComponentConjecture() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	protected float percentSmallTreeAndUnicyclic() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	protected float percentUniqueGiantComponent() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	protected void updatePercentTestValues(IGraph arg0) {
		// TODO Auto-generated method stub

	}

}
