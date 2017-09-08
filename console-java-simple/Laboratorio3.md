# desktop-java-simple

## Laboratorio 3

### ¿Que es una interfaz?
Una interfaz es una colección de metodos abstractos y propiedades constanstes. En lo cual las clases que implementen una interfaz son las que desarrollan el comportamiento de un metodos.

### ¿Que es una clase abstracta?
Una clase abstracta es en la que no se puede instanciar, unicamente se usa para definir las subclases.

### ¿Que diferencia hay entre herencia e interfaces?
En la herencia las clases pueden heredar propiedades y metodos de una clase abstracta, en cambia en la interface se tienen que poner todos los metodos declarados en la interface.

### ¿Cual es la diferencia entre pila, cola y lista?
La lista nos permite almacenar datos de una forma organizada y es una estructura dinamica. Una pila es una estructura de datos en la cual el ultimo elemente en entrar es el primero en salir y una cola el primer elemento en entrar es el primero en salir.










# Developer Workspace

[![Contribute](http://beta.codenvy.com/factory/resources/codenvy-contribute.svg)](http://beta.codenvy.com/f?id=omriatu352kkthua)

# Recipe

FROM [codenvy/ubuntu_jdk8](https://hub.docker.com/r/codenvy/ubuntu_jdk8/)

# Commands

| #       | Command           | 
| :------------- |:------------- |
| 1      | `mvn -f ${current.project.path} clean install && java -jar ${current.project.path}/target/*.jar` |

# App output

App output is streamed into a console. Note that if your app expects user input, do not use command but execute jars in the terminal directly.
