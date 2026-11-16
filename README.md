# Ordenamiento por Burbuja en Java

Práctica de la Unidad 5, AED-1026 Estructura de Datos
Instituto Tecnológico Superior de Xalapa, Ingeniería en Sistemas Computacionales

**Alumno:** Yael Aminadab Hernández Reyes
**Grupo:** A
**Docente:** Víctor Hugo Vásquez Herrera

Programa en Java que ordena un arreglo de números de menor a mayor con el algoritmo de burbuja (Bubble Sort).

## Requisitos

- Git
- JDK 11 o superior (para revisar: `java -version` y `javac -version`)

## Cómo clonar

```bash
git clone https://github.com/TU-USUARIO/TU-REPOSITORIO.git
cd TU-REPOSITORIO
```

## Cómo compilar

```bash
mkdir out
javac -d out src/estructuras/unidad5/BubbleSort.java
```

## Cómo ejecutar

```bash
java -cp out estructuras.unidad5.BubbleSort
```

También se puede abrir el proyecto en IntelliJ IDEA y ejecutar la clase `BubbleSort` con el botón Run.

## Salida esperada

```
=== Ordenamiento por Burbuja ===
Arreglo original: [64, 34, 25, 12, 22, 11, 90, 5]
Arreglo ordenado: [5, 11, 12, 22, 25, 34, 64, 90]
```

## Estructura del proyecto

```
src/
└── estructuras/
    └── unidad5/
        └── BubbleSort.java
README.md
```