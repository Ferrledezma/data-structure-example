package programa.estructura.pilas.diseño.implementacion.ordenada;

import estructuras.lineal.pilas.diseño.modelo.StackInterface;
import programa.estructura.pilas.diseño.modelo.StackProgramModel;
import programa.general.constant.ConstantProgramInputMessage;

/**
 * Clase que define la estructura de un programa para manipulación un servicio de una pila de tipo Integer.
 * @author Ledezma
 * */
public class IntegerStackProgram extends StackProgramModel<Integer> {

	public IntegerStackProgram(StackInterface<Integer> stack) {
		super(stack);
	}

	@Override
	public Integer generateStructureData() {
		return input.generateInteger(ConstantProgramInputMessage.INTEGER_MESSAGE);
	}
}
