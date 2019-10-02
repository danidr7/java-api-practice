SHELL = /bin/sh

build:
	mvn install -DskipTests

clean:
	rm -r ./target/

start:
	mvn spring-boot:run

start-mongodb:
	docker run --name mongo -d -p 27017:27017 mongo
	/bin/sleep 3

stop-mongodb:
	docker rm -f mongo

test: start-mongodb
	mvn test
	$(MAKE) stop-mongodb

docker-build:
	docker build -t java-api .

docker-run: docker-build
	docker run --name java-api -p 11000:11000 java-api

docker-compose-up:
	docker-compose up