package programa.estructura.arboles.diseño.implementacion;

import estructuras.no_lineal.arboles.TreeStructure;
import programa.estructura.arboles.diseño.modelo.TreeProgramModel;
import programa.general.constant.ConstantProgramInputMessage;
/**
 * Clase que define la estructura de un programa para la manipulación de un servicio una estructura de cola de tipo Integer.
 * @author Ledezma
 * */
public class IntegerTreeProgram extends TreeProgramModel<Integer> {

	public IntegerTreeProgram(TreeStructure<Integer> tree) {
		super(tree);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Integer generateStructureData() {
		return input.generateInteger(ConstantProgramInputMessage.INTEGER_MESSAGE);
	}

}
