package week_1_if_else;

public class SetUpInputUtils {
    public static void main(String[] args) {
        // to get user input, use helper library called input-utils
        // IntelliJ uses Maven to get the code for us
        // Maven - Java build tool and dependency management
        // Maven gets 3rd party libraries and makes them available to projects

        // set up details
        String language = "Java";
        String buildSystem = "Maven";
        // advanced settings
        String groupId = "org.example";
        // ArtifactID must be all one word, use camel case or underscore
        // click Create

        // go to pom.xml file // project object model
        // controls how project is compiled and extra libraries needed
        // add dependency tag underneath properties tag

        // <dependencies>
        //    <dependency>
        //        <groupId>edu.minneapolis</groupId>
        //        <artifactId>input-utils</artifactId>
        //        <version>1.0.2</version>
        //    </dependency>
        //</dependencies>

        // click M button in top right of pom.xml to load changes


    }
}
