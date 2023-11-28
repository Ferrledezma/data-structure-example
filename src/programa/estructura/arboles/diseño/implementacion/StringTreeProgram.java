package programa.estructura.arboles.diseño.implementacion;

import estructuras.no_lineal.arboles.TreeStructure;
import programa.estructura.arboles.diseño.modelo.TreeProgramModel;
import programa.general.constant.ConstantProgramInputMessage;
/**
 * Clase que define la estructura de un programa para la manipulación de un servicio una estructura de cola de tipo String.
 * @author Ledezma
 * */
public class StringTreeProgram extends TreeProgramModel<String> {

	public StringTreeProgram(TreeStructure<String> tree) {
		super(tree);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String generateStructureData() {
		return input.generateString(ConstantProgramInputMessage.STRING_MESSAGE);
	}

}
