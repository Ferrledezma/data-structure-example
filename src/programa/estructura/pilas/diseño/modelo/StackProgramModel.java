	
package programa.estructura.pilas.diseño.modelo;

import estructuras.lineal.pilas.diseño.modelo.StackInterface;
import general.constant.ConstantSort;
import programa.estructura.pilas.service.StackService;
import programa.general.constant.ConstantProgramMenuOption;
import programa.general.diseño.modelo.ProgramSemiImplModel;
/**
 * Clase que implementa de forma parcial la estructura de un programa para la manipulación un servicio de una estructura de pila.
 *  @author Ledezma
 * */
public abstract class StackProgramModel<T> extends ProgramSemiImplModel<T> {
	protected StackService<T> stackService;
	
	public StackProgramModel(StackInterface<T> stack) {
		this.stackService = new StackService<>(stack);
	}
	
	@Override
	public void structureOptions(int selectedOption) {
		switch(selectedOption) {
		case 1 :
			T data = generateStructureData();
			stackService.push(data);
			break;
		case 2 :
			stackService.pop();
			break;
		case 3 :
			stackService.size();
			break;
		case 4 :
			stackService.clear();;
			break;
		case 5 :
			sortOption(ConstantProgramMenuOption.SORT_MESSAGE);
			break;
		case 6 :
			stackService.print();
			break;
		}
	}
	
	private void sortOption(String message) {
		Integer option = input.generateInteger(message);
		
		final int NUMBER_OF_OPTIONS = countTextDigit(message);
		
		if(option != null && (option > 0 && option < NUMBER_OF_OPTIONS)) {
			String sort = "";
			if(option == 1)
				sort = ConstantSort.SORT_FROM_UPWARD;
			else if(option == 2)
				sort = ConstantSort.SORT_FROM_DESCENDING;
			
			stackService.sort(sort);
		} else {
			System.out.println("Not valid option");
		}
	}
}
















