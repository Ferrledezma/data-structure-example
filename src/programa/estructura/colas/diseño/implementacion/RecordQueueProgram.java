package programa.estructura.colas.diseño.implementacion;

import estructuras.lineal.colas.diseño.modelo.QueueInterface;
import programa.estructura.colas.diseño.modelo.QueueProgramModel;
import programa.general.dato.PersonRecord;
/**
 * Clase que define la estructura de un programa para manipulación un servicio de una estructura de cola de tipo PersonRecord.
 * @author Ledezma
 * */
public class RecordQueueProgram extends QueueProgramModel<PersonRecord> {

	public RecordQueueProgram(QueueInterface<PersonRecord> queue) {
		super(queue);
		// TODO Auto-generated constructor stub
	}

	@Override
	public PersonRecord generateStructureData() {
		return input.generateRecord();
	}
}
