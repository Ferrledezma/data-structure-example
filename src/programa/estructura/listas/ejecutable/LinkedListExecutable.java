package programa.estructura.listas.ejecutable;

import estructuras.lineal.listas.LinkedListStructure;
import programa.estructura.listas.diseño.implementacion.IntegerLinkedListProgram;
import programa.general.constant.ConstantProgramMenuOption;

public class LinkedListExecutable {

	public static void main(String[] args) {
		LinkedListStructure<Integer> linkedList = new LinkedListStructure<>();
		IntegerLinkedListProgram program = new IntegerLinkedListProgram(linkedList);
		program.runProgram(ConstantProgramMenuOption.LINKED_LIST_OPTION);
	}

}
