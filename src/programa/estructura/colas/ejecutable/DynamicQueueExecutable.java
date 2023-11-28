package programa.estructura.colas.ejecutable;

import estructuras.lineal.colas.diseño.implementacion.dinamica.DynamicQueue;
import programa.estructura.colas.diseño.implementacion.CharacterQueueProgram;
import programa.general.constant.ConstantProgramMenuOption;

public class DynamicQueueExecutable {
	public static void main(String[] args) {
		DynamicQueue<Character> queue = new DynamicQueue<>();
		
		CharacterQueueProgram program = new CharacterQueueProgram(queue);
		
		program.runProgram(ConstantProgramMenuOption.QUEUE_OPTION_MESSAGE);
	}
}
