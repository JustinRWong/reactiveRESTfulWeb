# reactiveRESTfulWeb
A basic task list to remind you of what you need to do simply by browsing to http://localhost:8080/Tasks in your web browser. 

This built RESTFUL Web Service is implemented using Maven dependencies, Spring Webflux, and a WebClient consumer of that service. The Spring-boot server continuously makes GET calls for responsive updates from a single text file, called test.txt. Any changes detected will then be served into the Application WebClient hosted at localhost:8080.

If you think reading from a text file, pull so that you can view your reminders in your browser without any distractions. 

In order for this to run, you need Maven and Java SDK installed. 
  1. Pull from repo and run java -version and mvn -version to ensure both are installed correctly. If not, install both   @https://maven.apache.org/install.html and @https://www.java.com/en/download/help/download_options.xml
  2. Once you have all dependecies and you have Java nad Maven installed, navigate to TaskList.txt and modify it however you would like. Add any reminders for fun.
  3. In order to view your Task List, open up the directory in your Terminal and run "mvn compile" to compile the Java code and dependencies.
  4. After compiling, run "mvn spring-boot:run" and view http://localhost:8080/Tasks on any browser.
