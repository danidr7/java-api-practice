# java-api-practice

Just a for fun project to practice Java with Spring Boot.
The project purpose is provide a sample http api, saving the data in MongoDB, testing and building a docker image.

## Getting Started

Ensure the prerequisites and run the **make** targets.

### Prerequisites

These tools must be installed:
- [Java](https://www.oracle.com/technetwork/pt/java/javase/downloads/jdk8-downloads-2133151.html)
- [Maven](https://maven.apache.org/)
- [Docker](https://www.docker.com/)
- [Docker Compose](https://docs.docker.com/compose/install/)

### Project Targets


`make build`: Builds a *.jar* on */targets* directory
`make clean`: Removes the */targets* directory
`make start`: Starts the project locally
`make start-mongodb`: Starts a MongoDB container
`make stop-mongodb`: Stops and removes the MongoDB container
`make test`: starts a MongoDB container, test and removes the MongoDB container
`make docker-build`: builds a docker image
`make docker-run`: runs the built image
`make docker-compose-up`: runs the project and the MongoDB with Docker Compose

### Usage Sample

##### Get a saiyajin
```
curl -v 'localhost:11000/saiyajin?name=goku'
```

##### Create a saiyajin
```
curl -0 -v -XPOST -H 'content-type: application/json' \
'localhost:11000/saiyajin' \
-d @- << EOF

{
    "name": "Vegeta",
    "age": 48,
    "maxLevel": 15000,
    "skills": ["Final Flash", "Galick Gun"]
}
EOF
``