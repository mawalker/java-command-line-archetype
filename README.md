This 'guide' is for your benefit only for now, is not complete, but might help you out a lot for now, I plan on improving this dramatically here soon. 

To use this project creator you will need these tools:

*   JDK 7 (OpenJDK appears to work fine)

*   Maven 3.1

*   Eclipse (This is actually Optional, but the pom file that will be created will allow easy import of the project into Eclipse if it has the maven plugin.)

  
I have a single archetype created that will provide you everything you will need, including: 
*   pom.xml 
*   folder structure
*   library-dependencies
*   example code

To Install this maven archetype to your local repository (because I haven't yet published this to a public repository), You need to go to the directory **archetypes/base-rest/** and run:

    mvn install

This will allow you to be able to make use of the SchMEAR-base-rest archetype.

This will allow you to run the following command where you wish your new project to be created. You need to edit the command to include the proper groupID (CompanyName/PackageName), and artifactID (ProjectName):


```
    mvn archetype:generate                          \
      -DarchetypeGroupId=com.walkernation           \
      -DarchetypeArtifactId=java-command-line-app   \
      -DarchetypeVersion=1.0-SNAPSHOT               \
      -DinteractiveMode=false                       \
      -DgroupId=<com.mycompany.app>                 \
      -DartifactId=<my-app>
``` 



and paste it into your linux machine's terminal (the '\' makes this all a single line command) and run it. You will now have a working starter project.

The starter project will