SHELL = /bin/sh

all: install

install:
	mvn install

clean:
	rm -r ./target/

start:
	mvn spring-boot:run