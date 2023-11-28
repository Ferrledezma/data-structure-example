package programa.estructura.listas.diseño.implementacion;

import estructuras.lineal.listas.LinkedListInterface;
import programa.estructura.listas.diseño.modelo.LinkedListProgramModel;
import programa.general.constant.ConstantProgramInputMessage;

/**
 * Clase que define la estructura de un programa para manipulación un servicio de una lista enlazada de tipo Long.
 * @author Ledezma
 * */
public class LongLinkedListProgram extends LinkedListProgramModel<Long> {

	public LongLinkedListProgram(LinkedListInterface<Long> linkedList) {
		super(linkedList);
	}

	@Override
	public Long generateStructureData() {
		return input.generateLong(ConstantProgramInputMessage.LONG_MESSAGE);
	}

}
