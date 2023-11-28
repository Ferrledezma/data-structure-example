package programa.estructura.listas.diseño.implementacion;

import estructuras.lineal.listas.LinkedListInterface;
import programa.estructura.listas.diseño.modelo.LinkedListProgramModel;
import programa.general.constant.ConstantProgramInputMessage;
/**
 * Clase que define la estructura de un programa para manipulación un servicio de una lista enlazada de tipo Character.
 * @author Ledezma
 * */
public class CharacterLinkedListProgram extends LinkedListProgramModel<Character> {

	public CharacterLinkedListProgram(LinkedListInterface<Character> linkedList) {
		super(linkedList);
	}

	@Override
	public Character generateStructureData() {
		return input.generateCharacter(ConstantProgramInputMessage.CHARACTER_MESSAGE);
	}
}
