# Laboratorio-Desarrollo-Dirigido-por-Modelos
Elaborado por: Karen Nathalia Sandoval - Lina Alexandra Diaz

# Descripción
El proyecto es una API REST para la gestión de artículos de investigación. Proporciona endpoints para crear, consultar, listar, actualizar y eliminar artículos. Está desarrollado en Java, utilizando Spring Boot como marco principal, y ScrudBeans para simplificar la integración de modelos y controladores REST.

# Tecnologías Utilizadas
* Spring Boot 3.3.4: Framework para desarrollo de aplicaciones Java.
* ScrudBeans: Librería para reducir la complejidad en la construcción de APIs REST.
* Maven: Herramienta de gestión de dependencias y construcción.
* H2 Database: Base de datos en memoria para pruebas.
* Lombok: Generación automática de código repetitivo como getters, setters y constructores.

# Estructura del Proyecto
El proyecto sigue una arquitectura en capas:

* capaAccesoADatos

Define las entidades y repositorios para la persistencia de datos.
Ejemplo:

ArticuloEntity: Representa un artículo de investigación.

ArticuloRepository: Clase que simula la base de datos mediante una lista en memoria.

fachadaServices

Contiene la interfaz y la implementación del servicio que actúa como intermediario entre los controladores y la capa de acceso a datos.
* capaControladores

Define los controladores REST que manejan las solicitudes HTTP.
Ejemplo: ArticuloRestController

Recursos Externos

Archivo application.properties para la configuración de la base de datos H2.

# Solución al punto 2: 

https://docs.google.com/document/d/1ceyyrP9ILI6WbSpscv6j-FMR-L_J__Vy18IwHKwi-7I/edit?tab=t.0
