package programa.estructura.colas.diseño.implementacion;

import estructuras.lineal.colas.diseño.modelo.QueueInterface;
import programa.estructura.colas.diseño.modelo.QueueProgramModel;
import programa.general.constant.ConstantProgramInputMessage;
/**
 * Clase que define la estructura de un programa para manipulación un servicio de una estructura de cola de tipo Long.
 * @author Ledezma
 * */
public class LongQueueProgram extends QueueProgramModel<Long> {

	public LongQueueProgram(QueueInterface<Long> queue) {
		super(queue);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Long generateStructureData() {
		return input.generateLong(ConstantProgramInputMessage.LONG_MESSAGE);
	}
}
