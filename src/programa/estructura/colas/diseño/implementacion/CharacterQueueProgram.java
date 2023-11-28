package programa.estructura.colas.diseño.implementacion;

import estructuras.lineal.colas.diseño.modelo.QueueInterface;
import programa.estructura.colas.diseño.modelo.QueueProgramModel;
import programa.general.constant.ConstantProgramInputMessage;

/**
 * Clase que define la estructura de un programa para manipulación de un servicio de una estructura de cola de tipo Character.
 * @author Ledezma
 * */
public class CharacterQueueProgram extends QueueProgramModel<Character> {

	public CharacterQueueProgram(QueueInterface<Character> queue) {
		super(queue);
	}

	@Override
	public Character generateStructureData() {
		return input.generateCharacter(ConstantProgramInputMessage.CHARACTER_MESSAGE);
	}
}
