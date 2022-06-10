# AldeamoPruebaTecnica

## Proyecto realizado para prueba técnica Aldeamo

En este proyecto podrás encontrar una aplicación que organiza los posibles vasos para que el bar ténder utilice en su trabajo. Al ejecutar este proyecto obtendrá como resultado una lista de números que corresponde a cada vaso que ha sido ordenado mediante el algoritmo.

Puedes realizarlo de la siguiente manera para poder visualizarlo médiente SpringToolSuite

### Requerimientos

deberás descargar e instalar los siguientes programas:
- Descargar e instalar jdk 8 -> [enlace de descarga jdk8](https://www.oracle.com/co/java/technologies/javase/javase8-archive-downloads.html)
- Descargar e instalar SpringToolSuite -> [enlace de descarga Spring](hhttps://spring.io/tools)
- Descargar e instalar git -> [enlace de descarga git](https://git-scm.com/downloads) (opcional)

### Instalación

Luego de tener estos requerimientos puedes:
- Descargar .zip

-- Ir a la ruta del archivo comprimido que descargaste
-- Descomprimir el archivo
-- Abrir SpringToolSuite
--   Presionar el menú **import**
-- Seleccionar la carpeta **Maven**
-- Seleccionar la carpeta **Existing Maven Projects**
-- Buscar el proyecto descargado y presionar finalizar

### Como usarlo

Para correr este proyecto solo basta con ejecutar la clase **main** y consumirlo mediante postman con la siguiente estructura en la ruta *http://localhost:8080/Bartender/buscar/{iteraciones}/{arrayId}* siendo este un **GET Request**
donde el primer número hace referencia a la cantidad de iteraciones y el segundo al id del array que corresponde al script en la base de datos creada mediante el script dado para el desarrollo de este proyecto.

Después de realizar la importación del proyecto podrás visualizar todas sus clases que se encuentran en la carpeta **src** alli encontraras clases (Controller, Service, Dao, Entity y clase principal que ejecuta el proyecto) también podrá visualizar la clase **test** en donde se encuentran las pruebas unitarias de este.

Este proyecto cuenta con una base de datos en memoria mediante la tecnología h2 y podrás visualizar el archivo en la carpeta del proyecto "/data". No es necesario ejecutar ninguna sentencia sql.

### Ayuda

Cualquier inconveniente comunicarse por medio del siguiente correo electrónico.
*josemiguelbf8@gmail.com*
