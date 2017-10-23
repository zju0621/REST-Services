
Welcome to the Temperature Conversion Web Application
======================================================

This sample code helps get you started with 
This is a simple web app demonstrating a simple Java web application which handles the conversion of temperature input by user in a web page with a REST service running on Java Web Application server backend.

It is deployed in AWS Elastic Beanstalk at:
http://myrestserviceapp-env.us-east-1.elasticbeanstalk.com/


What's Here
-----------

This sample includes:

* README.md - this file
* pom.xml - this file is the Maven Project Object Model for the web application
* src/ - this directory contains your Java application source files


Getting Started
---------------

To work on the sample code, you'll need to clone your project's repository to your
local computer. 

1. Install maven.  See https://maven.apache.org/install.html for details.
2. Install tomcat.  See https://tomcat.apache.org/tomcat-7.0-doc/setup.html for
   details.
3. Build the application.
        $ mvn -f pom.xml compile
        $ mvn -f pom.xml package
4. Copy the built application to the Tomcat webapp directory.  The actual
   location of that directory will vary depending on your platform and
   installation.
        $ cp target/ROOT.war <tomcat webapp directory>

4. Restart your tomcat server
5. Open http://127.0.0.1:8080/ in a web browser to view your application.

OR you can compile and run the project in Eclipse:
1. Confgiure Tomcat Server in Eclipse
2. Import the project
3. Right the Eclipse project and Run On Server
http://localhost:8080/AppService1/


Implementation Details:
-----------------------

Front End:
HTML / jQuery / DataTable

Back End:
Tomcat / Java Web App (WAR) / Jersey REST service / Jackson JSON processor

Tools:
Maven
Eclipse
Chrome Developer Tools
