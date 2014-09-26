# The SCAPE Simulation environment 

The SCAPE simulation environment is divided into two independent projects: 

* simulation engine 
* eclipse plugin

## simulation engine

simulation engine provides a simple, generic discrete event simulation engine 

### Requirements 
* Maven 3 

To create a package withouth dependencies run

 ```shell
mvn clean install 
 ```

To create a package with all the dependencies included run

 ```shell
mvn assembly:assembly 
 ```

## eclipse plugin 

Eclipse plugin project contains a plguin which implements the domain specific language for 
repository simulation 

### Requirements 
* Eclipse IDE for Java and DSL Developers (tested on Eclipse Kepler https://www.eclipse.org/downloads/packages/eclipse-ide-java-and-dsl-developers/keplersr2)
* XText (part of the Eclipse IDE for Java and DSL Developers)
* Maven 3 

 
