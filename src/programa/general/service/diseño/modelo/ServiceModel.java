package programa.general.service.diseño.modelo;

import estructuras.lineal.diseño.modelo.StructureInterface;
import general.constant.ConstantStructureErrorMessage;
import general.constant.ConstantStructureMessage;
import general.constant.ConstantStructureName;
import general.exception.EmptyStructureException;
/**
 * Clase que contiene el diseño básico del servicio para la manipulación de una estructura lineal.
 * @author Ledezma
 * */
public abstract class ServiceModel {
	private StructureInterface structure;

	public ServiceModel(StructureInterface structure) {
		this.structure = structure;
	}

	/**
	 * Método de minipulación de estructura que vacía la estructura y muestra un mensaje.
	 * */
	public void clear() {
		try {
			structure.clear();
			
			if(structure.isEmpty())
				System.out.println(String.format(ConstantStructureMessage.EMPTY_STRUCTURE, ConstantStructureName.DEFAULT_STRUCTURE_NAME));
			else
				System.out.println(String.format(ConstantStructureErrorMessage.EMPTY_STRUCTURE_ERROR, ConstantStructureName.DEFAULT_STRUCTURE_NAME));
		} catch (EmptyStructureException e) {
			System.err.println(e.getMessage());
		}
	}
	
	/*
	 * Método de manipulación de la estructura que muestra un mensaje con el tamaño de la estructura.
	 * */
	public void size() {
		int size = structure.size();
		System.out.println(String.format(ConstantStructureMessage.SIZE, ConstantStructureName.DEFAULT_STRUCTURE_NAME, size));
	}
	
	/**
	 * Método de manipulación de la estructura que muestra los datos insertados en la estructura
	 * */
	public void print() {
		System.out.println(String.format(ConstantStructureMessage.PRINT_ELEMENTS, ConstantStructureName.DEFAULT_STRUCTURE_NAME));
		structure.print();
	}
}
















