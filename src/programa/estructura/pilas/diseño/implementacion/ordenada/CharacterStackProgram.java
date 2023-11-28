package programa.estructura.pilas.diseño.implementacion.ordenada;

import estructuras.lineal.pilas.diseño.modelo.StackInterface;
import programa.estructura.pilas.diseño.modelo.StackProgramModel;
import programa.general.constant.ConstantProgramInputMessage;

/**
 * Clase que define la estructura de un programa para manipulación un servicio de una pila de tipo Character.
 * @author Ledezma
 * */
public class CharacterStackProgram extends StackProgramModel<Character> {

	public CharacterStackProgram(StackInterface<Character> stack) {
		super(stack);
	}

	@Override
	public Character generateStructureData() {
		return input.generateCharacter(ConstantProgramInputMessage.CHARACTER_MESSAGE);
	}

}
