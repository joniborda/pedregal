Construyendo una casa en un pedregal
Contribución de Laura Rivero y Gustavo Dejean

Descripción del problema
Un excéntrico propietario ha decidido

construir su casa en un pedregal. Para de-
terminar una posible ubicación de su casa,

cuadricula el terreno en DX por DY casille-
ros, de manera tal que cada peñasco impor-
tante del terreno puede registrarse en un

casillero. Su casa deberá ser de planta
rectangular de F cuadrículas de frente por L
cuadrículas de profundidad, y debe ser
construida sin tener que quitar ningún
peñasco del terreno.
El propietario desea saber si es o no
factible construir la casa. Si es factible,
quiere establecer una posible ubicación y
orientación para la misma. Para ayudarlo en
esta tarea, se te pide que escribas un
programa pedregal.cpp, pedregal.c

o pedregal.pas que en caso de ser facti-
ble, muestre alguna de las ubicaciones posi-
bles para la casa; en este caso, además, se

desea conocer su posible orientación, de
acuerdo a la disposición de la puerta. Ésta

estará ubicada en uno de los lados de longi-
tud F (línea gruesa en el dibujo). En caso

de no ser factible, simplemente indique al
propietario que no es posible.
N
S
O E

1
2
3
4
5
6

CASA

1 2 3 4 56 789
Datos de entrada
Se recibe un archivo pedregal.in del
directorio actual, que contiene:
• Primera línea: Las dimensiones DX y DY
( 1 ≤ DX, DY ≤ 1000 ) del terreno, separadas
por un blanco.

• Segunda línea: Las dimensiones de la
casa F y L ( 1 ≤ L ≤ F ≤ 100 ), separadas
por un blanco.
• Tercera línea: P ( 1 ≤ P ≤ 1000 ), el
número de peñascos.
• Y las P líneas siguientes con la fila y la
columna de cada cuadrícula conteniendo
un peñasco, separadas por un blanco.
Datos de salida
El programa debe generar el archivo
pedregal.out, en el directorio actual, con:
• Una PRIMERA línea indicando SI, si es
posible construir la casa, o NO si no es
posible.
• En caso de contestar SI, agregar:
• Una SEGUNDA línea conteniendo el
número de fila y columna del casillero,
ocupada por la casa, que tenga la menor
fila y la menor columna. Fila y columna
deben separarse por un blanco.
• Una TERCERA línea indicando la
orientación de la casa (N, S, E, O), de
acuerdo a su puerta de entrada.
Ejemplo
Si el archivo pedregal.in contiene:
9 6
3 2
10
1 1
1 6
2 1
2 3
5 1
5 5
6 2
7 3
7 5
9 1

El archivo pedregal.out podría con-
tener:

SI
3 2
S
