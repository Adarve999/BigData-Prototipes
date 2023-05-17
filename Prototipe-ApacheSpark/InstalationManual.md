# Manual de instalación de Apache Spark en Windows

## Requisitos previos

1. Java Development Kit (JDK) 8 o superior.
2. Scala
3. Apache Spark
4. Variables de entorno correctamente configuradas (JAVA_HOME, SCALA_HOME y SPARK_HOME).

## Paso 1: Instalar Java Development Kit (JDK)

1. Ve al sitio web oficial de Oracle [aquí](https://www.oracle.com/java/technologies/javase/javase-jdk8-downloads.html) y descarga la última versión del JDK 8.
2. Ejecuta el instalador y sigue las instrucciones para instalar el JDK en tu sistema.
3. Configura la variable de entorno JAVA_HOME siguiendo [estos pasos](https://www.baeldung.com/java-home-on-windows-7-8-10-mac-os-x-linux).

## Paso 2: Instalar Scala

1. Ve al sitio web oficial de Scala [aquí](https://www.scala-lang.org/download/) y descarga la última versión de Scala.
2. Ejecuta el instalador y sigue las instrucciones para instalar Scala en tu sistema.
3. Configura la variable de entorno SCALA_HOME siguiendo [estos pasos](https://www.tutorialkart.com/scala/scala-environment-setup/).

## Paso 3: Instalar Apache Spark

1. Ve al sitio web oficial de Apache Spark [aquí](https://spark.apache.org/downloads.html) y descarga la última versión de Apache Spark.
2. Descomprime el archivo descargado en un directorio de tu elección, por ejemplo, `C:\spark`.
3. Configura la variable de entorno SPARK_HOME siguiendo [estos pasos](https://bigdata-world.net/how-to-install-apache-spark-on-windows/).

## Paso 4: Configurar las variables de entorno

1. Abre el cuadro de diálogo "Propiedades del sistema" haciendo clic derecho en "Equipo" en el escritorio o en el Explorador de archivos y seleccionando "Propiedades".
2. Haz clic en "Configuración avanzada del sistema" en el panel izquierdo.
3. Haz clic en el botón "Variables de entorno..." en la pestaña "Avanzado".
4. En la sección "Variables del sistema", busca la variable "Path" y selecciónala.
5. Haz clic en el botón "Editar...".
6. Añade las siguientes rutas al final de la lista de rutas, separadas por punto y coma:

```
%JAVA_HOME%\bin;%SCALA_HOME%\bin;%SPARK_HOME%\bin;%SPARK_HOME%\sbin
```

7. Haz clic en "Aceptar" en cada cuadro de diálogo abierto para guardar los cambios y cerrarlos.

## Paso 5: Verificar la instalación

1. Abre la línea de comandos (CMD) y ejecuta los siguientes comandos para verificar que las instalaciones y las variables de entorno estén configuradas correctamente:

```
java -version
scala -version
spark-submit --version
```

Si todos los comandos muestran información sobre las versiones instaladas, la instalación y configuración de Apache Spark, Java y Scala se ha realizado correctamente.
