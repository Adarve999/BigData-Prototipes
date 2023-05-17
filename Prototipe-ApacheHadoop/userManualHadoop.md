# Hadoop WordCount - Manual del usuario

Este manual de usuario te guiará a través de los pasos para ejecutar un trabajo de conteo de palabras utilizando Apache Hadoop.

## Requisitos previos

1. Tener instalado Apache Hadoop (versión 3.2.4 o posterior).
2. Tener instalado Java JDK 8.
3. Tener configurado el entorno de Hadoop (variables de entorno, archivos de configuración, etc.).

## Proceso

### Paso 1: Crear el proyecto

1. Crear un nuevo proyecto en Apache NetBeans 17.0.
2. Añadir la dependencia de Hadoop al archivo `pom.xml` de tu proyecto.

### Paso 2: Crear la clase WordCount

1. Crear una nueva clase Java llamada `WordCount` en el paquete de tu proyecto.
2. Copiar y pegar el código de la clase `WordCount` proporcionado en este manual.

### Paso 3: Compilar y crear el archivo JAR

1. Ejecutar la acción "Clean and Build" en NetBeans para compilar y empaquetar el proyecto en un archivo JAR.
2. Copiar el archivo JAR generado en la carpeta de tu elección.

### Paso 4: Crear el conjunto de datos de entrada

1. Crear un archivo de texto con datos ficticios para utilizar como entrada en el trabajo de WordCount.
2. Guardar el archivo en una ubicación accesible.

### Paso 5: Ejecutar el trabajo de WordCount en Hadoop

1. Iniciar los servicios de Hadoop ejecutando el comando `start-all.cmd` (en Windows) o `start-all.sh` (en Linux).
2. Subir el archivo de entrada al sistema de archivos distribuido HDFS con el siguiente comando:

```
bin/hadoop fs -put /ruta/local/a/tus/archivos_de_texto/*.txt /input
```

3. Ejecutar el trabajo de WordCount utilizando el siguiente comando:

```
bin/hadoop jar <ruta_del_archivo_JAR>/HadoopWordCount-1.0-SNAPSHOT.jar WordCount /input /output
```

Reemplaza `<ruta_del_archivo_JAR>` con la ruta al archivo JAR generado en el paso 3.

4. Verificar los resultados del trabajo de WordCount ejecutando los siguientes comandos:

```
bin/hadoop fs -cat /output/part-r-00000
```

5. Detener los servicios de Hadoop ejecutando el comando `stop-all.cmd` (en Windows) o `stop-all.sh` (en Linux).
