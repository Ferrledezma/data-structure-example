package programa.estructura.colas.diseño.modelo;

import estructuras.lineal.colas.diseño.modelo.QueueInterface;
import programa.estructura.colas.service.QueueService;
import programa.general.diseño.modelo.ProgramSemiImplModel;
/**
 * Clase que define la implementación parcial de un programa para la manipulación un servicio de una estructura de datos de tipo Colas.
 * @author Ledezma
 * */
public abstract class QueueProgramModel<T> extends ProgramSemiImplModel<T> {
	private QueueService<T> queueService;

	public QueueProgramModel(QueueInterface<T> queue) {
		queueService = new QueueService<>(queue);
	}
	
	@Override
	public void structureOptions(int selectedOption) {
		switch(selectedOption) {
		case 1:
			T data = generateStructureData();
			queueService.enqueue(data);
			break;
		case 2:
			queueService.dequeue();
			break;
		case 3:
			queueService.clear();
			break;
		case 4:
			queueService.size();
			break;
		case 5:
			queueService.print();
			break;
		}
	}
}
