package programa.general.diseño.modelo;

import programa.general.entrada_datos.GenerateData;
/**
 * Clase que implementa de forma parcial la estructura de programa de manipulación de estructuras de datos.
 * @author Ledezma
 * */
public abstract class ProgramSemiImplModel<T> implements ProgramInterface<T> {
	protected GenerateData input = GenerateData.generateInstance();
	
	@Override
	public void runProgram(String message) {
		Integer option = input.generateInteger(message);
		
		final int NUMBER_OF_OPTIONS = countTextDigit(message);
		
		while(option != null && (option > 0 && option < NUMBER_OF_OPTIONS)) {
			
			structureOptions(option);
			
			option = input.generateInteger(message);
		}
		
		programClosingMessage(option, NUMBER_OF_OPTIONS);
	}
	
	@Override
	public void programClosingMessage(Integer option, Integer numberOptions) {
		String finalMessage = "";
		
		if(option == null)
			finalMessage = "\nNull data is not valid";
		else if(option >= numberOptions || option < 0)
			finalMessage = option.toString().concat(" is invalid option");
		else {
			finalMessage = "\nexit program";
		}
		
		System.out.println(finalMessage);
	}
	
	@Override
	public int countTextDigit(String text) {
		return (int) text.chars().filter(Character::isDigit).count();
	}
}

















