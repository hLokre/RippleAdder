RippleAdder is the main directory containing project files and JAVA is used for implementation.
The output release shared lib is in JAR format (Found in RippleAdder/out/artifacts/RippleAdder_jar/RippleAdder.jar)

Build environment used:

JDK : jdk1.8.0_102

JRE : jre1.8.0_152

Junit : junit-4.12

IDE used : IntelliJ

Shared lib format: jar

Project structure:

RippleAdder is the name of project, source code can be found under "src" directory and following java package structure used.

    com.himanshu.adder          :contains Adder(Ripple, Full and Half) implementation and main driver class.
    
    com.himanshu.adder.gates    :contains logic gate implementations.
    
    com.himanshu.test           :contains junit test classes for Adders and main test runner/suite class.
    
    com.himanshu.test.gates     :contains junit test classes for Gates.

Opening project in IntelliJ: Open the project by choosing "open" and then opening "RippleAdder" directory.

How to run :

Method 1. Using IntelliJ IDE

From menu

    run> "AdderMain" to run the main program.
    
        This will display options in terminal and you can type (1 or 2) to perform the Rippler adder addition (choice 1).
        OR run the junit tests in this mode (choice 2).
        
    run > "test runner" to run only Junit test cases.


Method 2. Running JAR directly

Using terminal run commmand "java -jar path/to/RippleAdder.jar"

For ex: "java -jar RippleAdder/out/artifacts/RippleAdder_jar/RippleAdder.jar"

This will display options in terminal and you can type (1 or 2) to perform the Ripple adder addition (choice 1).
OR run the junit tests in this mode (choice 2).
