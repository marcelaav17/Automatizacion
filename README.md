Proyecto de Automatización con Screenplay y Gradle

Este proyecto utiliza el patrón de diseño Screenplay junto con Serenity BDD y Gradle para automatizar la interacción con un formulario web. A continuación, se detallan las principales secciones y componentes del proyecto.
Estructura del Proyecto

El proyecto está organizado en las siguientes carpetas:
src/main/java

    models: Contiene la clase Datos, utilizada en las pruebas, con sus respectivos métodos get y set.

    questions: Clases que permiten verificar ciertas condiciones en la aplicación.

    tasks: Clases que describen las tareas y acciones que el usuario realiza en la aplicación.

    userinterfaces: Clases que mapean los elementos de la interfaz de usuario.

    utils: Utilidades y herramientas de apoyo para las pruebas.

src/test/java

    Contiene las clases de pruebas y las definiciones de pasos (step definitions).

src/test/resources

    Contiene los archivos de características (feature files) y cualquier recurso necesario para las pruebas.

Requisitos Previos

Para poder ejecutar este proyecto, asegúrate de tener instalados los siguientes componentes:

    Java JDK 8 o superior
    Gradle
    IntelliJ IDEA o cualquier otro IDE compatible con Java y Gradle

Configuración de WebDriver

El proyecto está configurado para utilizar ChromeDriver por defecto. Puedes cambiar esta configuración editando el archivo serenity.conf o estableciendo las variables de entorno correspondientes.
