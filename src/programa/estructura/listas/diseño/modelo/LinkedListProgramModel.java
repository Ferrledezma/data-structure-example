package programa.estructura.listas.diseño.modelo;

import estructuras.lineal.listas.LinkedListInterface;
import programa.estructura.listas.service.LinkedListService;
import programa.general.diseño.modelo.ProgramSemiImplModel;
import programa.general.entrada_datos.GenerateData;
/**
 * Clase que define de forma parcial la estructura de un programa para la manipulación un servicio de una estructura de tipo lista enlazada
 * @author Ledezma
 * */
public abstract class LinkedListProgramModel<T> extends ProgramSemiImplModel<T> {
	private LinkedListService<T> linkedListService;
	protected GenerateData input = GenerateData.generateInstance();
	
	public LinkedListProgramModel(LinkedListInterface<T> linkedList) {
		this.linkedListService = new LinkedListService<>(linkedList);
	}
	@Override
	public void structureOptions(int option) {
		T data;
		
		switch(option) {
		case 1:
			data = generateStructureData();
			linkedListService.insertAtFront(data);
			break;
		case 2:
			data = generateStructureData();
			linkedListService.insertAtBack(data);
			break;
		case 3:
			linkedListService.removedFromFront();
			break;
		case 4:
			linkedListService.removedFromBack();
			break;
		case 5:
			linkedListService.size();
			break;
		case 6:
			linkedListService.clear();
			break;
		case 7:
			linkedListService.print();
			break;
		default:
			System.out.println("Invalid option");
		}
	}
}

















