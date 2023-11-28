package programa.estructura.pilas.diseño.implementacion.ordenada;

import estructuras.lineal.pilas.diseño.modelo.StackInterface;
import programa.estructura.pilas.diseño.modelo.StackProgramModel;
import programa.general.constant.ConstantProgramInputMessage;

/**
 * Clase que define la estructura de un programa para manipulación un servicio de una pila de tipo Long.
 * @author Ledezma
 * */
public class LongStackProgram extends StackProgramModel<Long> {

	public LongStackProgram(StackInterface<Long> stack) {
		super(stack);
	}

	@Override
	public Long generateStructureData() {
		return input.generateLong(ConstantProgramInputMessage.LONG_MESSAGE);
	}

}
