package programa.estructura.arboles.diseño.implementacion;

import estructuras.no_lineal.arboles.TreeStructure;
import programa.estructura.arboles.diseño.modelo.TreeProgramModel;
import programa.general.constant.ConstantProgramInputMessage;
/**
 * Clase que define la estructura de un programa para la manipulación de un servicio una estructura de cola de tipo Double.
 * @author Ledezma
 * */
public class DoubleTreeProgram extends TreeProgramModel<Double> {

	public DoubleTreeProgram(TreeStructure<Double> tree) {
		super(tree);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Double generateStructureData() {
		return input.generateDouble(ConstantProgramInputMessage.DOUBLE_MESSAGE);
	}

}
