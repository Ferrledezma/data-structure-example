# data-structure-example
Ejemplo de implementación y manejo de estructuras de datos lineales como pila, cola, lista enlaza, y de no lineales como árboles de búsqueda binaria implementados 
con java 11.

## Ejecución
#Ejecución del programa del proyecto.
Para ejecutar el proyecto se debe ir a la carpeta programa/estructura/'tipo de estructura'/ejecutable y buscar el tipo de estructura de dato que se desea ejecutar,
el cual ejecuta un programa de consola para manipular la estructura de datos indicada.

## Uso
# Cómo funciona un programa.
Los distintos programas de las estructuras de datos se encuentran dentro de la carpeta programa seguido por el tipo de estructura de dato. Cada estructura de datos 
contiene la implementación de un programa para cada estructura de dato seleccionada. Por ejemplo, si desea ejecutar una lista enlazada
esta contendrá un programa que ejecutará una lista enlazada. Estos programas se encuentran dentro de la carpeta programa/estructura/'Tipo de estructuctura'/diseño,
más precisamente en la carpeta diseño/modelo diseño/implementación. La carpeta diseño/modelo contiene un modelo abstracto del programa y la carpeta implementación
contiene la implementación completa del programa con el tipo de dato exacto de la estructura y el tipo de dato exacto que implementará la estructura de dato.
Esto es importante ya que si se desea agregar nuevos tipos de datos para se ejecuten en el programa se deberán crear nuevas clases capaces de implementar de forma
esos tipos de datos. Cabe destacar que las estructuras de datos que ejecutan estos programas son tipo genérico, es decir, aceptan cualquier tipo de dato.
Pero la implementación final de un programa no es genérica, entonces el tipo de dato debe ser claro y coherente.

# Crear nuevos tipos de programa
Para crear programas que acepten otros tipos de datos además de los que está definidos por defecto en las carpetas diseño/implementación, se deberá crear en esa misma
carpeta una clase que extienda a la clase del programa que se encuentra en la carpeta diseño/modelo. Una vez creada esta clase se recomienda modificar la clase de entrada
de datos llamada GenerateData que se encuentra en la carpeta programa/general/entrada_datos y agregar un método que retorne el tipo de dato que se quiera ingresar.
Una vez hecho estas modificaciones, en la clase creada implemente el diseño del método abstracto donde su retorno utilice el método creado en la clase GenerateData.
Una vez hecho debe modificar la clase ejecutable que se encuentra en la carpeta programa/estructura/'tipo de estructura'/ejecutable y instanciar una estructura con el tipo
de dato que desea ejecutar y con el correspondiente programa capacitado para manipular el tipo de dato de tal estructura






