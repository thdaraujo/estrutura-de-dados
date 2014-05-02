import java.util.Set;

import generator.IGraphGenerator;
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
public class GraphGenerator implements IGraphGenerator {

	/* (non-Javadoc)
	 * @see generator.IGraphGenerator#beginTest()
	 */
	@Override
	public void beginTest() {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see generator.IGraphGenerator#generateEdge()
	 */
	@Override
	public Edge generateEdge() {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see generator.IGraphGenerator#generateSetOfNodes()
	 */
	@Override
	public Set<Node> generateSetOfNodes() {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see generator.IGraphGenerator#generatesMoreEdges()
	 */
	@Override
	public boolean generatesMoreEdges() {
		// TODO Auto-generated method stub
		return false;
	}

	/* (non-Javadoc)
	 * @see generator.IGraphGenerator#getBaseClassification()
	 */
	@Override
	public GraphClassification getBaseClassification() {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see generator.IGraphGenerator#getBaseGraphToCompare()
	 */
	@Override
	public IGraph getBaseGraphToCompare() {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see generator.IGraphGenerator#getBaseLargestComponentSize()
	 */
	@Override
	public int getBaseLargestComponentSize() {
		// TODO Auto-generated method stub
		return 0;
	}

	/* (non-Javadoc)
	 * @see generator.IGraphGenerator#getBaseNumberOfComplexComponents()
	 */
	@Override
	public int getBaseNumberOfComplexComponents() {
		// TODO Auto-generated method stub
		return 0;
	}

	/* (non-Javadoc)
	 * @see generator.IGraphGenerator#getExpectedNextBaseClassification()
	 */
	@Override
	public GraphClassification getExpectedNextBaseClassification() {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see generator.IGraphGenerator#hasMoreTest()
	 */
	@Override
	public boolean hasMoreTest() {
		// TODO Auto-generated method stub
		return false;
	}

	/* (non-Javadoc)
	 * @see generator.IGraphGenerator#percentSingleComplexComponentConjecture()
	 */
	@Override
	public float percentSingleComplexComponentConjecture() {
		// TODO Auto-generated method stub
		return 0;
	}

	/* (non-Javadoc)
	 * @see generator.IGraphGenerator#percentSmallTreeAndUnicyclic()
	 */
	@Override
	public float percentSmallTreeAndUnicyclic() {
		// TODO Auto-generated method stub
		return 0;
	}

	/* (non-Javadoc)
	 * @see generator.IGraphGenerator#percentUniqueGiantComponent()
	 */
	@Override
	public float percentUniqueGiantComponent() {
		// TODO Auto-generated method stub
		return 0;
	}

}
