package programa.estructura.colas.diseño.implementacion;

import estructuras.lineal.colas.diseño.modelo.QueueInterface;
import programa.estructura.colas.diseño.modelo.QueueProgramModel;
import programa.general.constant.ConstantProgramInputMessage;

/**
 * Clase que define la estructura de un programa para manipulación un servicio de una estructura de cola de tipo Double.
 * @author Ledezma
 * */
public class DoubleQueueProgram extends QueueProgramModel<Double> {

	public DoubleQueueProgram(QueueInterface<Double> queue) {
		super(queue);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Double generateStructureData() {
		return input.generateDouble(ConstantProgramInputMessage.DOUBLE_MESSAGE);
	}
}
