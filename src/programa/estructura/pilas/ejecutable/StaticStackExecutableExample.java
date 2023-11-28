package programa.estructura.pilas.ejecutable;

import estructuras.lineal.pilas.diseño.implementacion.estatica.desordenada.StaticStackCannotSort;
import programa.estructura.pilas.diseño.implementacion.desordenada.StringStackProgram;
import programa.general.constant.ConstantProgramMenuOption;
import programa.general.entrada_datos.GenerateData;

public class StaticStackExecutableExample {

	public static void main(String[] args) {
		//Pila estática que no se puede ordenar
		GenerateData input = GenerateData.generateInstance();
		int size = input.generateInteger(ConstantProgramMenuOption.STRUCTURE_SIZE);
		
		StaticStackCannotSort<String> stack = new StaticStackCannotSort<>(size);
		
		StringStackProgram program = new StringStackProgram(stack);
		
		program.runProgram(ConstantProgramMenuOption.STACK_OPTION_MESSAGE);
		
		/*
		//Pila estática que se puede ordenar
		GenerateData input = GenerateData.generateInstance();
		int size = input.generateInteger(ConstantProgramMenuOption.STACK_SIZE_MESSAGE);
		
		StaticStackCanBeSort<Integer> stack = new StaticStackCanBeSort<>(size);
		
		IntegerStackProgram program = new IntegerStackProgram(stack);
		
		program.runMenu(ConstantProgramMenuOption.STACK_OPTION_MESSAGE);
		*/
	}

}
