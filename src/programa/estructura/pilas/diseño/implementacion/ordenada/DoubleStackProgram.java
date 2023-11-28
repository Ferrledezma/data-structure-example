package programa.estructura.pilas.diseño.implementacion.ordenada;

import estructuras.lineal.pilas.diseño.modelo.StackInterface;
import programa.estructura.pilas.diseño.modelo.StackProgramModel;
import programa.general.constant.ConstantProgramInputMessage;

/**
 * Clase que define la estructura de un programa para manipulación un servicio de una pila de tipo Double.
 * @author Ledezma
 * */
public class DoubleStackProgram extends StackProgramModel<Double> {

	public DoubleStackProgram(StackInterface<Double> stack) {
		super(stack);
	}

	@Override
	public Double generateStructureData() {
		return input.generateDouble(ConstantProgramInputMessage.DOUBLE_MESSAGE);
	}
}
