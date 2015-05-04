# javaee8-mvc-sample

Java EE 8 MVC [JSR-371](https://mvc-spec.java.net) example based on JAX-RS, EJBs and JSPs.

Currently this sample requires a dependency to the Java EE 8 MVC Reference Implementation [ozark](https://ozark.java.net) (see [pom](https://github.com/AdamBien/javaee8-mvc-sample/blob/master/time/pom.xml)) and GlassFish daily [build](http://dlc.sun.com.edgesuite.net/glassfish/4.1/nightly/glassfish-4.1-b13-03_16_2015.zip)

# Installation

Either build the project from sources:

`git clone https://github.com/AdamBien/javaee8-mvc-sample/` and open it with NetBeans, then just “Run” it on GlassFish daily [build](http://dlc.sun.com.edgesuite.net/glassfish/4.1/nightly/glassfish-4.1-b13-03_16_2015.zip)

or deploy the war:

Drop the [time.war](https://github.com/AdamBien/javaee8-mvc-sample/releases/download/v0.0.1/time.war) to glassfish/domains/domain1/autodeploy/ and point the browser to: [http://localhost:8080/time/views/time](http://localhost:8080/time/views/time).


