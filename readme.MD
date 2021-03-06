**Martian Robots:**

This solution is written in Java & built using Gradle.
Unit tests are created using JUnit

**How To Run:**
1. Download the code
2. Execute `./gradlew clean build` in the project directory
3. Execute `java -jar .\build\libs\RBCodingChallenge-1.0.jar`

**How To Run Tests:**
1. Execute `.\gradlew clean test`

**How To Generate Code Coverage Report**
1. Execute `.\gradlew clean build jacocoTestReport`
2. Go to `\build\reports\jacoco\test\html` and view the index.html
3. Click into default to view code coverage report for the project


**The Problem:**

The surface of Mars can be modelled by a rectangular grid around which robots are able to
move according to instructions provided from Earth. You are to write a program that
determines each sequence of robot positions and reports the final position of the robot.

In Hindsight:
- Better type safety for Instructions (abstract `instruction` with specific instruction as implementations for example)
- Abstraction for Robot to seperate different types of robots (if required)
- `CurrentPosition` would be better suited as a Coordinate object that stores X and Y int values rather than storing them in an int array
- Increase code coverage % for edge cases & scent logic

Troubleshooting:
- If the project fails to build, you may need to download IntelliJ IDE (or equivalent) and manually change the JDK version to 17 & the Gradle version to 7.0.1
