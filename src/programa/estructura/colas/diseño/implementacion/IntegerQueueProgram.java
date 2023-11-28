package programa.estructura.colas.diseño.implementacion;

import estructuras.lineal.colas.diseño.modelo.QueueInterface;
import programa.estructura.colas.diseño.modelo.QueueProgramModel;
import programa.general.constant.ConstantProgramInputMessage;

/**
 * Clase que define la estructura de un programa para manipulación un servicio de una estructura de cola de tipo Integer.
 * @author Ledezma
 * */
public class IntegerQueueProgram extends QueueProgramModel<Integer> {

	public IntegerQueueProgram(QueueInterface<Integer> queue) {
		super(queue);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Integer generateStructureData() {
		return input.generateInteger(ConstantProgramInputMessage.INTEGER_MESSAGE);
	}
}
