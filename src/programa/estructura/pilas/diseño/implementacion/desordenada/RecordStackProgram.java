package programa.estructura.pilas.diseño.implementacion.desordenada;

import estructuras.lineal.pilas.diseño.modelo.StackInterface;
import programa.estructura.pilas.diseño.modelo.StackProgramModel;
import programa.general.dato.PersonRecord;

/**
 * Clase que define la estructura de un programa para manipulación un servicio de una pila de tipo PersonRecord.
 * @author Ledezma
 * */
public class RecordStackProgram extends StackProgramModel<PersonRecord> {

	public RecordStackProgram(StackInterface<PersonRecord> stack) {
		super(stack);
	}

	@Override
	public PersonRecord generateStructureData() {
		return input.generateRecord();
	}
}
