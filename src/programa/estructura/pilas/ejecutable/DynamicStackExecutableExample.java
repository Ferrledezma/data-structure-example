package programa.estructura.pilas.ejecutable;

import estructuras.lineal.pilas.diseño.implementacion.dinamica.ordenada.DynamicStackNodeCanBeSort;
import programa.estructura.pilas.diseño.implementacion.ordenada.CharacterStackProgram;
import programa.general.constant.ConstantProgramMenuOption;

public class DynamicStackExecutableExample {

	public static void main(String[] args) {
		//Pila dinámica que se puede ordenar
		DynamicStackNodeCanBeSort<Character> stack = new DynamicStackNodeCanBeSort<>();
		
		CharacterStackProgram program = new CharacterStackProgram(stack);
		
		program.runProgram(ConstantProgramMenuOption.STACK_OPTION_MESSAGE);
		
		/*
		//Pila dinámica que no se puede ordenar
		DynamicStackNodeCannoSort<PersonRecord> stack = new DynamicStackNodeCannoSort<>();
		
		RecordStackProgram program = new RecordStackProgram(stack);
		
		program.runMenu(ConstantProgramMenuOption.STACK_OPTION_MESSAGE); 
		 */
	}

}
