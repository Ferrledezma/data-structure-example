package programa.estructura.colas.diseño.implementacion;

import estructuras.lineal.colas.diseño.modelo.QueueInterface;
import programa.estructura.colas.diseño.modelo.QueueProgramModel;
import programa.general.constant.ConstantProgramInputMessage;
/**
 * Clase que define la estructura de un programa para manipulación un servicio de una estructura de cola de tipo String.
 * @author Ledezma
 * */
public class StringQueuProgram extends QueueProgramModel<String> {

	public StringQueuProgram(QueueInterface<String> queue) {
		super(queue);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String generateStructureData() {
		return input.generateString(ConstantProgramInputMessage.STRING_MESSAGE);
	}
}
