import java.net.URL;

import generator.IGraphGenerator;
import helpers.In;
import output.IGraphAnalizer;
import controller.GraphController;

/**
 * 
 */

/**
 * @author thiagoaraujo
 *
 */
public class GraphControllerTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		printProjectName();
		String testFile = null;
		
		if(args.length > 0){
			testFile = args[0];
		}
		else{
			URL fileURL = GraphControllerTest.class.getClass().getResource("/res/tiny.txt");
			testFile = fileURL.getPath();
			System.out.println("Usando arquivo de teste: " + testFile);
		}
		runTest(testFile);
	}
	
	private static void runTest(String testFile){
		IGraphGenerator generator = new GraphGenerator();
		IGraphAnalizer analyzer = new GraphAnalyzer();
		GraphController graphController = new GraphControllerImplementation(generator, 
				analyzer);
		
		if(testFile != null){
			In in = new In(testFile);
	        Graph G = new Graph(in);
	        System.out.println(G.toString());
		}
	}

	private static void printProjectName() {
		System.out.println("## EP3 - Giant Component ##");
		System.out.println("##### Thiago Araujo #######");
		System.out.println("###########################");
		System.out.println("");
	}

}
