# Sevensenders:Tasks
An selenium based 'Page Factory Model' automation framework for web based tests, which can be extended for API's also if needed.

## Getting Started
These instructions will get you a copy of the project up and running on your local machine for development and testing purposes.

## Prerequisites
What things you need to install the software and how to install them
```
Maven
Java
Eclipse/IntelliJ
Google Chrome
```

## Running the tests
1. Git clone https://github.com/avinpatel29/sevensenders.git
2. Once clone is successful, import the project as “Existing maven project” in IDE (eclipse of IntelliJ)
3. Once the project is imported successfully, you can trigger the API or UI tests by opening the terminal in the IDE and providing below command in the terminal of the IDE:

```
Via Pom.xml:
    mvn clean install -Dcomponent=<component_name> 
    Eg: mvn clean install -Dcomponent=UI 
                (OR)
Via Directly 
    Go to src/test/java/com/komoot/ui/UI_Tests.java
    Right click & click on "Run UI_Test" option
```

<b>Note:</b> Drivers are also included in the project. Chrome driver included in the project is 87.0.x. Please feel free to replace with the version of driver where you want to run the tests.</font>


## Project Structure
As the project is maven based, have followed 'standard' maven project structure as below:

```
src/main/java       - Consists of Page classes & methods
src/main/resources  - Consists of resources utilised by across (such as log4j.properties, setup.properties etc.)   
src/main/test       - Consists of tests to be executed
src/main/resources  - Consists of test data which is required for the tests to run
```

## Built With
* Dependency Management - [Maven](https://maven.apache.org/)  
* Web framework used    - Selenium WebDriver + PageFactory Model
* Testing tool          - [TestNG](https://testng.org/doc/)
* Logging               - [Log4J](https://logging.apache.org/log4j/2.x/)
