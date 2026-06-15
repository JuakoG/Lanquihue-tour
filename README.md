 Duoc UC 

 Autor del Proyecto

**Nombre completo:** Joaquin Antonio Gonzalez Quezada
**Sección:** DESARROLLO ORIENTADO A OBJETOS I_001A
**Carrera:** Analista Programador Computacional
**Sede:** Campus Virtual

---

#  Descripción general del sistema

Este proyecto corresponde a un sistema que fue desarrollado para la empresa Llanquihue Tour con el objetivo de apoyar la gestión de tours turísticos mediante una aplicación desarrollada en Java.

 La aplicación permite registrar, administrar y filtrar información relacionada con los tours ofrecidos por la empresa. Además, utiliza un archivo de texto (.txt) como fuente de datos, el cual es leído por el sistema para cargar y mantener actualizada la información utilizada durante la ejecución.

Para su desarrollo se aplicaron conceptos fundamentales de la Programación Orientada a Objetos, tales como encapsulamiento, reutilización de código, organización por paquetes y separación de responsabilidades.

---

# Estructura de carpetas

 
  ```text
LlanquihueTourApp
|
+-- src
|   +-- data
|   |   +-- GestorDatos.java
|   |
|   +-- model
|   |   +-- Tour.java
|   |
|   +-- ui
|       +-- Main.java
|
+-- resources
|   +-- tours.txt
|
+-- nbproject
+-- build
+-- manifest.mf
+-- build.xml
```



### Archivo de datos

La carpeta resources contiene el archivo de texto utilizado por el sistema para cargar la información de los tours. Este archivo es leído por la clase GestorDatos, permitiendo mantener la información disponible durante la ejecución de la aplicación.



### Clases implementadas


1- Tour

Representa un tour turístico.
 Contiene la información asociada a cada tour.

2- GestorDatos


Gestiona la lectura y almacenamiento de datos utilizados por el sistema.
Permite cargar información desde un archivo de texto.

3- Main


 Clase principal de la aplicación.
Contiene el método main() que inicia la ejecución del programa y coordina las operaciones necesarias para la carga, visualización y filtrado de la información de los tours.


 Instrucciones para ejecutar la clase Main
 

1. Clonar el repositorio desde GitHub:

bash

git clone https://github.com/JuakoG/llanquihue-tour-.git


2. Abrir el proyecto en NetBeans.

3. Verificar que el JDK esté configurado correctamente.

4. Ubicar la clase principal:

text

src/ui/Main.java


5. Ejecutar la clase Main.java.
6. 

7. Observar los resultados generados en la consola.


 Repositorio GitHub

https://github.com/JuakoG/llanquihue-tour-


© Duoc UC | Escuela de Informática y Telecomunicaciones
