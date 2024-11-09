# Usa la imagen oficial de OpenJDK
FROM openjdk:11

# Copia el archivo Java al contenedor
COPY EvenOddCheck.java /EvenOddCheck.java

# Compila el archivo Java
RUN javac /EvenOddCheck.java

# Ejecuta el programa
CMD ["java", "EvenOddCheck"]
