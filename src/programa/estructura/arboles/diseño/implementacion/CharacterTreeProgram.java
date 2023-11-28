package programa.estructura.arboles.diseño.implementacion;

import estructuras.no_lineal.arboles.TreeStructure;
import programa.estructura.arboles.diseño.modelo.TreeProgramModel;
import programa.general.constant.ConstantProgramInputMessage;
/**
 * Clase que define la estructura de un programa para la manipulación de un servicio una estructura de cola de tipo Character.
 * @author Ledezma
 * */
public class CharacterTreeProgram extends TreeProgramModel<Character> {

	public CharacterTreeProgram(TreeStructure<Character> tree) {
		super(tree);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Character generateStructureData() {
		return input.generateCharacter(ConstantProgramInputMessage.CHARACTER_MESSAGE);
	}

}
