# Calculadora

La aplicación incluye una interfaz gráfica compuesta con con un EditText y con varios botones ordenados en un GridLayout.

Se asigna el comportamiento de cada botón, para eso se define desde el layout la acción de onClick y se sobreescribe el método
onCLick() para cada botón de la calculadora, en el caso de los operadores +,-,*,/,raíz(√),% se definió una variable como identificador de
cada uno.
y se declara un método llamado obtenerResultado que contiene las comparaciones dependiendo del operador el cual se haya asignado, 
realizar la operación correspondiente y mostrar el resultado.

