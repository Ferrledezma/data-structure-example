package programa.estructura.listas.diseño.implementacion;

import estructuras.lineal.listas.LinkedListInterface;
import programa.estructura.listas.diseño.modelo.LinkedListProgramModel;
import programa.general.dato.PersonRecord;

/**
 * Clase que define la estructura de un programa para manipulación un servicio de una lista enlazada de tipo PersonRecord.
 * @author Ledezma
 * */
public class RecordLinkedListProgram extends LinkedListProgramModel<PersonRecord> {

	public RecordLinkedListProgram(LinkedListInterface<PersonRecord> linkedList) {
		super(linkedList);
	}

	@Override
	public PersonRecord generateStructureData() {
		return input.generateRecord();
	}

}
