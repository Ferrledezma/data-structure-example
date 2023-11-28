package programa.estructura.arboles.diseño.implementacion;

import estructuras.no_lineal.arboles.TreeStructure;
import programa.estructura.arboles.diseño.modelo.TreeProgramModel;
import programa.general.constant.ConstantProgramInputMessage;
/**
 * Clase que define la estructura de un programa para la manipulación de un servicio una estructura de cola de tipo Long.
 * @author Ledezma
 * */
public class LongTreeProgram extends TreeProgramModel<Long> {

	public LongTreeProgram(TreeStructure<Long> tree) {
		super(tree);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Long generateStructureData() {
		return input.generateLong(ConstantProgramInputMessage.LONG_MESSAGE);
	}

}
