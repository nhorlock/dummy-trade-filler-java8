# Dummy Trade Fulfillment Engine

### Outline
This is a simple spring-boot app that will simulate a system that makes trades.

On a timed interval it will read from a MongoDB database. It will look for records that represent Trade objects.

It will mark all records that it finds with state "CREATED" as "PROCESSING".

It will mark all records that it finds with state "PROCESSING" as either "FILLED" or "REJECTED". The decision between "FILLED" and "REJECTED" is completely random.

You may edit the source code as you require to meet the needs of testing and demonstrating your system.

You probably want ot update the Trade model object to match your own design.

### Run
Build on the command line with gradle:
* ./gradlew build

This will put a jar in build/libs/trade-simulator-0.0.1-SNAPSHOT.jar

Run that jar with:
* java -jar build/libs/trade-simulator-0.0.1-SNAPSHOT.jar

OR for example with DEBUG logging and on a different port (8089):
* java -DLOG_LEVEL=DEBUG -DSERVER_PORT=8089 -jar build/libs/trade-simulator-0.0.1-SNAPSHOT.jar


OR just run in VSCode or any other IDE for development

### Docker
There is a Dockerfile included to run as a Docker container.

e.g. to build a container:
* docker build -t trade-sim:0.0.1 .

e.g. to run the built container with DEBUG logging:
* docker run --name trade-sim -e LOG_LEVEL=DEBUG trade-sim:0.0.1 

### Configuration
See the properties file in src/main/resources/application.properties for configurable properties.

Most properties can be overridden by environmental variables.
