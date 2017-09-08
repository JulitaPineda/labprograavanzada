# desktop-java-simple

## Laboratorio 3

### ¿Que es una interfaz?

### ¿Que es una clase abstracta?

### ¿Que diferencia hay entre herencia e interfaces?

### ¿Cual es la diferencia entre pila, cola y lista?










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
