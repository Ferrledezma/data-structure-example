package programa.estructura.pilas.diseño.implementacion.desordenada;

import estructuras.lineal.pilas.diseño.modelo.StackInterface;
import programa.estructura.pilas.diseño.modelo.StackProgramModel;
import programa.general.constant.ConstantProgramInputMessage;

/**
 * Clase que define la estructura de un programa para manipulación un servicio de una pila de tipo String.
 * @author Ledezma
 * */
public class StringStackProgram extends StackProgramModel<String> {

	public StringStackProgram(StackInterface<String> stack) {
		super(stack);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String generateStructureData() {
		return input.generateString(ConstantProgramInputMessage.STRING_MESSAGE);
	}
}
