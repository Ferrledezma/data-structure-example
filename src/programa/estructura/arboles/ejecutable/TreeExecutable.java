package programa.estructura.arboles.ejecutable;

import estructuras.no_lineal.arboles.TreeStructure;
import programa.estructura.arboles.diseño.implementacion.LongTreeProgram;
import programa.general.constant.ConstantProgramMenuOption;

public class TreeExecutable {

	public static void main(String[] args) {
		TreeStructure<Long> tree = new TreeStructure<>("arbol de numeros reales");
		
		LongTreeProgram program = new LongTreeProgram(tree);
		
		program.runProgram(ConstantProgramMenuOption.TREE_OPTION_MESSAGE);
	}

}
