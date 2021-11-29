# Registro-Coto
#Justificación y Problemática

En mi fraccionamiento se paga una cuota mensual de mantenimiento que deben pagar cada propietario, hace unos meses me di cuenta que todo el control y registro de dichos pagos lo realizan a mano en papel, por lo que decidí ofrecerles mi proyecto integrador, ofrecí que utilizando tecnologías actuales se puede mejorar y facilitar ciertas tareas de nuestra vida cotidiana todo esto para hacer más eficiente la labor que tienen las personas encargadas de Tesorería en mi fraccionamiento, también si el proyecto rinde frutos y logra el objetivo de facilitar esta tarea se puede ofrecer también a los fraccionamientos cercanos al mío ya que son de la misma constructora de Parque Arrayanes.
Como noté que no tienen los recursos para conseguir algo parecido ofrecí trabajar mi proyecto integrador para ellos y poder hacer que sea más fácil con la siguiente propuesta:
Les Propuse a las encargadas de tesorería crear un sistema de registros que pueda ayudarles con está tarea de control. El sistema contaría con Altas y Bajas y una revisión mes por mes de cada pago que se realice.

#Arquitectura de la Aplicación

La Arquitectura de la Aplicación constará de tres capas: Vista, Modelo y el Controlador.

Capa 1: Vista
La capa de la vista constará de la Interfaz Gráfica que es la que interactuará directamente con el usuario. El diseño incluye la Interfaz de Login y la Interfaz del menú principal que es donde se realizarán todas las funciones establecidas en los requerimientos del proyecto.

Capa 2: Modelo
El modelo se encargará de cumplir las funciones de los requerimientos de la aplicación.

Cuenta con dos clases POJO:
-	Usuario
-	Registro
Que se encargaran de tener sus getters y setters correspondientes para poder acceder a sus variables desde otras instancias del código de la aplicación.
Cuenta con dos clases Handler que se encargaran de gestionar las funcionalidades y consultas de la base de datos que se utilizará por medio de la clase Conexión que permitirá hacer uso de esta.
La base de datos que se utilizará será MySQL será creada y gestionada con MySQL workbench como servidor local.
La Base de datos consta de 2 tablas:

Tabla Usuarios:
-user VARCHAR(50)
-password VARCHAR(50)
PK(user)

Tabla Registros:
-idRegistro INT NOT NULL AUTO INCREMENT
-casa VARCHAR(3)
-nombre VARCHAR(100)
-cantidad DOUBLE
-concepto VARCHAR(100)
PK(idRegistro)

Capa 3: Controlador
La capa 3 es la que se encarga de comunicar la Capa 1: Vista y la Capa 2: Modelo, de esta manera el usuario podrá efectuar las funciones que requiere y que se solicitaron en los requerimientos.
La aplicación esta siendo creada en el IDE NetBeans, los archivos FORM cumple la función del Controlador por medio de los métodos ActionListener, que se encargaran de conectar las funciones del modelo y la Interfaz del usuario.

#Requerimientos
Base de Datos:
La aplicación requiere un servidor de bases de datos local. 
En la arquitectura de la aplicación se mencionó que se requiere el uso de MySQL para el correcto funcionamiento de la aplicación.

Paquete adicional:
Para que el JAR de la aplicación muestre correctamente las imagenes necesarias del diseño, es necesario agregar junto al JAR el paquete de imagenes.

Java:
Es necesario tener instalado Java 8 en cuarlquier versión para que la aplicación pueda funcionar.

#Instalación:
¿Como Instalar la Aplicación?

