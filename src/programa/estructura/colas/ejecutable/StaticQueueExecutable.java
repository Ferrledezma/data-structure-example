package programa.estructura.colas.ejecutable;

import estructuras.lineal.colas.diseño.implementacion.estatica.StaticQueue;
import programa.estructura.colas.diseño.implementacion.DoubleQueueProgram;
import programa.general.constant.ConstantProgramMenuOption;
import programa.general.entrada_datos.GenerateData;

public class StaticQueueExecutable {
	public static void main(String[] args) {
		GenerateData input = GenerateData.generateInstance();
		int size = input.generateInteger(ConstantProgramMenuOption.STRUCTURE_SIZE);
		
		StaticQueue<Double> queue = new StaticQueue<>(size, "estructura de cola de enteros");
		
		DoubleQueueProgram program = new DoubleQueueProgram(queue);
		
		program.runProgram(ConstantProgramMenuOption.QUEUE_OPTION_MESSAGE);
	}
}
