![](https://cloud.githubusercontent.com/assets/110953/7877439/6a69d03e-0590-11e5-9fac-c614246606de.png) 
## Spring Framework with Polymer 

> A starting point for building web applications with Polymer 1.0 and Spring Framework

### Some Inclusive Things

* Polymer 1.0
* [Material Design](http://www.google.com/design/spec/material-design/introduction.html) layout 
* Routing with [Page.js](https://visionmedia.github.io/page.js/) for Client side
* Spring Framework 4.0
* Rest API
* End-to-end Build Tooling (including [Vulcanize](https://github.com/Polymer/vulcanize))




### Getting Started with Spring and Tomcat

1. Get a copy of the code.
2. Install the dependencies if you don't already have them. (need Maven pre-installed)
    
   ```sh
   npm install -g bower && bower install
   ```
   
   ```sh
   mvn clean package
   ```
    
3. Modify the application to your liking.
4. Deploy and run your production code.

```sh
java -jar target/dependency/webapp-runner.jar target/spring-poly.war
```


## Getting Started with Node

1. Get a copy of the code.
2. Install the dependencies if you don't already have them.
    
   ```sh
   npm install -g gulp bower && npm install && bower install
   ```
    
3. Modify the application to your liking.
4. Deploy and run your production code.

```sh
gulp serve
```


### ( Enjoy!! )
