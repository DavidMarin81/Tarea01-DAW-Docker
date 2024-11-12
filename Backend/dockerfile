# Usa una imagen base de Java
FROM openjdk:17-jdk-slim

# Establece el directorio de trabajo dentro del contenedor
WORKDIR /app

# Copia el archivo JAR generado a la imagen
COPY target/calculadora-0.0.1-SNAPSHOT.jar /app/calculadora.jar

# Copia la carpeta de recursos para que el JAR pueda acceder a los archivos necesarios
COPY src/main/resources /app/src/main/resources

# Port
EXPOSE 8080

# Especifica el comando para ejecutar la aplicación
ENTRYPOINT ["java", "-jar", "calculadora.jar"]