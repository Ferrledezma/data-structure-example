package programa.estructura.listas.diseño.implementacion;

import estructuras.lineal.listas.LinkedListInterface;
import programa.estructura.listas.diseño.modelo.LinkedListProgramModel;
import programa.general.constant.ConstantProgramInputMessage;

/**
 * Clase que define la estructura de un programa para manipulación un servicio de una lista enlazada de tipo Double.
 * @author Ledezma
 * */
public class DoubleLinkedListProgram extends LinkedListProgramModel<Double> {

	public DoubleLinkedListProgram(LinkedListInterface<Double> linkedList) {
		super(linkedList);
	}

	@Override
	public Double generateStructureData() {
		return input.generateDouble(ConstantProgramInputMessage.DOUBLE_MESSAGE);
	}

}
