# **Java Even/Odd Checker**

**`README.md` para `java-even-odd`**


# Java Even/Odd Checker

Este repositorio contiene un programa en Java que verifica si un número dado es par o impar.

## Descripción

El programa toma un número entero y verifica si es par o impar. Si el número es divisible por 2, es par; si no, es impar.

## Requisitos

- **Lenguaje**: Java 11
- **Requisitos**: JDK 11

## Cómo Clonar y Ejecutar

Para clonar este repositorio en tu máquina local, usa los siguientes comandos:

```bash
git clone https://github.com/<tu-usuario>/java-even-odd.git
cd java-even-odd
```
Para ejecutar el programa, usa:

```bash
javac EvenOddCheck.java
java EvenOddCheck
```

## Dockerización
**Paso 1: Construir la Imagen Docker**

```bash
docker build -t java-even-odd .
```
**Paso 2: Etiquetar la Imagen**

```bash
docker tag java-even-odd <tu-usuario>/java-even-odd:latest
```
**Paso 3: Subir la Imagen a Docker Hub**

```bash
docker push <tu-usuario>/java-even-odd:latest
```
## Enlace al Docker Hub
Java Even/Odd Checker en Docker Hub(https://hub.docker.com/repository/docker/alex8991/java-even-odd/general)

### Licencia
Este repositorio está disponible bajo la Licencia MIT.

*Recuerda reemplazar `<tu-usuario>` con tu nombre de usuario de GitHub o Docker Hub. Este archivo `README.md` proporciona todos los pasos e información necesaria para clonar, ejecutar, y dockerizar el proyecto.*




# **Java Even/Odd Checker**

**`README.md` for `java-even-odd`**

## Java Even/Odd Checker

This repository contains a Java program that checks if a given number is even or odd.

## Description

The program takes an integer and checks if it is even or odd. If the number is divisible by 2, it is even; if not, it is odd.

## Requirements

- **Language**: Java 11
- **Requirements**: JDK 11

## How to Clone and Run

To clone this repository to your local machine, use the following commands:

```bash
git clone https://github.com/<your-user>/java-even-odd.git
cd java-even-odd
```
To run the program, use:

```bash
javac EvenOddCheck.java
java EvenOddCheck
```

## Dockerization
**Step 1: Build the Docker Image**

```bash
docker build -t java-even-odd .
```
**Step 2: Tag the Image**

```bash
docker tag java-even-odd <your-user>/java-even-odd:latest
```
**Step 3: Push the Image to Docker Hub**

```bash
docker push <your-user>/java-even-odd:latest
```
### Link to Docker Hub
Java Even/Odd Checker on Docker Hub (https://hub.docker.com/repository/docker/alex8991/java-even-odd/general)

### License
This repository is available under the MIT License.

*Remember to replace `<your-user>` with your GitHub or Docker Hub username. This `README.md` file provides all the steps and information needed to clone, run, and dockerize the project.*
