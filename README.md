# Sistema de Estacionamiento

Proyecto desarrollado en Java para administrar un estacionamiento representado mediante una matriz de `10 x 10`.

El sistema permite ingresar, buscar y retirar vehiculos, mostrar los espacios disponibles, consultar los ingresos y calcular la ruta mas corta entre la entrada y la salida por el borde exterior.

## Requisitos

Existen dos formas de ejecutar el programa.

### Opcion 1: abrir y compilar el proyecto

Para trabajar con el codigo fuente se necesita:

- Apache NetBeans 28.
- JDK 25.
- Maven, incluido en NetBeans.

### Opcion 2: ejecutar el archivo JAR

Para ejecutar el archivo `.jar` no es necesario instalar NetBeans. Solamente se necesita tener Java 25 instalado y disponible desde la consola.

Puede comprobar la version instalada con:

```bash
java -version
```


### Ejecutar el JAR desde la consola

El repositorio incluye el archivo:

```text
Estacionamiento.jar
```

Abra CMD, PowerShell o Git Bash dentro de la carpeta raiz del proyecto y ejecute:

```bash
java -jar Estacionamiento.jar
```

Este programa debe ejecutarse desde una consola porque solicita datos mediante `Scanner`.

## Uso del programa

Al iniciar se mostrara el siguiente menu:

```text
===== SISTEMA DE ESTACIONAMIENTO =====
1. Ingresar vehiculo
2. Retirar vehiculo
3. Mostrar estacionamiento
4. Buscar vehiculo
5. Mostrar ruta mas corta
6. Mostrar ingresos
7. Salir
```

### 1. Ingresar vehiculo

Solicita:

- Una placa con formato `P###LLL`, por ejemplo `P123ABC`.
- Una fila entre `1` y `8`.
- Una columna entre `1` y `8`.
- El pago de la tarifa de Q10.00.

El sistema comprueba que la placa no este repetida, que la posicion este libre y que el estacionamiento no este lleno.

### 2. Retirar vehiculo

Solicita la placa, busca su posicion y libera el espacio que ocupaba.

### 3. Mostrar estacionamiento

Muestra la matriz completa y la cantidad de espacios libres y ocupados.
#### Simbolos del tablero

| Simbolo | Significado |
| --- | --- |
| `=` | Via exterior |
| `L` | Espacio libre |
| `A` | Espacio ocupado por un automovil |
| `E` | Entrada |
| `S` | Salida |

### 4. Buscar vehiculo

Solicita una placa y muestra la fila y columna donde esta estacionado el vehiculo.

### 5. Mostrar ruta mas corta

Compara las rutas en sentido horario y antihorario entre la entrada y la salida por el borde exterior. Luego recomienda el recorrido con menor cantidad de posiciones.

### 6. Mostrar ingresos

Muestra la cantidad de vehiculos cobrados y el total de ingresos acumulados.

### 7. Salir

Finaliza la ejecucion del programa.

## Extras

- El estacionamiento contiene 64 espacios internos.
- La entrada y la salida se generan aleatoriamente en el borde exterior.
- La informacion se conserva solamente mientras el programa esta ejecutandose.
- El proyecto utiliza vectores y matrices de tamaño fijo.
- No utiliza `ArrayList`, `LinkedList`, `HashMap`, `HashSet`, `Stack`, `Queue` ni otras colecciones dinamicas.