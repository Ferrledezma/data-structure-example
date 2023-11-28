package programa.estructura.listas.diseño.implementacion;

import estructuras.lineal.listas.LinkedListInterface;
import programa.estructura.listas.diseño.modelo.LinkedListProgramModel;
import programa.general.constant.ConstantProgramInputMessage;

/**
 * Clase que define la estructura de un programa para manipulación un servicio de una lista enlazada de tipo String.
 * @author Ledezma
 * */
public class StringLinkedListProgram extends LinkedListProgramModel<String> {

	public StringLinkedListProgram(LinkedListInterface<String> linkedList) {
		super(linkedList);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String generateStructureData() {
		return input.generateString(ConstantProgramInputMessage.STRING_MESSAGE);
	}

}
