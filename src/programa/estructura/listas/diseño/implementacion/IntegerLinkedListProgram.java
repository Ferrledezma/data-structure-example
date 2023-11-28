package programa.estructura.listas.diseño.implementacion;

import estructuras.lineal.listas.LinkedListInterface;
import programa.estructura.listas.diseño.modelo.LinkedListProgramModel;
import programa.general.constant.ConstantProgramInputMessage;

/**
 * Clase que define la estructura de un programa para manipulación un servicio de una lista enlazada de tipo Integer.
 * @author Ledezma
 * */
public class IntegerLinkedListProgram extends LinkedListProgramModel<Integer> {

	public IntegerLinkedListProgram(LinkedListInterface<Integer> linkedList) {
		super(linkedList);
	}

	@Override
	public Integer generateStructureData() {
		return input.generateInteger(ConstantProgramInputMessage.INTEGER_MESSAGE);
	}

}
