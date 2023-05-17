# Manual de Instalación y Configuración de Apache Hadoop

## Introducción

Este manual de instalación y configuración proporciona información sobre cómo instalar y configurar Apache Hadoop para utilizarlo en el repositorio [https://gitlab.com/dt2023g03/tg3](https://gitlab.com/dt2023g03/tg3).

## Requisitos previos

1. Asegúrese de tener instalado Java JDK 8 en su sistema. Para verificar si tiene Java instalado, ejecute el siguiente comando en la terminal:

```
java -version
```

Si no tiene Java instalado, descargue e instale el JDK 8 desde [aquí](https://www.oracle.com/java/technologies/javase/javase8-archive-downloads.html).

2. Descargue Apache Hadoop desde [https://hadoop.apache.org/releases.html](https://hadoop.apache.org/releases.html). Elija la versión que mejor se adapte a sus necesidades (se recomienda la versión 3.2.4). Descomprima el archivo descargado en una carpeta de su elección.

## Instalación y configuración de Hadoop

1. **Establecer las variables de entorno**: Antes de instalar Apache Hadoop, necesitarás tener Java instalado en tu sistema. Si no lo tienes instalado, puedes descargar la última versión de Java desde el sitio web oficial de Java.

Después de instalar Java y Hadoop, asegúrate de establecer las variables de entorno necesarias en Windows. Para hacer esto, sigue los pasos a continuación:

* En variables de usuario:

```
 JAVA_HOME: C:\Java\jdk<version>\bin
 HADOOP_HOME: C:\hadoop-<version>\bin
```

* Agrega la siguiente línea al archivo `PATH` en las variables de entorno del sistema:

```
C:\hadoop-<version>\sbin
C:\hadoop-<version>\bin
C:\Java\jdk<version>\bin
```

2. **Configurar Hadoop**: En la carpeta `etc/hadoop` dentro de su instalación de Hadoop, modifique los siguientes archivos:

* `core-site.xml`: Agregue la siguiente configuración entre las etiquetas `<configuration></configuration>`:

  ```
  <property>
    <name>fs.defaultFS</name>
    <value>hdfs://localhost:9000</value>
  </property>
  ```

* `hadoop-env.cmd`: Agregue la siguiente configuración en la variable JAVA_HOME (linea 25):

  ```
  JAVA_HOME=C:\Java\jdk<version>
  ```

* `hdfs-site.xml`: Agregue la siguiente configuración entre las etiquetas `<configuration></configuration>`:

  ```
  en la carpeta de /hadop-<version>/data hay que crear dos carpetas llamadas namenode y datanode.
  ```

  ```
  <property>
  <name>dfs.replication</name>
  <value>1</value>
  </property>
  <property>
  <name>dfs.namenode.name.dir</name>
  <value>C:\hadoop-<version>\data\namenode</value>
  </property>
  <property>
  <name>dfs.datanode.data.dir</name>
  <value>C:\hadoop-<version>\data\datanode</value>
  </property>
  ```

* `mapred-site.xml`:agregue la siguiente configuración entre las etiquetas `<configuration></configuration>`:

  ```
  <property>
    <name>mapreduce.framework.name</name>
    <value>yarn</value>
  </property>
  ```

* `yarn-site.xml`: Agregue la siguiente configuración entre las etiquetas `<configuration></configuration>`:

  ```
  <property>
  <name>yarn.nodemanager.aux-services</name>
  <value>mapreduce_shuffle</value>
  </property>
  <property>
  <name>yarn.nodemanager.auxservices.mapreduce.shuffle.class</name>
  <value>org.apache.hadoop.mapred.ShuffleHandler</value>
  </property>
  ```

3. **Fix carpeta bin de Hadoop**: Sigue las siguientes instrucciones para arreglar la carpeta bin de Hadoop:
Lo primero de todo es borrar la carpeta bin de hadoop y luego bajarnos el fichero que se obtiene [aquí](https://drive.google.com/file/d/1nCN_jK7EJF2DmPUUxgOggnvJ6k6tksYz/view).Una vez descargado, descomprimimos el fichero y lo copiamos en la carpeta de hadoop sustituyendo la carpeta bin que hemos borrado.

4. **Iniciar Hadoop**: Ejecute los siguientes comandos para iniciar los servicios de Hadoop:

```
hdfs namenode –format (SOLO LA PRIMERA VEZ) 
start-all.cmd
```

5. **Verificar el estado de Hadoop**: Abra un navegador web e ingrese la siguiente URL para verificar el estado de su instalación de Hadoop:
<http://localhost:9870>
<http://localhost:8088>

Debería ver la interfaz web de Hadoop HDFS en su navegador. Si aparece, significa que su instalación de Hadoop está funcionando correctamente.
