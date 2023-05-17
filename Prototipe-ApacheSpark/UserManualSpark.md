# Manual de usuario para el prototipo de Apache Spark en Windows

Este manual de usuario te guiará a través de los pasos necesarios para ejecutar el prototipo de Apache Spark en Windows. Asegúrate de haber seguido el manual de instalación y tener correctamente configuradas todas las dependencias y variables de entorno.

## Paso 1: Preparar los datos de entrada

1. Crea un archivo de texto con el contenido que deseas analizar. Por ejemplo, puedes utilizar el siguiente contenido de muestra:

```
Hola mundo
Hola Apache Spark
Apache Spark es genial
```

En nuestro caso los datos de entrada se encuentra ya predefinidos en el directorio ArchivosEntradaDatos.

2. Guarda el archivo de texto en una ubicación accesible, por ejemplo, `C:\Prototipos\input.txt`.

## Paso 2: Compilar el proyecto

1. Asegúrate de que tu proyecto de Apache Spark tenga todas las dependencias necesarias y el archivo `pom.xml` esté configurado correctamente.
2. Navega a la carpeta del proyecto en la línea de comandos y ejecuta el siguiente comando para compilar el proyecto y generar un archivo JAR:

```
Copiar el jar que esta en la ruta del prototipo en la carpeta target
```

3. Una vez que la compilación haya finalizado, busca el archivo JAR generado en la carpeta `target` de tu proyecto.

## Paso 3: Ejecutar el prototipo de Apache Spark

1. Abre la línea de comandos y navega a la carpeta donde se encuentra el archivo JAR generado en el paso anterior.
2. Ejecuta el siguiente comando para ejecutar el prototipo de Apache Spark, reemplazando `input.txt` por la ruta al archivo de entrada que preparaste en el paso 1 y `outputSpark` por la carpeta donde deseas guardar los resultados:

```
spark-submit --class com.mycompany.sparkwordcount.SparkWordCount --master local[*] SparkWordCount-1.0-SNAPSHOT.jar C:\Prototipos\Archivos\Archivo1.txt C:\Prototipos\outputSpark
```

Asegúrate de reemplazar `<nombre_de_tu_archivo_jar>` con el nombre del archivo JAR generado en el paso 2.

3. Espera a que se complete la ejecución del trabajo de Apache Spark. Verás mensajes en la línea de comandos indicando el progreso del trabajo.

## Paso 4: Verificar los resultados

1. Navega a la carpeta `outputSpark` que especificaste en el paso 3. Deberías ver uno o más archivos con el prefijo `part-` y una extensión `.crc`. Estos archivos contienen los resultados del conteo de palabras.
2. Abre los archivos `part-` con un editor de texto para ver los resultados. Cada línea contendrá una palabra seguida de su conteo en el formato `(palabra, conteo)`.

## Paso 5: visualizado de resultados obtenidos

Para ver el contenido del conteo de palabras del archivo tenemos que leer los archivos de la ruta del output con el prefijo `part-0000X` que sean, aquí hay un ejemplo de muestra:

```
type <ruta donde se ha guardado el output en mi caso (C:\Prototipos\outputSpark)>\part-00000
```

¡Eso es todo! Ahora has ejecutado con éxito el prototipo de Apache Spark en Windows y has visualizado los resultados del conteo de palabras.
