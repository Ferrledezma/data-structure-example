package programa.estructura.arboles.diseño.modelo;

import estructuras.no_lineal.arboles.TreeStructure;
import programa.estructura.arboles.service.TreeService;
import programa.general.constant.ConstantProgramMenuOption;
import programa.general.diseño.modelo.ProgramSemiImplModel;
/**
 * Clase que define de forma parcial la estructura de un programa para manipulación de una estructura de árbol.
 * @author Ledezma
 * */
public abstract class TreeProgramModel<T extends Comparable<T>> extends ProgramSemiImplModel<T> {
	private TreeService<T> treeService;

	public TreeProgramModel(TreeStructure<T> tree) {
		treeService = new TreeService<>(tree);
	}

	@Override
	public void structureOptions(int selectedOption) {
		T data;
		switch(selectedOption) {
		case 1:
			data = generateStructureData();
			treeService.insert(data);
			break;
		case 2:
			data = generateStructureData();
			treeService.search(data);
			break;
		case 3:
			treeService.clear();
			break;
		case 4:
			treeService.size();
			break;
		case 5:
			printOption(ConstantProgramMenuOption.TREE_PRINT_OPTION);
			break;
		}
	}
	
	private void printOption(String message) {
		Integer option = input.generateInteger(message);
		
		final int NUMBER_OF_OPTIONS = countTextDigit(message);
		
		while(option != null && (option > 0 && option < NUMBER_OF_OPTIONS)) {
			if(option == 1)
				treeService.preOrderTraversal();
			else if(option == 2)
				treeService.inOrderTraversal();
			else if(option == 3)
				treeService.postOrderTraversal();
			else
				break;
			
			option = input.generateInteger(message);
		}
	}
}


















